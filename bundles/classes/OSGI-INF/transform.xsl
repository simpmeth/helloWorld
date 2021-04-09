<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:jaxrs="http://cxf.apache.org/blueprint/jaxrs">
    <xsl:output omit-xml-declaration="yes" indent="yes"/>

    <xsl:param name="address" select="'address'"/>

    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="jaxrs:server/@address">
        <xsl:attribute name="address">
            <xsl:value-of select="$address"/>
        </xsl:attribute>
    </xsl:template>
</xsl:stylesheet>