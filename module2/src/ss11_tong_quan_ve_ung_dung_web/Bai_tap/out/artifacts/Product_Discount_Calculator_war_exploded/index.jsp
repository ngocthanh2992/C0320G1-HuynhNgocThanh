<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2020
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/display-discount">
  <label>Product Description</label><br>
  <input type="text" name="product" placeholder="Product description"><br>
  <label>List Price</label><br>
  <input type="text" name="price" placeholder="List price" value="0"><br>
  <label>Discount Percent</label><br>
  <input type="text" name="discount" placeholder="Discount percent" value="0"><br>
  <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
