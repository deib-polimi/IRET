package eu.indenica.iret.diagram.wizard.beans;

import org.apache.log4j.Logger;

import java.io.IOException ;
import java.net.URL;

import org.apache.lucene.analysis.WhitespaceAnalyzer ;
import org.apache.lucene.queryParser.ParseException ;
import org.apache.lucene.queryParser.QueryParser ;
import org.apache.lucene.search.Hits ;
import org.apache.lucene.search.IndexSearcher ;
import org.apache.lucene.search.Query ;
import org.apache.lucene.search.Searcher ;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;




/**
 *
 * <p>Title: Java WordNet Similarity</p>
 * <p>Description: Assesses the semantic similarity between a pair of words
 * as described in Seco, N., Veale, T., Hayes, J. (2004) "An Intrinsic Information
 * Content Metric for Semantic Similarity in WordNet". In Proceedings of the
 * European Conference of Artificial Intelligence </p>
 * <p>This Class interfaces with the index files facilitating word and synset
 * lookups </p>
 * <p>Copyright: Nuno Seco Copyright (c) 2004</p>
 * @author Nuno Seco
 * @version 1.0
 */


public class IndexBroker
{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(IndexBroker.class);

	/**
	 * A static constant that represents the field name that
	 * holds the offset value of each document.
	 */
	public static final String SYNSET = "synset" ;




	/**
	 * A static constant that represents the field name that
	 * holds the list of words of each document.
	 */
	public static final String WORDS = "word" ;




	/**
	 * A static constant that represents the field name that
	 * holds the list of hypernym offsets of each document. This list also
	 * contains the offset of the documented in which it is contained.
	 */
	public static final String HYPERNYM = "hypernym" ;




	/**
	 * A static constant that represents the field name that
	 * holds the information Content value of each document.
	 */
	public static final String INFORMATION_CONTENT = "ic" ;




	/**
	 * The directory where the broker will look for the Lucene index.
	 */
	//private final String INDEX_DIR = "/projects/indenica/eu.indenica.iret.diagram.wizard/word_db" ;




	/**
	 * Holds a reference to an instance of a Searcher that
	 * allows searches to be conducted in the opened index.
	 */
	private Searcher _searcher ;




	/**
	 * Holds a reference to an instance of a Parser; a parser
	 * parses the query.
	 */
	private QueryParser _parser ;




	/**
	 * A static reference to an instance of an Index Broker.
	 * This variable guarantees that only one instance of the broker
	 * will be allowed for each Java Virtual Machine launched.
	 */
	private static IndexBroker _instance ;




	/**
	 * The Constructor. Has private access to allow the implementation
	 * of the singleton design pattern. Points the searcher to the index
	 * directory, sets the default field to lookup and the defualt operator
	 * that is to be assumed when more than one token is given.
	 */
	private IndexBroker ()
	{
		if (logger.isDebugEnabled()) {
			logger.debug("IndexBroker() - start");
		}

		Bundle bundle = Platform.getBundle("eu.indenica.iret.diagram.wizard");
		IPath p=new Path("word_db");
		if (logger.isInfoEnabled()) {
			logger.info("word_db - "
					+ p.toString());
		}
		String wndir = null;
		URL url;
		try {		  
			url= FileLocator.find(bundle,p,null);
			wndir=FileLocator.resolve(url).getPath();
		} catch (Throwable e) {
			logger.error("IndexBroker()", e);

			// TODO Auto-generated catch block
			//e.printStackTrace();
			//MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error: the WordNet database file is not available", e.getMessage());
			wndir="word_db";
			
		}

		// wndir="word_db";

		try
		{
			_searcher = new IndexSearcher ( wndir ) ;
			_parser = new QueryParser ( WORDS , new WhitespaceAnalyzer () ) ;
			_parser.setDefaultOperator ( QueryParser.AND_OPERATOR ) ;

		}
		catch ( Throwable ex )
		{
			logger.error("IndexBroker()", ex);

			ex.printStackTrace () ;
			System.err.println ( "" ) ;
			System.err.println ( "Please place the " + wndir + " in the working directory." ) ;
		}

		if (logger.isDebugEnabled()) {
			logger.debug("IndexBroker() - end");
		}
	}




	/**
	 * Static method that allows other objects to aquire
	 * a reference to an existing broker. If no broker exists
	 * than a new one is created.
	 * @return IndexBroker
	 */
	public static IndexBroker getInstance ()
	{
		if ( _instance == null )
		{
			_instance = new IndexBroker () ;
		}

		return _instance ;
	}




	/**
	 * Returns the list of documents that fulfill the given query.
	 * @param query String  The query to be searched
	 * @return Hits  A list of hits
	 */
	public Hits getHits ( String query )
	{
		Query q ;
		try
		{
			q = _parser.parse ( query ) ;
			return _searcher.search ( q ) ;
		}
		catch ( ParseException ex )
		{
			ex.printStackTrace () ;
		}
		catch ( IOException ex )
		{
			ex.printStackTrace () ;
		}
		return null ;
	}

}
