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
     <xsl:apply-templates select="apoderados/apoderado" />
   </w:body>
  </w:wordDocument>
 </xsl:template>
<xsl:template match="apoderados/apoderado">
    <w:p>
     <w:r>
      <w:t>
       Apoderado: <xsl:value-of select="nombre"/>
      </w:t>
      <w:t>
       <xsl:value-of select="apellido"/>
      </w:t>
      <w:t>
       Run: <xsl:value-of select="run"/>
      </w:t>
      <w:br></w:br>
      <xsl:for-each select="pupilos/alumno">
           <w:t>
            alumno: <xsl:value-of select="nombre"/>
           </w:t>
           <w:t>
            <xsl:value-of select="apellido"/>
           </w:t>
           <w:t>
            <xsl:value-of select="run"/>
           </w:t>
           <w:br></w:br>
           <xsl:for-each select="asistencias/asistencia">
            <w:t>
             asistencia: <xsl:value-of select="."/>
            </w:t>
             <w:br></w:br>
           </xsl:for-each>
           <xsl:for-each select="promedios/promedio">
             <w:t>
            asignatura: <xsl:value-of select="asignatura"/>
           </w:t>
            <w:t>
            nota: <xsl:value-of select="nota"/>
            </w:t>
             <w:br></w:br>
           </xsl:for-each>
           <xsl:for-each select="evaluaciones/evaluacion">
           <w:t>
            asignatura: <xsl:value-of select="asignatura"/>
           </w:t>
            <w:t>
            nota: <xsl:value-of select="nota"/>
            </w:t>
             <w:br></w:br>
           </xsl:for-each>
           <xsl:for-each select="anotaciones/anotacion">
           <w:t> motivo: <xsl:value-of select="motivo"/>
            </w:t>
             <w:br></w:br>
           </xsl:for-each>
           <xsl:for-each select="planes/plan">
            <w:t> plan: <xsl:value-of select="plan"/>
            </w:t>
             <w:br></w:br>
           </xsl:for-each>
      </xsl:for-each>
     </w:r>
   </w:p>
 </xsl:template>
</xsl:stylesheet>
