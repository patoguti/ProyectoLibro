<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<HTML>
<HEAD><TITLE>Asistencia y Notas</TITLE></HEAD>
<BODY>
<xsl:apply-templates select="alumnos/alumno"/>
</BODY>
</HTML>
</xsl:template>
<xsl:template match="alumno">
    <P><xsl:text>Alumno: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
<P><xsl:text>porcentaje asistencia: </xsl:text><xsl:value-of select="asistencia"/></P>
<P><xsl:text>Evaluaciones: </xsl:text></P>
<xsl:for-each select="evaluaciones/evaluacion">
<P><xsl:text>Asignatura: </xsl:text><xsl:value-of select="asignatura"/>
<xsl:text> Nota: </xsl:text><xsl:value-of select="nota"/></P>
</xsl:for-each>
<P><xsl:text>---------</xsl:text></P>
</xsl:template>
</xsl:stylesheet>
