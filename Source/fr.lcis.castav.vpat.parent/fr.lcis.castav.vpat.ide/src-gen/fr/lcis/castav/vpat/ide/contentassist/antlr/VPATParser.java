/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.lcis.castav.vpat.ide.contentassist.antlr.internal.InternalVPATParser;
import fr.lcis.castav.vpat.services.VPATGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VPATParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VPATGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VPATGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getContextAccess().getAlternatives(), "rule__Context__Alternatives");
			builder.put(grammarAccess.getPermissionIDAccess().getAlternatives(), "rule__PermissionID__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
			builder.put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
			builder.put(grammarAccess.getParameterAccess().getAlternatives_1_1(), "rule__Parameter__Alternatives_1_1");
			builder.put(grammarAccess.getInflowAccess().getAlternatives(), "rule__Inflow__Alternatives");
			builder.put(grammarAccess.getSourceAccess().getAlternatives_3(), "rule__Source__Alternatives_3");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup(), "rule__Vulnerability__Group__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_4(), "rule__Vulnerability__Group_4__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_5(), "rule__Vulnerability__Group_5__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_5_3(), "rule__Vulnerability__Group_5_3__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_6(), "rule__Vulnerability__Group_6__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_6_2_0(), "rule__Vulnerability__Group_6_2_0__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getGroup_6_2_1(), "rule__Vulnerability__Group_6_2_1__0");
			builder.put(grammarAccess.getContextAccess().getGroup_0(), "rule__Context__Group_0__0");
			builder.put(grammarAccess.getContextAccess().getGroup_1(), "rule__Context__Group_1__0");
			builder.put(grammarAccess.getContextAccess().getGroup_2(), "rule__Context__Group_2__0");
			builder.put(grammarAccess.getPermissionAccess().getGroup(), "rule__Permission__Group__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup(), "rule__Network__Group__0");
			builder.put(grammarAccess.getSinkAccess().getGroup(), "rule__Sink__Group__0");
			builder.put(grammarAccess.getSinkAccess().getGroup_3(), "rule__Sink__Group_3__0");
			builder.put(grammarAccess.getSinkAccess().getGroup_3_3(), "rule__Sink__Group_3_3__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_1(), "rule__Parameter__Group_1__0");
			builder.put(grammarAccess.getSourceAccess().getGroup(), "rule__Source__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getVulnerabilityAccess().getNameAssignment_2(), "rule__Vulnerability__NameAssignment_2");
			builder.put(grammarAccess.getVulnerabilityAccess().getDescriptionAssignment_4_1(), "rule__Vulnerability__DescriptionAssignment_4_1");
			builder.put(grammarAccess.getVulnerabilityAccess().getContextAssignment_5_2(), "rule__Vulnerability__ContextAssignment_5_2");
			builder.put(grammarAccess.getVulnerabilityAccess().getContextAssignment_5_3_1(), "rule__Vulnerability__ContextAssignment_5_3_1");
			builder.put(grammarAccess.getVulnerabilityAccess().getMainFunctionAssignment_6_2_0_1(), "rule__Vulnerability__MainFunctionAssignment_6_2_0_1");
			builder.put(grammarAccess.getVulnerabilityAccess().getFunctionAssignment_6_2_1_1(), "rule__Vulnerability__FunctionAssignment_6_2_1_1");
			builder.put(grammarAccess.getContextAccess().getPermissionAssignment_0_0(), "rule__Context__PermissionAssignment_0_0");
			builder.put(grammarAccess.getContextAccess().getValueAssignment_0_1(), "rule__Context__ValueAssignment_0_1");
			builder.put(grammarAccess.getContextAccess().getNetworkAssignment_1_0(), "rule__Context__NetworkAssignment_1_0");
			builder.put(grammarAccess.getContextAccess().getValueAssignment_1_1(), "rule__Context__ValueAssignment_1_1");
			builder.put(grammarAccess.getContextAccess().getVersionAssignment_2_0(), "rule__Context__VersionAssignment_2_0");
			builder.put(grammarAccess.getContextAccess().getValueAssignment_2_1(), "rule__Context__ValueAssignment_2_1");
			builder.put(grammarAccess.getVersionAccess().getNameAssignment(), "rule__Version__NameAssignment");
			builder.put(grammarAccess.getPermissionAccess().getNameAssignment_1(), "rule__Permission__NameAssignment_1");
			builder.put(grammarAccess.getPermissionIDAccess().getNameAssignment_0(), "rule__PermissionID__NameAssignment_0");
			builder.put(grammarAccess.getPermissionIDAccess().getNameAssignment_1(), "rule__PermissionID__NameAssignment_1");
			builder.put(grammarAccess.getPermissionIDAccess().getNameAssignment_2(), "rule__PermissionID__NameAssignment_2");
			builder.put(grammarAccess.getPermissionIDAccess().getNameAssignment_3(), "rule__PermissionID__NameAssignment_3");
			builder.put(grammarAccess.getSinkAccess().getNameAssignment_1(), "rule__Sink__NameAssignment_1");
			builder.put(grammarAccess.getSinkAccess().getParameterAssignment_3_2(), "rule__Sink__ParameterAssignment_3_2");
			builder.put(grammarAccess.getSinkAccess().getParameterAssignment_3_3_1(), "rule__Sink__ParameterAssignment_3_3_1");
			builder.put(grammarAccess.getParameterAccess().getOriginAssignment_0(), "rule__Parameter__OriginAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getStaticAssignment_1_0(), "rule__Parameter__StaticAssignment_1_0");
			builder.put(grammarAccess.getParameterAccess().getAnyValueAssignment_1_1_0(), "rule__Parameter__AnyValueAssignment_1_1_0");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_1_1_1(), "rule__Parameter__ValueAssignment_1_1_1");
			builder.put(grammarAccess.getSourceAccess().getNameAssignment_2(), "rule__Source__NameAssignment_2");
			builder.put(grammarAccess.getSourceAccess().getAnyPrivateAssignment_3_0(), "rule__Source__AnyPrivateAssignment_3_0");
			builder.put(grammarAccess.getSourceAccess().getMethodAssignment_3_1(), "rule__Source__MethodAssignment_3_1");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_2(), "rule__Input__NameAssignment_2");
			builder.put(grammarAccess.getInputAccess().getMethodAssignment_3(), "rule__Input__MethodAssignment_3");
			builder.put(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), "rule__Vulnerability__UnorderedGroup_6_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VPATGrammarAccess grammarAccess;

	@Override
	protected InternalVPATParser createParser() {
		InternalVPATParser result = new InternalVPATParser(null);
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

	public VPATGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VPATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
