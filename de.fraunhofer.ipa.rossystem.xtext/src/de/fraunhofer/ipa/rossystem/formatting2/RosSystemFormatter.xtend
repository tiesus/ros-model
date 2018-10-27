/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import rossystem.RosSystem
import rossystem.ServiceConnection
import rossystem.TopicConnection

class RosSystemFormatter extends AbstractFormatter2 {
	
	@Inject extension RosSystemGrammarAccess

	def dispatch void format(RosSystem rosSystem, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TopicConnection topicConnection : rosSystem.getTopicConnections()) {
			topicConnection.format;
		}
		for (ServiceConnection serviceConnection : rosSystem.getServiceConnections()) {
			serviceConnection.format;
		}
	}
	
	// TODO: implement for 
}
