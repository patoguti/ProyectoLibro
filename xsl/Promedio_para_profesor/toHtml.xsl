<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<HTML>
<HEAD><TITLE>Asistencia y Notas</TITLE></HEAD>
<BODY>
<xsl:apply-templates select="profesores/profesor"/>
</BODY>
</HTML>
</xsl:template>
<xsl:template match="profesor">
    <P><xsl:text>Profesor: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
<P><xsl:text>Asignatura a cargo: </xsl:text><xsl:value-of select="asignatura"/></P>
<P><xsl:text>Alumnos: </xsl:text></P>
<xsl:for-each select="alumnos/alumno">
<P><xsl:text>Nombre: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/>
<xsl:text> Promedio: </xsl:text><xsl:value-of select="promedio"/></P>
</xsl:for-each>
<P><xsl:text>---------</xsl:text></P>
</xsl:template>
</xsl:stylesheet>
