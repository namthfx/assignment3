<%@ include file="/admin/header-admin.jsp" %>
		
    <div class="col-11">
      <div class="row">
        <div class="col-12 no-padding">
        <div id="demo" class="carousel slide" data-ride="carousel">
         
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="../img/titanic.jpg" alt="Los Angeles" >
            </div>
          </div>
        </div>
      </div>
    </div>
      <div class="row my-team-table">
	      <div class= " col-7">
		      <div class = "container">
		      	<h2>Members of the teams</h2>
		         <table  class="table stable-dark">
		          <thead><tr>
		          	<th>id</th><th>Name</th><th>studentid</th><th>class</th>
		          </tr></thead>
       		<tr>
          			<td><%= acc1.getUser() %></td> <td><%= acc1.getUser() %></td> <td><%= acc1.getUser() %></td> <td><%= acc1.getUser() %></td>
          		</tr>
				<tr>
          			<td><%=acc2.getUser() %></td> <td><%=acc2.getUser()  %></td> <td><%=acc2.getUser()  %></td> <td><%=acc2.getUser()  %></td>
          		</tr> 
		         </table>
		      </div>
	      </div> 
      </div>
    </div>
  </div>

<%@ include file="/admin/footer-admin.jsp" %>