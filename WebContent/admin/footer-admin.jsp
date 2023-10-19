

<% String userID =(String) session.getAttribute("user"); 
if (userID == null){
	response.sendRedirect("../login.jsp");
}
	
%>>
<footer class="container-fluid jumbotron bg-4 text-center bg-dark text-white">
  <p>hello 
  <%=userID %>
  </p>
</footer>
</body>
</html>