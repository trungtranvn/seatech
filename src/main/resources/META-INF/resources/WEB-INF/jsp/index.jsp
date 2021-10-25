<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:useBean id="a" class="com.example.demo.dao.EmployeesDAOImpl"
	scope="request"></jsp:useBean>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>

<style>
table, th, td {
	border: 1px solid black;
}
</style>

<body>
	<div style="width: 80%; margin: 100px auto 0 auto;">
		<form action="index/select" method="GET">
			<fieldset>
				<div style="width: 100%; display: block; float: left;">
					<div style="display: block; float: left; width: 90%;">
						<input style="width: 100%;" type="text" name="employeeName">
					</div>
					<div style="margin-left: 1%; display: block; float: left;">
						<input type="submit" />

					</div>
				</div>
				<div
					style="display: block; float: left; width: 100%; margin-top: 20px;">
					<div style="width: 30%; float: left; margin: auto;">

						<select class="form-select" aria-label="Default select example"
							name="jobId">
							<option value="null">Choose Job Title</option>
							<c:forEach items="${Jobs}" var="JobDTO">
								<option value="${JobDTO.jobId}">${JobDTO.jobTitle}</option>
							</c:forEach>
						</select>
					</div>
					<div style="width: 30%; float: left; margin: auto;">
						<select class="form-select" aria-label="Default select example"
							name="departmentId">
							<option selected value="null">Choose Department</option>
							<c:forEach items="${Deps}" var="DepDTO">
								<option value="${DepDTO.departmentId}">${DepDTO.departmentName}</option>
							</c:forEach>
						</select>
					</div>
					<div style="width: 30%; float: left; margin: auto;">
						<select class="form-select" aria-label="Default select example"
							name="managerId">
							<option selected value="null">Choose Manager</option>
							<c:forEach items="${Employees}" var="EmployeeDTO">
								<option value="${EmployeeDTO.employeesId}">${EmployeeDTO.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</fieldset>
		</form>

		<form action="info" method="get,delete">
			<div style="display: block; float: left; width: 100%;margin-top:50px;">
				<table style="width: 100%" class="table table-striped">
					<tr>
						<!-- <th></th> -->
						<th>ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
					<c:forEach items="${Result}" var="Result">
						<tr>
							<%-- <td><input type="checkbox" value="${Result.employeesId}"></td> --%>
							<td>${Result.employeesId}</td>
							<td>${Result.firstName}</td>
							<td>${Result.lastName}</td>
							<td>${Result.email}</td>
							<td><button
									onclick="window.location.href='/info?id=${Result.employeesId}'"
									type="button" class="btn btn-info">Info</button>
									<button
									onclick="window.location.href='/info?id=${Result.employeesId}'"
									type="button" class="btn btn-info">Edit</button>
								<button
									onclick="window.location.href='/delete?id=${Result.employeesId}'"
									type="button" class="btn btn-info">Delete</button></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
	</div>
</body>

</html>