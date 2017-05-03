<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
 xmlns:w="http://schemas.microsoft.com/office/word/2003/wordml">
 <xsl:output method="xml" indent="yes" />
 <xsl:template match="/">
  <xsl:processing-instruction name="mso-application">
   <xsl:text>progid="Word.Document"</xsl:text>
  </xsl:processing-instruction>
  <w:wordDocument>
   <w:body>
        <w:t>Informe asistencia y notas</w:t>
     <xsl:apply-templates select="alumnos/alumno" />
   </w:body>
  </w:wordDocument>
 </xsl:template>

 <xsl:template match="alumno">
    <w:p>
     <w:r>
      <w:t>
       rut: <xsl:value-of select="run"/>
      </w:t>
        <w:br></w:br>
      <w:t>
       nombre: <xsl:value-of select="nombre"/>
      </w:t>
      <w:t>
       <xsl:value-of select="apellido"/>
      </w:t>
        <w:br></w:br>
      <w:t>
       asistencia : <xsl:value-of select="asistencia"/>
      </w:t>
    <w:br></w:br>
    <w:t> Evaluaciones: </w:t>
    <w:br></w:br>
    <xsl:for-each select="evaluaciones/evaluacion">
      <w:t>
       asignatura: <xsl:value-of select="asignatura"/>
       nota: <xsl:value-of select="nota"/>
      </w:t>
      <w:br></w:br>
     </xsl:for-each>
     </w:r>
    </w:p>
 </xsl:template>
</xsl:stylesheet>
