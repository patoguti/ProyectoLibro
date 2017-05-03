<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<HTML>
<HEAD><TITLE>Alumnos reprobados</TITLE></HEAD>
<BODY>
<xsl:apply-templates select="alumnos/alumno"/>
</BODY>
</HTML>
</xsl:template>
<xsl:template match="alumno">
    <P><xsl:text>Alumno: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
</xsl:template>
</xsl:stylesheet>
