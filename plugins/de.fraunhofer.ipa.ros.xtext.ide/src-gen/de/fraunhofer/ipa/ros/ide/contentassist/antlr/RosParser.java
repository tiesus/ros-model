/*
 * generated by Xtext 2.20.0
 */
package de.fraunhofer.ipa.ros.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.ros.ide.contentassist.antlr.internal.InternalRosParser;
import de.fraunhofer.ipa.ros.services.RosGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RosParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RosGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RosGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackageAccess().getAlternatives(), "rule__Package__Alternatives");
			builder.put(grammarAccess.getSpecBaseAccess().getAlternatives(), "rule__SpecBase__Alternatives");
			builder.put(grammarAccess.getDependencyAccess().getAlternatives(), "rule__Dependency__Alternatives");
			builder.put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getRosNamesAccess().getAlternatives(), "rule__RosNames__Alternatives");
			builder.put(grammarAccess.getTopicSpecAccess().getNameAlternatives_2_0(), "rule__TopicSpec__NameAlternatives_2_0");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
			builder.put(grammarAccess.getMessagePartAccess().getDataAlternatives_1_0(), "rule__MessagePart__DataAlternatives_1_0");
			builder.put(grammarAccess.getAbstractTypeAccess().getAlternatives(), "rule__AbstractType__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getPackageSetAccess().getGroup(), "rule__PackageSet__Group__0");
			builder.put(grammarAccess.getPackageSetAccess().getGroup_3(), "rule__PackageSet__Group_3__0");
			builder.put(grammarAccess.getPackageSetAccess().getGroup_3_3(), "rule__PackageSet__Group_3_3__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup(), "rule__Package_Impl__Group__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_4(), "rule__Package_Impl__Group_4__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_4_3(), "rule__Package_Impl__Group_4_3__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_5(), "rule__Package_Impl__Group_5__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_5_3(), "rule__Package_Impl__Group_5_3__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup(), "rule__Artifact__Group__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_4(), "rule__Artifact__Group_4__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup(), "rule__CatkinPackage__Group__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_4(), "rule__CatkinPackage__Group_4__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_4_3(), "rule__CatkinPackage__Group_4_3__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_5(), "rule__CatkinPackage__Group_5__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_5_3(), "rule__CatkinPackage__Group_5_3__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_6(), "rule__CatkinPackage__Group_6__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_6_3(), "rule__CatkinPackage__Group_6_3__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup(), "rule__ServiceSpec__Group__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup_4(), "rule__ServiceSpec__Group_4__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup_5(), "rule__ServiceSpec__Group_5__0");
			builder.put(grammarAccess.getTopicSpecAccess().getGroup(), "rule__TopicSpec__Group__0");
			builder.put(grammarAccess.getTopicSpecAccess().getGroup_4(), "rule__TopicSpec__Group_4__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup(), "rule__ActionSpec__Group__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_4(), "rule__ActionSpec__Group_4__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_5(), "rule__ActionSpec__Group_5__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_6(), "rule__ActionSpec__Group_6__0");
			builder.put(grammarAccess.getMessageDefinitionAccess().getGroup(), "rule__MessageDefinition__Group__0");
			builder.put(grammarAccess.getMessageDefinitionAccess().getGroup_2(), "rule__MessageDefinition__Group_2__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_4(), "rule__Node__Group_4__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_4_3(), "rule__Node__Group_4_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_5(), "rule__Node__Group_5__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_5_3(), "rule__Node__Group_5_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_6(), "rule__Node__Group_6__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_6_3(), "rule__Node__Group_6_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_7(), "rule__Node__Group_7__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_7_3(), "rule__Node__Group_7_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_8(), "rule__Node__Group_8__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_8_3(), "rule__Node__Group_8_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_9(), "rule__Node__Group_9__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_9_3(), "rule__Node__Group_9_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_10(), "rule__Node__Group_10__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_10_3(), "rule__Node__Group_10_3__0");
			builder.put(grammarAccess.getServiceServerAccess().getGroup(), "rule__ServiceServer__Group__0");
			builder.put(grammarAccess.getServiceServerAccess().getGroup_6(), "rule__ServiceServer__Group_6__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup(), "rule__Publisher__Group__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup_6(), "rule__Publisher__Group_6__0");
			builder.put(grammarAccess.getSubscriberAccess().getGroup(), "rule__Subscriber__Group__0");
			builder.put(grammarAccess.getSubscriberAccess().getGroup_6(), "rule__Subscriber__Group_6__0");
			builder.put(grammarAccess.getServiceClientAccess().getGroup(), "rule__ServiceClient__Group__0");
			builder.put(grammarAccess.getServiceClientAccess().getGroup_6(), "rule__ServiceClient__Group_6__0");
			builder.put(grammarAccess.getActionServerAccess().getGroup(), "rule__ActionServer__Group__0");
			builder.put(grammarAccess.getActionServerAccess().getGroup_6(), "rule__ActionServer__Group_6__0");
			builder.put(grammarAccess.getActionClientAccess().getGroup(), "rule__ActionClient__Group__0");
			builder.put(grammarAccess.getActionClientAccess().getGroup_6(), "rule__ActionClient__Group_6__0");
			builder.put(grammarAccess.getPackageDependencyAccess().getGroup(), "rule__PackageDependency__Group__0");
			builder.put(grammarAccess.getExternalDependencyAccess().getGroup(), "rule__ExternalDependency__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_3(), "rule__GlobalNamespace__Group_3__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3(), "rule__GlobalNamespace__Group_3_3__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3(), "rule__RelativeNamespace_Impl__Group_3__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3(), "rule__RelativeNamespace_Impl__Group_3_3__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_3(), "rule__PrivateNamespace__Group_3__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3(), "rule__PrivateNamespace__Group_3_3__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup(), "rule__ParameterListType__Group__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_3(), "rule__ParameterListType__Group_3__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_3_3(), "rule__ParameterListType__Group_3_3__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_4(), "rule__ParameterListType__Group_4__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup(), "rule__ParameterStructType__Group__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup_3(), "rule__ParameterStructType__Group_3__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup_3_3(), "rule__ParameterStructType__Group_3_3__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup(), "rule__ParameterIntegerType__Group__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup_3(), "rule__ParameterIntegerType__Group_3__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup(), "rule__ParameterStringType__Group__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup_3(), "rule__ParameterStringType__Group_3__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup(), "rule__ParameterDoubleType__Group__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup_3(), "rule__ParameterDoubleType__Group_3__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup(), "rule__ParameterDateType__Group__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup_3(), "rule__ParameterDateType__Group_3__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup(), "rule__ParameterBooleanType__Group__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup_3(), "rule__ParameterBooleanType__Group_3__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup(), "rule__ParameterBase64Type__Group__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup_3(), "rule__ParameterBase64Type__Group_3__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup(), "rule__ParameterAnyType__Group__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup_3(), "rule__ParameterAnyType__Group_3__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup(), "rule__ParameterArrayType__Group__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup_4(), "rule__ParameterArrayType__Group_4__0");
			builder.put(grammarAccess.getParameterSequenceAccess().getGroup(), "rule__ParameterSequence__Group__0");
			builder.put(grammarAccess.getParameterSequenceAccess().getGroup_1(), "rule__ParameterSequence__Group_1__0");
			builder.put(grammarAccess.getParameterSequenceAccess().getGroup_1_2(), "rule__ParameterSequence__Group_1_2__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup(), "rule__ParameterAny__Group__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup_3(), "rule__ParameterAny__Group_3__0");
			builder.put(grammarAccess.getParameterIntegerAccess().getGroup(), "rule__ParameterInteger__Group__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup(), "rule__ParameterStruct__Group__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_3(), "rule__ParameterStruct__Group_3__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_3_3(), "rule__ParameterStruct__Group_3_3__0");
			builder.put(grammarAccess.getParameterDateAccess().getGroup(), "rule__ParameterDate__Group__0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getGroup(), "rule__ParameterStructMember__Group__0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getGroup(), "rule__ParameterStructTypeMember__Group__0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getGroup_5(), "rule__ParameterStructTypeMember__Group_5__0");
			builder.put(grammarAccess.getMessagePartAccess().getGroup(), "rule__MessagePart__Group__0");
			builder.put(grammarAccess.getBoolAccess().getGroup(), "rule__Bool__Group__0");
			builder.put(grammarAccess.getInt8Access().getGroup(), "rule__Int8__Group__0");
			builder.put(grammarAccess.getUint8Access().getGroup(), "rule__Uint8__Group__0");
			builder.put(grammarAccess.getInt16Access().getGroup(), "rule__Int16__Group__0");
			builder.put(grammarAccess.getUint16Access().getGroup(), "rule__Uint16__Group__0");
			builder.put(grammarAccess.getInt32Access().getGroup(), "rule__Int32__Group__0");
			builder.put(grammarAccess.getUint32Access().getGroup(), "rule__Uint32__Group__0");
			builder.put(grammarAccess.getInt64Access().getGroup(), "rule__Int64__Group__0");
			builder.put(grammarAccess.getUint64Access().getGroup(), "rule__Uint64__Group__0");
			builder.put(grammarAccess.getFloat32Access().getGroup(), "rule__Float32__Group__0");
			builder.put(grammarAccess.getFloat64Access().getGroup(), "rule__Float64__Group__0");
			builder.put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
			builder.put(grammarAccess.getByteAccess().getGroup(), "rule__Byte__Group__0");
			builder.put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getBoolArrayAccess().getGroup(), "rule__BoolArray__Group__0");
			builder.put(grammarAccess.getInt8ArrayAccess().getGroup(), "rule__Int8Array__Group__0");
			builder.put(grammarAccess.getUint8ArrayAccess().getGroup(), "rule__Uint8Array__Group__0");
			builder.put(grammarAccess.getInt16ArrayAccess().getGroup(), "rule__Int16Array__Group__0");
			builder.put(grammarAccess.getUint16ArrayAccess().getGroup(), "rule__Uint16Array__Group__0");
			builder.put(grammarAccess.getInt32ArrayAccess().getGroup(), "rule__Int32Array__Group__0");
			builder.put(grammarAccess.getUint32ArrayAccess().getGroup(), "rule__Uint32Array__Group__0");
			builder.put(grammarAccess.getInt64ArrayAccess().getGroup(), "rule__Int64Array__Group__0");
			builder.put(grammarAccess.getUint64ArrayAccess().getGroup(), "rule__Uint64Array__Group__0");
			builder.put(grammarAccess.getFloat32ArrayAccess().getGroup(), "rule__Float32Array__Group__0");
			builder.put(grammarAccess.getFloat64ArrayAccess().getGroup(), "rule__Float64Array__Group__0");
			builder.put(grammarAccess.getString0ArrayAccess().getGroup(), "rule__String0Array__Group__0");
			builder.put(grammarAccess.getByteArrayAccess().getGroup(), "rule__ByteArray__Group__0");
			builder.put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
			builder.put(grammarAccess.getArrayTopicSpecRefAccess().getGroup(), "rule__ArrayTopicSpecRef__Group__0");
			builder.put(grammarAccess.getPackageSetAccess().getPackageAssignment_3_2(), "rule__PackageSet__PackageAssignment_3_2");
			builder.put(grammarAccess.getPackageSetAccess().getPackageAssignment_3_3_1(), "rule__PackageSet__PackageAssignment_3_3_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getNameAssignment_2(), "rule__Package_Impl__NameAssignment_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_4_2(), "rule__Package_Impl__SpecAssignment_4_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_4_3_1(), "rule__Package_Impl__SpecAssignment_4_3_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getArtifactAssignment_5_2(), "rule__Package_Impl__ArtifactAssignment_5_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getArtifactAssignment_5_3_1(), "rule__Package_Impl__ArtifactAssignment_5_3_1");
			builder.put(grammarAccess.getArtifactAccess().getNameAssignment_2(), "rule__Artifact__NameAssignment_2");
			builder.put(grammarAccess.getArtifactAccess().getNodeAssignment_4_1(), "rule__Artifact__NodeAssignment_4_1");
			builder.put(grammarAccess.getCatkinPackageAccess().getNameAssignment_2(), "rule__CatkinPackage__NameAssignment_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getSpecAssignment_4_2(), "rule__CatkinPackage__SpecAssignment_4_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getSpecAssignment_4_3_1(), "rule__CatkinPackage__SpecAssignment_4_3_1");
			builder.put(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_2(), "rule__CatkinPackage__ArtifactAssignment_5_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_3_1(), "rule__CatkinPackage__ArtifactAssignment_5_3_1");
			builder.put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_2(), "rule__CatkinPackage__DependencyAssignment_6_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_3_1(), "rule__CatkinPackage__DependencyAssignment_6_3_1");
			builder.put(grammarAccess.getServiceSpecAccess().getNameAssignment_2(), "rule__ServiceSpec__NameAssignment_2");
			builder.put(grammarAccess.getServiceSpecAccess().getRequestAssignment_4_1(), "rule__ServiceSpec__RequestAssignment_4_1");
			builder.put(grammarAccess.getServiceSpecAccess().getResponseAssignment_5_1(), "rule__ServiceSpec__ResponseAssignment_5_1");
			builder.put(grammarAccess.getTopicSpecAccess().getNameAssignment_2(), "rule__TopicSpec__NameAssignment_2");
			builder.put(grammarAccess.getTopicSpecAccess().getMessageAssignment_4_1(), "rule__TopicSpec__MessageAssignment_4_1");
			builder.put(grammarAccess.getActionSpecAccess().getNameAssignment_2(), "rule__ActionSpec__NameAssignment_2");
			builder.put(grammarAccess.getActionSpecAccess().getGoalAssignment_4_1(), "rule__ActionSpec__GoalAssignment_4_1");
			builder.put(grammarAccess.getActionSpecAccess().getResultAssignment_5_1(), "rule__ActionSpec__ResultAssignment_5_1");
			builder.put(grammarAccess.getActionSpecAccess().getFeedbackAssignment_6_1(), "rule__ActionSpec__FeedbackAssignment_6_1");
			builder.put(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_2_0(), "rule__MessageDefinition__MessagePartAssignment_2_0");
			builder.put(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_2_1(), "rule__MessageDefinition__MessagePartAssignment_2_1");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_3(), "rule__Node__NameAssignment_3");
			builder.put(grammarAccess.getNodeAccess().getServiceserverAssignment_4_2(), "rule__Node__ServiceserverAssignment_4_2");
			builder.put(grammarAccess.getNodeAccess().getServiceserverAssignment_4_3_1(), "rule__Node__ServiceserverAssignment_4_3_1");
			builder.put(grammarAccess.getNodeAccess().getPublisherAssignment_5_2(), "rule__Node__PublisherAssignment_5_2");
			builder.put(grammarAccess.getNodeAccess().getPublisherAssignment_5_3_1(), "rule__Node__PublisherAssignment_5_3_1");
			builder.put(grammarAccess.getNodeAccess().getSubscriberAssignment_6_2(), "rule__Node__SubscriberAssignment_6_2");
			builder.put(grammarAccess.getNodeAccess().getSubscriberAssignment_6_3_1(), "rule__Node__SubscriberAssignment_6_3_1");
			builder.put(grammarAccess.getNodeAccess().getServiceclientAssignment_7_2(), "rule__Node__ServiceclientAssignment_7_2");
			builder.put(grammarAccess.getNodeAccess().getServiceclientAssignment_7_3_1(), "rule__Node__ServiceclientAssignment_7_3_1");
			builder.put(grammarAccess.getNodeAccess().getActionserverAssignment_8_2(), "rule__Node__ActionserverAssignment_8_2");
			builder.put(grammarAccess.getNodeAccess().getActionserverAssignment_8_3_1(), "rule__Node__ActionserverAssignment_8_3_1");
			builder.put(grammarAccess.getNodeAccess().getActionclientAssignment_9_2(), "rule__Node__ActionclientAssignment_9_2");
			builder.put(grammarAccess.getNodeAccess().getActionclientAssignment_9_3_1(), "rule__Node__ActionclientAssignment_9_3_1");
			builder.put(grammarAccess.getNodeAccess().getParameterAssignment_10_2(), "rule__Node__ParameterAssignment_10_2");
			builder.put(grammarAccess.getNodeAccess().getParameterAssignment_10_3_1(), "rule__Node__ParameterAssignment_10_3_1");
			builder.put(grammarAccess.getServiceServerAccess().getNameAssignment_3(), "rule__ServiceServer__NameAssignment_3");
			builder.put(grammarAccess.getServiceServerAccess().getServiceAssignment_5(), "rule__ServiceServer__ServiceAssignment_5");
			builder.put(grammarAccess.getServiceServerAccess().getNamespaceAssignment_6_1(), "rule__ServiceServer__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getPublisherAccess().getNameAssignment_3(), "rule__Publisher__NameAssignment_3");
			builder.put(grammarAccess.getPublisherAccess().getMessageAssignment_5(), "rule__Publisher__MessageAssignment_5");
			builder.put(grammarAccess.getPublisherAccess().getNamespaceAssignment_6_1(), "rule__Publisher__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getSubscriberAccess().getNameAssignment_3(), "rule__Subscriber__NameAssignment_3");
			builder.put(grammarAccess.getSubscriberAccess().getMessageAssignment_5(), "rule__Subscriber__MessageAssignment_5");
			builder.put(grammarAccess.getSubscriberAccess().getNamespaceAssignment_6_1(), "rule__Subscriber__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getServiceClientAccess().getNameAssignment_3(), "rule__ServiceClient__NameAssignment_3");
			builder.put(grammarAccess.getServiceClientAccess().getServiceAssignment_5(), "rule__ServiceClient__ServiceAssignment_5");
			builder.put(grammarAccess.getServiceClientAccess().getNamespaceAssignment_6_1(), "rule__ServiceClient__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getActionServerAccess().getNameAssignment_3(), "rule__ActionServer__NameAssignment_3");
			builder.put(grammarAccess.getActionServerAccess().getActionAssignment_5(), "rule__ActionServer__ActionAssignment_5");
			builder.put(grammarAccess.getActionServerAccess().getNamespaceAssignment_6_1(), "rule__ActionServer__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getActionClientAccess().getNameAssignment_3(), "rule__ActionClient__NameAssignment_3");
			builder.put(grammarAccess.getActionClientAccess().getActionAssignment_5(), "rule__ActionClient__ActionAssignment_5");
			builder.put(grammarAccess.getActionClientAccess().getNamespaceAssignment_6_1(), "rule__ActionClient__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getPackageDependencyAccess().getPackageAssignment_3(), "rule__PackageDependency__PackageAssignment_3");
			builder.put(grammarAccess.getExternalDependencyAccess().getNameAssignment_2(), "rule__ExternalDependency__NameAssignment_2");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2(), "rule__GlobalNamespace__PartsAssignment_3_2");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1(), "rule__GlobalNamespace__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2(), "rule__RelativeNamespace_Impl__PartsAssignment_3_2");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1(), "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2(), "rule__PrivateNamespace__PartsAssignment_3_2");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1(), "rule__PrivateNamespace__PartsAssignment_3_3_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
			builder.put(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1(), "rule__Parameter__NamespaceAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_6(), "rule__Parameter__TypeAssignment_6");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3_2(), "rule__ParameterListType__SequenceAssignment_3_2");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3_3_1(), "rule__ParameterListType__SequenceAssignment_3_3_1");
			builder.put(grammarAccess.getParameterListTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterListType__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3_2(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3_2");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3_3_1(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3_3_1");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterIntegerType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterStringType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterDoubleType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterDateTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterDateType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterBooleanType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_3_1(), "rule__ParameterBase64Type__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterAnyType__DefaultAssignment_3_1");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3(), "rule__ParameterArrayType__TypeAssignment_3");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterArrayType__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterSequenceAccess().getValueAssignment_1_1(), "rule__ParameterSequence__ValueAssignment_1_1");
			builder.put(grammarAccess.getParameterSequenceAccess().getValueAssignment_1_2_1(), "rule__ParameterSequence__ValueAssignment_1_2_1");
			builder.put(grammarAccess.getParameterAnyAccess().getValueAssignment_3_1(), "rule__ParameterAny__ValueAssignment_3_1");
			builder.put(grammarAccess.getParameterStringAccess().getValueAssignment(), "rule__ParameterString__ValueAssignment");
			builder.put(grammarAccess.getParameterBase64Access().getValueAssignment(), "rule__ParameterBase64__ValueAssignment");
			builder.put(grammarAccess.getParameterIntegerAccess().getValueAssignment_3(), "rule__ParameterInteger__ValueAssignment_3");
			builder.put(grammarAccess.getParameterDoubleAccess().getValueAssignment(), "rule__ParameterDouble__ValueAssignment");
			builder.put(grammarAccess.getParameterBooleanAccess().getValueAssignment(), "rule__ParameterBoolean__ValueAssignment");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_3_2(), "rule__ParameterStruct__ValueAssignment_3_2");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_3_3_1(), "rule__ParameterStruct__ValueAssignment_3_3_1");
			builder.put(grammarAccess.getParameterDateAccess().getValueAssignment_0(), "rule__ParameterDate__ValueAssignment_0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getNameAssignment_1(), "rule__ParameterStructMember__NameAssignment_1");
			builder.put(grammarAccess.getParameterStructMemberAccess().getValueAssignment_4(), "rule__ParameterStructMember__ValueAssignment_4");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_1(), "rule__ParameterStructTypeMember__NameAssignment_1");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_4(), "rule__ParameterStructTypeMember__TypeAssignment_4");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getDefaultAssignment_5_1(), "rule__ParameterStructTypeMember__DefaultAssignment_5_1");
			builder.put(grammarAccess.getMessagePartAccess().getTypeAssignment_0(), "rule__MessagePart__TypeAssignment_0");
			builder.put(grammarAccess.getMessagePartAccess().getDataAssignment_1(), "rule__MessagePart__DataAssignment_1");
			builder.put(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment(), "rule__TopicSpecRef__TopicSpecAssignment");
			builder.put(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_0(), "rule__ArrayTopicSpecRef__TopicSpecAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RosGrammarAccess grammarAccess;

	@Override
	protected InternalRosParser createParser() {
		InternalRosParser result = new InternalRosParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
