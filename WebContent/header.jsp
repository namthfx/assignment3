<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous" />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/extra-css.css"/>
    <title>Hello, world!</title>
    
  </head>
  <!-- col-sm- -->
  <body>
  <div class="wapper">
    <header class="p-3">
        <div class="container flex-column d-flex flex-md-row">
        <div class="header_logo text-center">
          <a href="${pageContext.request.contextPath}" >
          <h2>
            PRJ321x
          </h2>

            Welcome
          </a>
        </div>
        <div class="header_form  mt-3 mt-md-0 ml-md-5">
          <div class="btn-group" role="group">
            <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
              Category
            </button>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#">Dropdown link</a>
              <a class="dropdown-item" href="#">Dropdown link</a>
            </div>
          </div>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username" aria-describedby="button-addon2">
            <div class="input-group-append">
              <button  type="button" class="btn btn-warning">Search</button>
            </div>
          </div>
        </div>
      </div>
        <nav class="d-flex align-items-center justify-content-around">
          <ul class="header_nav d-flex">
            <li class="header_nav--item">
              Home
            </li>
            <li class="header_nav--item">
              Product
            </li>
            <li class="header_nav--item">
              About Us
            </li>
          </ul>
          <div class="header_auth d-flex">
            <p class="header_auth_login">
              
               <a href="${pageContext.request.contextPath}/login" >Login</a>
            </p>
            <p class="header_auth_register">
              <a href="${pageContext.request.contextPath}/register" >Register</a>
            </p>

          </div>
        </nav>
    </header>