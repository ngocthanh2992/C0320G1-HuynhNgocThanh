<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2020
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String,String> dic = new HashMap<>();
%>
<%
    dic.put("Hello","Xin chào");
    dic.put("How","Thế nào");
    dic.put("Book","Quyển vở");
    dic.put("Computer","Máy tính");
    String search = request.getParameter("txtSearch");
    String result = dic.get(search);
    if (result != null){
        out.println("Word: "+search);
        out.println("Result: "+ result);
    }else {
        out.println("Not Found");
    }
%>
</body>
</html>
