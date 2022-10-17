<%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2022/9/6
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int shortSide1=3;
    int shortSide2=4;
    int longSide=5;
    if (shortSide1*shortSide1+shortSide2*shortSide2==longSide*longSide)
    {
        out.println("是直角三角形");
    }
    else
    {
        out.println("不是直角三角形");
    }
%>

</body>
</html>
