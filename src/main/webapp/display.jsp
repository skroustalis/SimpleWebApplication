<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.User"%>
<%@page import="model.Address"%> 
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Web Application</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
 <section class="vh-100" style="background-color: #eee;">
  <div class="container h-10">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-12 col-md-11">
        <div class="card text-black mt-5" style="border-radius: 25px;">
          <div class="card-body p-md-6">
            <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Display User</p>             
					<%
						List<User> list = (List<User>)request.getAttribute("listUser");
							for (User c: list) {
							Address adr = c.getAddress(); 	
					 %>					 	
 					 <div class="card">
					    <div class="card-header text-center">
					      <a class="btn" data-bs-toggle="collapse" href="#collapse<%=c.getId()%>">
					        <%=c.getName()%> <%=c.getSurname()%>
					      </a>
					    </div>
					    <div id="collapse<%=c.getId()%>" class="collapse">
					    <div class="card-body">
					    <ul class="list-group list-group-light text-center h6">
					        <li class="list-group-item ">Name:<%=c.getName()%></li>
					        <li class="list-group-item ">Surname:<%=c.getSurname()%></li>
					        <li class="list-group-item ">Gerder:<%=c.getGender()%></li>
					        <li class="list-group-item ">Birthdate:<%=c.getBirthdate()%></li>
					        <li class="list-group-item ">Work Address:<%=adr.getWork_address()%></li>
					        <li class="list-group-item ">Home Address:<%=adr.getHome_address()%></li>
					        <a  class="btn btn-danger" href="<%=request.getContextPath()%>/delete?id=<%=c.getId()%>">Delete User</a>
					     </ul>
					    </div>
					    </div>
					  </div>
					 <%}%>
			 <div class="d-grid row justify-content-center mt-5">
            	<div class="mb-5">
						  <a  class="btn btn-primary" href="<%=request.getContextPath()%>/register">New User</a>
						  <a  class="btn btn-primary" href="<%=request.getContextPath()%>/home">Home</a>
			   </div> 
			</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section> 
</body>
</html>
