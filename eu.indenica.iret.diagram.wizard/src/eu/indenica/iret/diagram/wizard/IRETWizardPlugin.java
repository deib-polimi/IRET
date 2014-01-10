/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL Ð Politecnico di Milano
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
package eu.indenica.iret.diagram.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class IRETWizardPlugin extends AbstractUIPlugin {
	List<IPropertyChangeListener> listeners;
	
	// The plug-in ID
	public static final String PLUGIN_ID = "eu.indenica.iret.diagram.viewwizard"; //$NON-NLS-1$

	// The shared instance
	private static IRETWizardPlugin plugin;
	
	/**
	 * The constructor
	 */
	public IRETWizardPlugin() {
		listeners = new ArrayList<IPropertyChangeListener>();
		System.out.println("Executed the activator!!");
	}

	public void addPropertyChangeListener(IPropertyChangeListener listener){
		if(!listeners.contains(listener)){
			listeners.contains(listener);
		}
	}
	
	public void removePropertyChangeListener(IPropertyChangeListener listener){
		if(listeners.contains(listener)){
			listeners.remove(listener);
		}
	}
	
	protected void fire(String propertyId, Object object){
		for(IPropertyChangeListener listener : listeners){
			listener.propertyChange(new PropertyChangeEvent(this, propertyId, null, object));
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("executed the activator");
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static IRETWizardPlugin getDefault() {
		return plugin;
	}

}
