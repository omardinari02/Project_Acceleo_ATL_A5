<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Transfo"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchDataBase2Classifier():V"/>
		<constant value="A.__matchEntity2Class():V"/>
		<constant value="A.__matchAttribute2Attribute():V"/>
		<constant value="A.__matchRelation2Relation():V"/>
		<constant value="__exec__"/>
		<constant value="DataBase2Classifier"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyDataBase2Classifier(NTransientLink;):V"/>
		<constant value="Entity2Class"/>
		<constant value="A.__applyEntity2Class(NTransientLink;):V"/>
		<constant value="Attribute2Attribute"/>
		<constant value="A.__applyAttribute2Attribute(NTransientLink;):V"/>
		<constant value="Relation2Relation"/>
		<constant value="A.__applyRelation2Relation(NTransientLink;):V"/>
		<constant value="__matchDataBase2Classifier"/>
		<constant value="DataBase"/>
		<constant value="ER"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="o"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="i"/>
		<constant value="Classifier"/>
		<constant value="Class"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:11-13:10"/>
		<constant value="__applyDataBase2Classifier"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="entities"/>
		<constant value="ent"/>
		<constant value="10:20-10:21"/>
		<constant value="10:20-10:26"/>
		<constant value="10:12-10:26"/>
		<constant value="11:13-11:14"/>
		<constant value="11:13-11:23"/>
		<constant value="11:6-11:23"/>
		<constant value="link"/>
		<constant value="__matchEntity2Class"/>
		<constant value="Entity"/>
		<constant value="18:11-22:10"/>
		<constant value="__applyEntity2Class"/>
		<constant value="attributes"/>
		<constant value="attr"/>
		<constant value="relations"/>
		<constant value="rel"/>
		<constant value="19:20-19:21"/>
		<constant value="19:20-19:26"/>
		<constant value="19:12-19:26"/>
		<constant value="20:14-20:15"/>
		<constant value="20:14-20:26"/>
		<constant value="20:6-20:26"/>
		<constant value="21:13-21:14"/>
		<constant value="21:13-21:24"/>
		<constant value="21:6-21:24"/>
		<constant value="__matchAttribute2Attribute"/>
		<constant value="Attribute"/>
		<constant value="27:11-29:10"/>
		<constant value="__applyAttribute2Attribute"/>
		<constant value="28:20-28:21"/>
		<constant value="28:20-28:26"/>
		<constant value="28:12-28:26"/>
		<constant value="__matchRelation2Relation"/>
		<constant value="Relation"/>
		<constant value="34:11-36:10"/>
		<constant value="__applyRelation2Relation"/>
		<constant value="35:20-35:21"/>
		<constant value="35:20-35:26"/>
		<constant value="35:12-35:26"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="64"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="69">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="70"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="76" begin="11" end="11"/>
			<lne id="77" begin="11" end="12"/>
			<lne id="78" begin="9" end="14"/>
			<lne id="79" begin="17" end="17"/>
			<lne id="80" begin="17" end="18"/>
			<lne id="81" begin="15" end="20"/>
			<lne id="68" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="21"/>
			<lve slot="2" name="61" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="82" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="84"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="65"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="85" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="70"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="87"/>
			<call arg="30"/>
			<set arg="88"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<call arg="30"/>
			<set arg="90"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="91" begin="11" end="11"/>
			<lne id="92" begin="11" end="12"/>
			<lne id="93" begin="9" end="14"/>
			<lne id="94" begin="17" end="17"/>
			<lne id="95" begin="17" end="18"/>
			<lne id="96" begin="15" end="20"/>
			<lne id="97" begin="23" end="23"/>
			<lne id="98" begin="23" end="24"/>
			<lne id="99" begin="21" end="26"/>
			<lne id="85" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="27"/>
			<lve slot="2" name="61" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="82" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="101"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="101"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="102" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="103">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="70"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="104" begin="11" end="11"/>
			<lne id="105" begin="11" end="12"/>
			<lne id="106" begin="9" end="14"/>
			<lne id="102" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="15"/>
			<lve slot="2" name="61" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="82" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="107">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="108"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="108"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="109" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="110">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="70"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="111" begin="11" end="11"/>
			<lne id="112" begin="11" end="12"/>
			<lne id="113" begin="9" end="14"/>
			<lne id="109" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="15"/>
			<lve slot="2" name="61" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="82" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
