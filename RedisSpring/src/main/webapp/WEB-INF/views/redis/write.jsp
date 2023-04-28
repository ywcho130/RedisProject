<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redis write</title>
</head>
<body>
<form action="write" method="post" id="writeForm">
<div class="form-group">
					<label>key</label> <input name="first" class="form-control"
						id="first">
				</div>
				<div class="form-group">
					<label>value</label> <input name="second" class="form-control"
						id="second">
				</div>
				<button class="btn btn-success">등록</button>
				</form>


</body>
</html>