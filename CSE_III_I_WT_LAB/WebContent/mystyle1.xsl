<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
<body>
<table align="center" border="1">
<caption> <h2>Books Information</h2></caption>
<tr bgcolor="#BBEEFF">
<th style="text-align:left">Title</th>
<th style="text-align:left">Author</th>
<th style="text-align:left">Publication</th>
<th style="text-align:left">Edition</th>
<th style="text-align:left">Price</th>
</tr>
<xsl:for-each select="catalog/book">
<tr>
<td><xsl:value-of select="title"/></td>
<td><xsl:value-of select="author"/></td>
<td><xsl:value-of select="publication"/></td>
<td><xsl:value-of select="edition"/> </td>
<td><xsl:value-of select="price"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
	</xsl:template>
</xsl:stylesheet>