<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: honghuan.liu
  Date: 2022/8/13
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book list page</title>
</head>
<!-- 引入 Bootstrap -->
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

<body>
<div class="container">
    <div class="col-md-12">
        <h1> list all book</h1>
    </div>

    <div class="col-md-3">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addPage">新增</a>
    </div>

    <div class="col-md-12">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>count</th>
                <th>note</th>
                <th>operate</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var = "book" items="${requestScope.get('bookList')}">
                    <tr>
                        <td>${book.getId()}</td>
                        <td>${book.getName()}</td>
                        <td>${book.getCount()}</td>
                        <td>${book.getNote()}</td>

                        <td>
                            <a href="${pageContext.request.contextPath}/book/update">更新</a>
                            &nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/book/removeBook">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
