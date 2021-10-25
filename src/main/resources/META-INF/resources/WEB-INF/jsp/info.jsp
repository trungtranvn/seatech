<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:useBean id="info" class="com.example.demo.dao.EmployeesDAOImpl" scope="request"></jsp:useBean>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<style>
    table,
    th,
    td {
        border: 1px solid black;
    }
</style>

<body>
    <div style="width: 70%; margin: 100px auto 0 auto;">
        <form method="POST" action="save">
            <div style="width: 100%;">
                <div style="width: 100%;float: left;">
                    <div style="float: left;" class="form-group col-md-3">
                        <label for="inputEmail4">ID</label>
                        <input type="text" class="form-control" id="inputEmail4" value="${Info.employeesId}" >
                    </div>
                </div>
            </div>
            <div class="form-row">
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputEmail4">First Name</label>
                    <input type="text" class="form-control" id="inputEmail4" value="${Info.firstName}" >
                </div>
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputPassword4">Last Name</label>
                    <input type="text" class="form-control" id="inputPassword4" value="${Info.lastName}" >
                </div>
            </div>
            <div class="form-row">
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputEmail4">Email</label>
                    <input type="text" class="form-control" id="inputEmail4" value="${Info.email}" >
                </div>
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputPassword4">Phone Number</label>
                    <input type="text" class="form-control" id="inputPassword4" value="${Info.numberPhone}" >
                </div>
            </div>
            <div class="form-row">
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputEmail4">HIRE_DATE</label>
                    <input type="text" class="form-control" id="inputEmail4" value="${Info.hireDate}" >
                </div>
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputPassword4">JOB_ID</label>
                    <input type="text" class="form-control" id="inputPassword4" value="${Info.jobId}" >
                </div>
            </div>
            <div class="form-row">
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputEmail4">SALARY</label>
                    <input type="text" class="form-control" id="inputEmail4" value="${Info.salary}" >
                </div>
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputPassword4">COMMISSION_PCT</label>
                    <input type="text" class="form-control" id="inputPassword4" value="${Info.commissionPct}" >
                </div>
            </div>
            <div class="form-row">
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputEmail4">MANAGER_ID</label>
                    <input type="text" class="form-control" id="inputEmail4" value="${Info.managerId}" >
                </div>
                <div style="float: left;" class="form-group col-md-6">
                    <label for="inputPassword4">DEPARTMENT_ID</label>
                    <input type="text" class="form-control" id="inputPassword4" value="${Info.departmentId}" >
                </div>
            </div>
       
        <button onclick="window.location.href='/index'" type="button" class="btn btn-info">Home</button>
        <button type="submit" class="btn btn-info">Save</button>
         </form>
    </div>
</body>

</html>