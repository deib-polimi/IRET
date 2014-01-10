/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL - Politecnico di Milano
 *  
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *  
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package eu.indenica.iret.diagram.similarity;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;

import java.io.File;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;

import org.eclipse.core.internal.resources.ProjectInfo;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import eu.indenica.iret.diagram.wizard.beans.SimilarityAssessor;
import eu.indenica.iret.diagram.wizard.beans.WordNotFoundException;

public class ConfidenceLogic {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(ConfidenceLogic.class);
	
	

	Integer ConfidenceIndex=0;
	String s1,s2;
	SimilarityAssessor _assessor=new SimilarityAssessor();

	@SuppressWarnings("deprecation")
	public ConfidenceLogic(){
		//org.apache.log4j.PropertyConfigurator.configure(new File(".").getAbsolutePath()+"/log4j/log4j.properties");
		//org.apache.log4j.PropertyConfigurator.configure(new File(".").getAbsolutePath()+"/log4j/log4j.properties");
		  
		ConsoleAppender console = new ConsoleAppender(); //create appender
		  String PATTERN = "%d [%p|%c|%C{1}] %m%n";
		  console.setLayout(new PatternLayout(PATTERN)); 
		  console.setThreshold(Priority.DEBUG);
		  console.activateOptions();

		 // Logger.getRootLogger().addAppender(console);
		  
		 System.out.println("BASILIO "+ResourcesPlugin.getWorkspace().getRoot());

		  FileAppender fa = new FileAppender();
		  fa.setName("FileLogger");
		  fa.setFile(ResourcesPlugin.getWorkspace().getRoot()+"/CONFIDENCELOGIC.log");
		  fa.setThreshold(Priority.DEBUG);
		  fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
		  fa.setAppend(true);
		  fa.activateOptions();

		  Logger.getRootLogger().addAppender(fa);
	}

	public Integer getConfidenceIndexITA(String n1, String n2){
		if (logger.isDebugEnabled()) {
			logger.debug("getConfidenceIndexITA(String, String) - start");
		}

		this.s1 =n1.trim().toLowerCase().replaceAll(" ", "");
		this.s2 =n2.trim().toLowerCase().replaceAll(" ", "");
		String sA, sB, sP;

		if(s1.length()<=s2.length()) {
			sA=s1;
			sB=s2;
		}
		else
		{
			sB=s1;
			sA=s2;

		}

		double num=0, numI=0, numF=0;
		double den=sB.length();
		double perc=0.0;
		int a=0;

		int ce = sB.indexOf(sA);


		num=sA.length();

		if(ce<0){
			sP=sA;
			for(a=0; a<sP.length(); a++) {
				sP=removeCharAt(sP,a);
				if(sB.indexOf(sP)>=0){
					numI=sP.length();
					break;
				}
			}
			sP=sA;
			for(a=0; a<sP.length(); a++) {
				sP=removeCharAt(sP,sP.length()-1);
				if(sB.indexOf(sP)>=0){
					numF=sP.length();
					break;
				}
			}						

			if(numI>numF)
				num=numI;
			else
				num=numF;

		}



		perc=num/den;



		NumberFormat defaultFormat = NumberFormat.getNumberInstance();
		defaultFormat.setMinimumFractionDigits(2);

		Double _ConfidenceIndex;
		try{
			_ConfidenceIndex=Double.valueOf(defaultFormat.format(perc));
		}catch(NumberFormatException e){
			logger.error("getConfidenceIndexITA(String, String)", e);

			_ConfidenceIndex=Double.valueOf(defaultFormat.format(perc).replace(",", "."));
		}
		ConfidenceIndex=(int) (_ConfidenceIndex*100);

		if (logger.isDebugEnabled()) {
			logger.debug("getConfidenceIndexITA(String, String) - end");
		}
		return ConfidenceIndex;
	}

	public Integer getConfidenceIndex(String n1, String n2){
		if (logger.isDebugEnabled()) {
			logger.debug("getConfidenceIndex(String, String) - start");
		}

		this.s1 =n1.trim();
		this.s2 =n2.trim();
		String[] ls1;
		String[] ls2;
		ArrayList<Double> sim_array = new ArrayList<Double>();
		double perc=0.0;
		double p_perc=0.0;
		double sum_perc = 0.0;
		int p=0;
		int s=0;
		int sf=1;
		
		try
		{
			s1=splitCamelCase(s1);
			s2=splitCamelCase(s2);


			ls1=s1.trim().split(" ");
			ls2=s2.trim().split(" ");

			
			for(p=0;p<ls1.length;p++)
			{
				sim_array.clear();
				for(s=0;s<ls2.length;s++)
				{try{
					p_perc=_assessor.getSimilarity (ls1[p], ls2[s]);
				}catch (WordNotFoundException wnfe){
					if (logger.isDebugEnabled()) {
						logger.debug(ls1[p]+","+ ls2[s]+" - "+wnfe.getMessage());
					}
					
				}
				
				if (logger.isDebugEnabled()) {
						logger.debug("getConfidenceIndex("+ls1[p]+","+ ls2[s]+")");
					}
					/*if(p_perc==1.0 && p==s) {
						sim_array.add(p_perc);
						if (logger.isDebugEnabled()) {
							logger.debug("(p_perc==1.0 && p==s) is true");
						}
					}*/
					
					sim_array.add(p_perc);
				}
				
				for(int x=0;x<sim_array.size();x++)
				{
					Double d = sim_array.get(x);
					sum_perc+=d;
					if (logger.isDebugEnabled()) {
						logger.debug("sim_array.get(x)="+d);
					}
					
				}
				perc+=sum_perc/sim_array.size();
			}
			
			

			
			//perc=sum_perc/(ls1.length+ls1.length)*2;
			

			NumberFormat defaultFormat = NumberFormat.getNumberInstance();
			defaultFormat.setMinimumFractionDigits(2);

			Double _ConfidenceIndex;
			try{
				_ConfidenceIndex=Double.valueOf(defaultFormat.format(perc));
			}catch(NumberFormatException e){
				logger.error("getConfidenceIndex(String, String)", e);

				_ConfidenceIndex=Double.valueOf(defaultFormat.format(perc).replace(",", "."));
			}
			ConfidenceIndex=(int) (_ConfidenceIndex*100);

		}
		catch ( Exception ex )
		{
			logger.error("getConfidenceIndex(String, String)", ex);

			ex.printStackTrace ();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getConfidenceIndex(String, String) - end");
		}
		return ConfidenceIndex;
	}

	public static String removeCharAt(String s, int pos) {
		if (logger.isDebugEnabled()) {
			logger.debug("removeCharAt(String, int) - start");
		}

		StringBuffer buf = new StringBuffer( s.length() - 1 );
		buf.append( s.substring(0,pos) ).append( s.substring(pos+1) );
		String returnString = buf.toString();
		if (logger.isDebugEnabled()) {
			logger.debug("removeCharAt(String, int) - end");
		}
		return returnString;
	}

	static String splitCamelCase(String s) {
		if (logger.isDebugEnabled()) {
			logger.debug("splitCamelCase(String) - start");
		}

		String returnString = s.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
		if (logger.isDebugEnabled()) {
			logger.debug("splitCamelCase(String) - end");
		}
		return returnString;
	}



}



