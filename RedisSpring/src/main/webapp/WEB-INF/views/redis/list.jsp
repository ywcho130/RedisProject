<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redis List</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<table>
        <thead>
            <tr>
                <th>Key</th>
                <th>Value</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="data" items="${allData}">
                <tr>
                    <td>${data.key}</td>
                    <td>${data.value}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
<button type="button" class="btn btn-success" id="WriteBtn" onclick= "location.href='write'">key,value 등록하기</button>

</body>
</html>