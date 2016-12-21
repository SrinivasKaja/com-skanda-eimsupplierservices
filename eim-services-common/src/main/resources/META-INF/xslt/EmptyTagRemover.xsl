<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:exslt="http://exslt.org/common">
	<xsl:output omit-xml-declaration="yes" indent="yes" />
	<xsl:strip-space elements="*" />

	<xsl:template match="node()|@*">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>

	<!-- <xsl:template match= "*[not(@*|*|comment()|processing-instruction()) 
		and normalize-space()='' ]"/> -->
	<xsl:template match="*[not(node())]" />

	<xsl:template name="elimininateEmptyNodes">
		<xsl:param name="elem" />
		<xsl:choose>
			<xsl:when test="$elem//*[not(node())]">
				<xsl:variable name="aux">
					<xsl:apply-templates select="$elem/*" />
				</xsl:variable>
				<xsl:call-template name="elimininateEmptyNodes">
					<xsl:with-param name="elem" select="exslt:node-set($aux)" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:copy-of select="$elem" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="/">
		<xsl:call-template name="elimininateEmptyNodes">
			<xsl:with-param name="elem" select="/" />
		</xsl:call-template>
	</xsl:template>


</xsl:stylesheet>
