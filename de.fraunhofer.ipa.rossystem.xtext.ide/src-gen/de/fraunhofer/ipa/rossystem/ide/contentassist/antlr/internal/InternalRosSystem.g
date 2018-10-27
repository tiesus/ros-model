/*
 * generated by Xtext 2.13.0
 */
grammar InternalRosSystem;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;

}
@parser::members {
	private RosSystemGrammarAccess grammarAccess;

	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleRosSystem
entryRuleRosSystem
:
{ before(grammarAccess.getRosSystemRule()); }
	 ruleRosSystem
{ after(grammarAccess.getRosSystemRule()); } 
	 EOF 
;

// Rule RosSystem
ruleRosSystem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRosSystemAccess().getGroup()); }
		(rule__RosSystem__Group__0)
		{ after(grammarAccess.getRosSystemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTopicConnection
entryRuleTopicConnection
:
{ before(grammarAccess.getTopicConnectionRule()); }
	 ruleTopicConnection
{ after(grammarAccess.getTopicConnectionRule()); } 
	 EOF 
;

// Rule TopicConnection
ruleTopicConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTopicConnectionAccess().getGroup()); }
		(rule__TopicConnection__Group__0)
		{ after(grammarAccess.getTopicConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleServiceConnection
entryRuleServiceConnection
:
{ before(grammarAccess.getServiceConnectionRule()); }
	 ruleServiceConnection
{ after(grammarAccess.getServiceConnectionRule()); } 
	 EOF 
;

// Rule ServiceConnection
ruleServiceConnection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getServiceConnectionAccess().getGroup()); }
		(rule__ServiceConnection__Group__0)
		{ after(grammarAccess.getServiceConnectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__0__Impl
	rule__RosSystem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); }
	()
	{ after(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__1__Impl
	rule__RosSystem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); }
	'RosSystem'
	{ after(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__2__Impl
	rule__RosSystem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__3__Impl
	rule__RosSystem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_3()); }
	(rule__RosSystem__Group_3__0)?
	{ after(grammarAccess.getRosSystemAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__4__Impl
	rule__RosSystem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_4()); }
	(rule__RosSystem__Group_4__0)?
	{ after(grammarAccess.getRosSystemAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__5__Impl
	rule__RosSystem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_5()); }
	(rule__RosSystem__Group_5__0)?
	{ after(grammarAccess.getRosSystemAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__6__Impl
	rule__RosSystem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_6()); }
	(rule__RosSystem__Group_6__0)?
	{ after(grammarAccess.getRosSystemAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_3__0__Impl
	rule__RosSystem__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); }
	'Name'
	{ after(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); }
	(rule__RosSystem__NameAssignment_3_1)
	{ after(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4__0__Impl
	rule__RosSystem__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); }
	'RosComponent'
	{ after(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4__1__Impl
	rule__RosSystem__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_4_1()); }
	'('
	{ after(grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4__2__Impl
	rule__RosSystem__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_2()); }
	(rule__RosSystem__RosComponentAssignment_4_2)
	{ after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4__3__Impl
	rule__RosSystem__Group_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_4_3()); }
	(rule__RosSystem__Group_4_3__0)*
	{ after(grammarAccess.getRosSystemAccess().getGroup_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_4_4()); }
	')'
	{ after(grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_4_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4_3__0__Impl
	rule__RosSystem__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); }
	','
	{ after(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_4_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_3_1()); }
	(rule__RosSystem__RosComponentAssignment_4_3_1)
	{ after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5__0__Impl
	rule__RosSystem__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); }
	'TopicConnections'
	{ after(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5__1__Impl
	rule__RosSystem__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5__2__Impl
	rule__RosSystem__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); }
	(rule__RosSystem__TopicConnectionsAssignment_5_2)
	{ after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5__3__Impl
	rule__RosSystem__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_5_3()); }
	(rule__RosSystem__Group_5_3__0)*
	{ after(grammarAccess.getRosSystemAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5_3__0__Impl
	rule__RosSystem__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); }
	(rule__RosSystem__TopicConnectionsAssignment_5_3_1)
	{ after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6__0__Impl
	rule__RosSystem__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); }
	'ServiceConnections'
	{ after(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6__1__Impl
	rule__RosSystem__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); }
	'{'
	{ after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6__2__Impl
	rule__RosSystem__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); }
	(rule__RosSystem__ServiceConnectionsAssignment_6_2)
	{ after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6__3__Impl
	rule__RosSystem__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getGroup_6_3()); }
	(rule__RosSystem__Group_6_3__0)*
	{ after(grammarAccess.getRosSystemAccess().getGroup_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); }
	'}'
	{ after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__Group_6_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6_3__0__Impl
	rule__RosSystem__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); }
	','
	{ after(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosSystem__Group_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__Group_6_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); }
	(rule__RosSystem__ServiceConnectionsAssignment_6_3_1)
	{ after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TopicConnection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__0__Impl
	rule__TopicConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); }
	'TopicConnection'
	{ after(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__1__Impl
	rule__TopicConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__2__Impl
	rule__TopicConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getFromTopicKeyword_2()); }
	'FromTopic'
	{ after(grammarAccess.getTopicConnectionAccess().getFromTopicKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__3__Impl
	rule__TopicConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getFromTopicAssignment_3()); }
	(rule__TopicConnection__FromTopicAssignment_3)
	{ after(grammarAccess.getTopicConnectionAccess().getFromTopicAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__4__Impl
	rule__TopicConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getToTopicKeyword_4()); }
	'ToTopic'
	{ after(grammarAccess.getTopicConnectionAccess().getToTopicKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__5__Impl
	rule__TopicConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getToTopicAssignment_5()); }
	(rule__TopicConnection__ToTopicAssignment_5)
	{ after(grammarAccess.getTopicConnectionAccess().getToTopicAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TopicConnection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ServiceConnection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__0__Impl
	rule__ServiceConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); }
	'ServiceConnection'
	{ after(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__1__Impl
	rule__ServiceConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__2__Impl
	rule__ServiceConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getFromSrvKeyword_2()); }
	'FromSrv'
	{ after(grammarAccess.getServiceConnectionAccess().getFromSrvKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__3__Impl
	rule__ServiceConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getFromSrvAssignment_3()); }
	(rule__ServiceConnection__FromSrvAssignment_3)
	{ after(grammarAccess.getServiceConnectionAccess().getFromSrvAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__4__Impl
	rule__ServiceConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getToSrvKeyword_4()); }
	'ToSrv'
	{ after(grammarAccess.getServiceConnectionAccess().getToSrvKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__5__Impl
	rule__ServiceConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getToSrvAssignment_5()); }
	(rule__ServiceConnection__ToSrvAssignment_5)
	{ after(grammarAccess.getServiceConnectionAccess().getToSrvAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ServiceConnection__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosSystem__NameAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); }
		ruleEString
		{ after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__RosComponentAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_2_0()); }
		(
			{ before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_2_0_1()); }
		)
		{ after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__RosComponentAssignment_4_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_3_1_0()); }
		(
			{ before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_3_1_0_1()); }
		)
		{ after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__TopicConnectionsAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); }
		ruleTopicConnection
		{ after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__TopicConnectionsAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); }
		ruleTopicConnection
		{ after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__ServiceConnectionsAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); }
		ruleServiceConnection
		{ after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosSystem__ServiceConnectionsAssignment_6_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); }
		ruleServiceConnection
		{ after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__FromTopicAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopicConnection__ToTopicAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0()); }
		(
			{ before(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__FromSrvAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0()); }
		(
			{ before(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ServiceConnection__ToSrvAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0()); }
		(
			{ before(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
