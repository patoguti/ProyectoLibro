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
 <xsl:template match="apoderado">
    <w:p>
     <w:r>
      <w:t>
       <xsl:value-of select="run"/>
      </w:t>
      <w:t>
       <xsl:value-of select="nombre"/>
      </w:t>
      <w:t>
       <xsl:value-of select="apellido"/>
      </w:t>
     </w:r>
    </w:p>
 </xsl:template>
</xsl:stylesheet>
