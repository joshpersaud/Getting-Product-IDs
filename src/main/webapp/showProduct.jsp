<%--
  Created by IntelliJ IDEA.
  User: HCL
  Date: 1/26/21
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.productid.web.model.product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    
</head>
<body>
	<p> Product Info: 
	<%
		product a1 = (product)request.getAttribute("product");
		out.println(a1);
	%>
	</p>
</body>
</html>
