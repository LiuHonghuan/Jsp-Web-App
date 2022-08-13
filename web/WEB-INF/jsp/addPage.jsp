<%--
  Created by IntelliJ IDEA.
  User: honghuan.liu
  Date: 2022/8/13
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add page</title>
</head>

<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

<body>
<div class="container">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/add" method="post">
        name:<input type="text" name="name"> <br>
        count:<input type="text" name="count"> <br>
        note:<input type="text" name="note"> <br>

        <input class="btn btn-primary" type="submit" value="添加">
    </form>
</div>
</body>
</html>
