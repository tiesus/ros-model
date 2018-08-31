/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.seronetgw.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SeronetGwGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (node : resource.allContents.toIterable.filter(RosGateway)){
			fsa.generateFile("gateway.rosartifact",node.compile)
			}
		}
	
	def CharSequence compile(RosGateway gateway)'''
Artifact hola { node Node { name Gateway_node 
	publisher {
	«FOR pub : gateway.rosTopicSubscriber»
		Publisher { name «pub.name» message "«pub.message.package.name».«pub.message.name»" }
    «ENDFOR»
}}}
	'''
	
	
}