<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.Account" %>
<% Account acc1 = (Account)session.getAttribute("account1"); 
	if (acc1 == null){
		acc1 = new Account("test");
	}
%>
<% Account acc2 = (Account)session.getAttribute("account2"); 
	if (acc2 == null){
		acc2 = new Account("test2");
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/extra-css.css">
</head>


<body class="container-fluid admin">
  <div class="row ">
    <div class="col-1 no-padding">
      <div class="background no-padding">
        	<nav class="navbar  my-nav">
        		<h1>Myeooo's Team</h1>
        		<hr>
			 	<ul class="navbar-nav">
				   <li class="nav-item">
				      <a class="nav-link" href="#">dashboard</a>
				   </li>
				   <li class="nav-item">
				      <a class="nav-link" href="#">staff manager </a>
				   </li>
				    
				</ul>
			</nav>
     
      </div>
    </div>

