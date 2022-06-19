<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <div class="row justify-content-center">
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                <p class="text-center h1 fw-bold mb-3 mx-1 mx-md-4 mt-4">Register User</p>
				<form class="mx-1 mx-md-4"action="<%=request.getContextPath()%>/add" method="post">
                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="text" id="form3Example1c" class="form-control" name="name" />
                      <label class="form-label" for="form3Example1c">Name</label>
                    </div>
                  </div>
                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="text" id="form3Example3c" class="form-control" name="surname" required />
                      <label class="form-label" for="form3Example3c">Surname</label>
                    </div>
                  </div>
                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <select id="form3Example3c" class="form-control" name="gender" required>
                      <option value="null"></option>
    					<option value="Male">Male</option>
    					<option value="Female">Female</option>
   					 </select>
                      <label class="form-label" for="form3Example4c">Gender</label>
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="date" id="form3Example4cd" class="form-control" name="birthdate" required/>
                      <label class="form-label" for="form3Example4cd">Birthdate</label>
                    </div>
                  </div>
                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="text" id="form3Example4cd" class="form-control" name="work_address"/>
                      <label class="form-label" for="form3Example4cd">Work Address</label>
                    </div>
                  </div>
                  <div class="d-flex flex-row align-items-center mb-2">
                    <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="text" id="form3Example4cd" class="form-control" name="home_address"/>
                      <label class="form-label" for="form3Example4cd">Home Address</label>
                    </div>
                  </div>
                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4 gap-2">
                    <button type="submit" class="btn btn-primary btn-lg" value="addUser">Register</button>
                    <a class="btn btn-primary btn-lg" href="<%=request.getContextPath()%>/home">Home</a>
                  </div>
                </form>
              </div>
              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                  class="img-fluid" alt="Sample image">
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