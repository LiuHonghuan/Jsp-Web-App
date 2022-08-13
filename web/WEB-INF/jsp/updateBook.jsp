<%--
  Created by IntelliJ IDEA.
  User: honghuan.liu
  Date: 2022/8/13
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/update" method="post">
        <input type="hidden" name="id" value="${book.getId()}"/>
        name:<input type="text" name="name" value="${book.getName()}"/> <br>
        count:<input type="count" name="count" value="${book.getCount()}"/> <br>
        note:<input type="note" name="note" value="${book.getNote()}"/> <br>

        <input class="btn btn-primary" type="submit" value="提交">
    </form>
</div>
</body>
</html>
