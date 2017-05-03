<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<HTML>
<HEAD><TITLE>Informe general</TITLE></HEAD>
<BODY>
<xsl:apply-templates select="apoderados/apoderado"/>
</BODY>
</HTML>
</xsl:template>
<xsl:template match="apoderado">
    <P><xsl:text>Apoderado: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
    <P><xsl:text>Pupilos: </xsl:text></P>
        <xsl:for-each select="pupilos/alumno">
        <P><xsl:text>Nombre: </xsl:text><xsl:value-of select="nombre"/><xsl:text> </xsl:text><xsl:value-of select="apellido"/><xsl:text> Rut: </xsl:text><xsl:value-of select="run"/></P>
            <xsl:for-each select="asistencias/asistencia">
            <P><xsl:text> Asistencia: </xsl:text><xsl:value-of select="."/></P>
            </xsl:for-each>
            <xsl:for-each select="promedios/promedio">
            <P><xsl:text>Asignatura: </xsl:text><xsl:value-of select="asignatura"/><xsl:text> Nota: </xsl:text><xsl:value-of select="nota"/></P>
            </xsl:for-each>
            <xsl:for-each select="evaluaciones/evaluacion">
            <P><xsl:text>Asignatura: </xsl:text><xsl:value-of select="asignatura"/><xsl:text> Nota: </xsl:text><xsl:value-of select="nota"/></P>
            </xsl:for-each>
            <xsl:for-each select="anotaciones/anotacion">
           </xsl:for-each>
            <xsl:for-each select="planes/plan">
            <P><xsl:text>plan: </xsl:text><xsl:value-of select="plan"/></P>
           </xsl:for-each>
        </xsl:for-each>
    <P><xsl:text>---------</xsl:text></P>
</xsl:template>
</xsl:stylesheet>
