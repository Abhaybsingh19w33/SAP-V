<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:ns0="urn:sap.com:typesystem:b2b:116:asc-x12:004010" exclude-result-prefixes="xs ns0">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:variable name="var1_initial" select="."/>
		<ORDERS05>
			<xsl:attribute name="xsi:noNamespaceSchemaLocation" namespace="http://www.w3.org/2001/XMLSchema-instance">urn:sap.com:typesystem:b2b:310:sap-idoc:orders05</xsl:attribute>
			<IDOC>
				<xsl:attribute name="BEGIN">1</xsl:attribute>
				<EDI_DC40>
					<xsl:attribute name="SEGMENT">1</xsl:attribute>
					<TABNAM>
						<xsl:value-of select="'EDI_DC40'"/>
					</TABNAM>
					<DIRECT>
						<xsl:value-of select="'1'"/>
					</DIRECT>
					<IDOCTYP>
						<xsl:value-of select="'ORDERS05'"/>
					</IDOCTYP>
					<MESTYP>
						<xsl:value-of select="'ORDERS'"/>
					</MESTYP>
					<SNDPOR>
						<xsl:value-of select="'TEST'"/>
					</SNDPOR>
					<SNDPRT>
						<xsl:value-of select="'LS'"/>
					</SNDPRT>
					<xsl:for-each select="ns0:Interchange/S_ISA/D_I06">
						<xsl:variable name="var2_cur" select="."/>
						<SNDPRN>
							<xsl:value-of select="."/>
						</SNDPRN>
					</xsl:for-each>
					<RCVPOR>
						<xsl:value-of select="'SAPCPI'"/>
					</RCVPOR>
					<xsl:for-each select="ns0:Interchange/S_ISA/D_I07">
						<xsl:variable name="var3_cur" select="."/>
						<RCVPRN>
							<xsl:value-of select="."/>
						</RCVPRN>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/S_ISA/D_I08">
						<xsl:variable name="var4_cur" select="."/>
						<REFINT>
							<xsl:value-of select="."/>
						</REFINT>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/S_GS/D_142">
						<xsl:variable name="var5_cur" select="."/>
						<REFGRP>
							<xsl:value-of select="."/>
						</REFGRP>
					</xsl:for-each>
				</EDI_DC40>
				<E1EDK01>
					<xsl:attribute name="SEGMENT">1</xsl:attribute>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
						<xsl:variable name="var6_cur" select="."/>
						<ACTION>
							<xsl:value-of select="S_BEG/D_92"/>
						</ACTION>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
						<xsl:variable name="var7_cur" select="."/>
						<KZABS>
							<xsl:value-of select="S_BEG/D_353"/>
						</KZABS>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850/S_CUR">
						<xsl:variable name="var8_cur" select="."/>
						<CURCY>
							<xsl:value-of select="D_100"/>
						</CURCY>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850/S_CUR/D_280">
						<xsl:variable name="var9_cur" select="."/>
						<WKURS>
							<xsl:value-of select="number(.)"/>
						</WKURS>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
						<xsl:variable name="var10_cur" select="."/>
						<BSART>
							<xsl:value-of select="S_ST/D_143"/>
						</BSART>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
						<xsl:variable name="var11_cur" select="."/>
						<BELNR>
							<xsl:value-of select="S_BEG/D_324"/>
						</BELNR>
					</xsl:for-each>
					<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
						<xsl:variable name="var12_cur" select="."/>
						<BSTZD>
							<xsl:value-of select="S_BEG/D_373"/>
						</BSTZD>
					</xsl:for-each>
				</E1EDK01>
				<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850/G_N1">
					<xsl:variable name="var13_cur" select="."/>
					<E1EDKA1>
						<xsl:attribute name="SEGMENT">1</xsl:attribute>
						<PARVW>
							<xsl:value-of select="S_N1/D_98"/>
						</PARVW>
						<xsl:for-each select="S_N1/D_67">
							<xsl:variable name="var14_cur" select="."/>
							<PARTN>
								<xsl:value-of select="."/>
							</PARTN>
						</xsl:for-each>
						<xsl:for-each select="S_N1/D_93">
							<xsl:variable name="var15_cur" select="."/>
							<NAME1>
								<xsl:value-of select="."/>
							</NAME1>
						</xsl:for-each>
					</E1EDKA1>
				</xsl:for-each>
				<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850/G_PO1">
					<xsl:variable name="var16_cur" select="."/>
					<E1EDP01>
						<xsl:attribute name="SEGMENT">1</xsl:attribute>
						<xsl:for-each select="S_PO1/D_350">
							<xsl:variable name="var17_cur" select="."/>
							<POSEX>
								<xsl:value-of select="."/>
							</POSEX>
						</xsl:for-each>
						<xsl:for-each select="S_PO1/D_330">
							<xsl:variable name="var18_cur" select="."/>
							<MENGE>
								<xsl:value-of select="number(.)"/>
							</MENGE>
						</xsl:for-each>
						<xsl:for-each select="S_PO1/D_355">
							<xsl:variable name="var19_cur" select="."/>
							<MENEE>
								<xsl:value-of select="."/>
							</MENEE>
						</xsl:for-each>
						<xsl:for-each select="S_PO1/D_212">
							<xsl:variable name="var20_cur" select="."/>
							<BMNG2>
								<xsl:value-of select="number(.)"/>
							</BMNG2>
						</xsl:for-each>
						<xsl:for-each select="S_PO1/D_234">
							<xsl:variable name="var21_cur" select="."/>
							<PMENE>
								<xsl:value-of select="."/>
							</PMENE>
						</xsl:for-each>
						<xsl:for-each select="S_PO1/D_234_2">
							<xsl:variable name="var22_cur" select="."/>
							<PEINH>
								<xsl:value-of select="."/>
							</PEINH>
						</xsl:for-each>
						<xsl:for-each select="G_SCH">
							<xsl:variable name="var23_cur" select="."/>
							<GEWEI>
								<xsl:value-of select="S_SCH/D_355"/>
							</GEWEI>
						</xsl:for-each>
						<xsl:for-each select="G_SCH">
							<xsl:variable name="var24_cur" select="."/>
							<FIXMG>
								<xsl:value-of select="S_SCH/D_373"/>
							</FIXMG>
						</xsl:for-each>
						<xsl:for-each select="S_LIN">
							<xsl:variable name="var25_cur" select="."/>
							<MATNR>
								<xsl:value-of select="D_234"/>
							</MATNR>
						</xsl:for-each>
					</E1EDP01>
				</xsl:for-each>
				<xsl:for-each select="ns0:Interchange/FunctionalGroup/M_850">
					<xsl:variable name="var26_cur" select="."/>
					<xsl:for-each select="G_CTT">
						<xsl:variable name="var27_cur" select="."/>
						<E1EDS01>
							<xsl:attribute name="SEGMENT">1</xsl:attribute>
							<SUMID>
								<xsl:value-of select="number(S_CTT/D_354)"/>
							</SUMID>
							<SUNIT>
								<xsl:value-of select="number($var26_cur/S_SE/D_96)"/>
							</SUNIT>
						</E1EDS01>
					</xsl:for-each>
				</xsl:for-each>
			</IDOC>
		</ORDERS05>
	</xsl:template>
</xsl:stylesheet>