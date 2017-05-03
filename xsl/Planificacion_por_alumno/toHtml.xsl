<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<HTML>
<HEAD><TITLE>Planificacion</TITLE></HEAD>
<BODY>
<xsl:apply-templates select="apoderados/apoderado"/>
</BODY>
</HTML>
</xsl:template>
<xsl:template match="apoderado">
    <P><xsl:text>Apoderado: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
<P><xsl:text>Pupilos: </xsl:text></P>
    <xsl:for-each select="pupilos/pupilo">
        <P><xsl:value-of select="nombre"/><xsl:text> </xsl:text> <xsl:value-of select="apellido"/><xsl:text> </xsl:text><xsl:value-of select="run"/></P>
            <xsl:for-each select="planes/plan">
            <P>plan: <xsl:text> </xsl:text><xsl:value-of select="."/></P>
            </xsl:for-each>
    </xsl:for-each>
</xsl:template>
</xsl:stylesheet>
