/*
 * generated by Xtext 2.19.0
 */
package de.fraunhofer.ipa.componentInterface.ui;

import com.google.inject.Injector;
import de.fraunhofer.ipa.componentInterface.xtext.ui.internal.XtextActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ComponentInterfaceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XtextActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.DE_FRAUNHOFER_IPA_COMPONENTINTERFACE_COMPONENTINTERFACE) : null;
	}

}
