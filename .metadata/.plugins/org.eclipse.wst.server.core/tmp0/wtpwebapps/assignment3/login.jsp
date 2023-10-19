<%@ include file="header.jsp" %>
<div class="row shadow">
        <div class=" bg-white col-6 text-center login">
        <div>
            <h2>Sign in</h2>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="form-group">
                  <input  
                  required="required" name="username" type="text" 
                  class="form-control" placeholder="Enter username" id="username">
                </div>
                <div class="form-group">
                  <input oninvalid="this.setCustomValidity()" 
                  required="required" name="password" type="password" 
                  class="form-control" placeholder="Enter password" id="pwd">
                </div>
                <p><a href="/login">Forgot your password?</a></p>
                <button type="submit" class="btn btn-success">Login</button>
              </form>
              </div>
        </div>
        <div class=" text-white col-6 text-center welcome ">
               <div>
            <h2>Welcome Back!</h2>
            <p>To keep connected with us please login with your personal info</p>
        </div>  
        </div>        
    </div>
    <%@ include file="footer.jsp" %>