<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <jsp:include page="header.jsp" />
    
    
    
    
    <div class="container-fluid">
			<h1 align="center" style="margin-top: 130px;">Employee Register Form</h1>
			<div class="row">
				
				<div class="col-lg-2"></div>
	
				<div class="col-lg-8" style="margin-top: 50px;">

					<form ng-app="employeeApp" ng-controller="employeeController">

						<div class="form-group" style="width: 400px">

							<label for="formGroupExampleInputFN">First Name</label> <input
								type="text" class="form-control" id="formGroupExampleInputFN"
								placeholder="Write Employee First Name"
								ng-model="empobj.first_name" />
						</div>

						<div class="form-group" style="width: 400px">

							<label for="formGroupExampleInputSN">Surname</label> <input
								type="text" class="form-control" id="formGroupExampleInputSN"
								placeholder="Write Employee SurName" ng-model="empobj.surname" />
						</div>


						<div class="form-group" style="width: 400px">


							<label for="formGroupExampleInputDOB">Date of Birth</label>
							<input
								type="date" class="form-control" id="formGroupExampleInputDOB"
								name="dob-start" value="yyyy-MM-dd" min="1900-01-01"
								max="2100-12-31" ng-model="empobj.dob">

						</div>


						<div class="form-group">
						
							<label for="formGroupExampleInputGEN">Gender</label>
						
						</div>

						<div class="form-check form-check-inline">

							<label class="radio-inline"> <input type="radio" id="formGroupExampleInputGENM" name="gender" value="Male" ng-model="empobj.gender">Male</label>
							
							<label class="radio-inline"><input type="radio" id="formGroupExampleInputGENFM" name="gender" value="Female" ng-model="empobj.gender">Female</label>
								
						</div>


						<div class="form-group" style="width: 400px">

							<label for="formGroupExampleInputEM">Email</label> <input
								type="email" class="form-control" id="formGroupExampleInputEM"
								placeholder="Write Employee E-mail Address"
								ng-model="empobj.email">
						</div>



						<div class="form-group" style="width: 400px">


							<label for="formGroupExampleInputCN">Contact Number</label> <input
								type="text" class="form-control" id="formGroupExampleInputCN"
								placeholder="Write Employee number" ng-model="empobj.contact_no">
						</div>


						<div class="form-group" style="width: 400px">
							
							<label for="formGroupExampleInputAdd">Address</label>
							<textarea rows="3" cols="6" class="form-control" id="formGroupExampleInputAdd"
								placeholder="Write Employee Address" ng-model="empobj.address">
						</textarea>
						</div>


						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputDep">Department</label>
							<input type="text" class="form-control"
								id="formGroupExampleInputDep"
								placeholder="Write Employee Department"
								ng-model="empobj.department">
						</div>


						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputDes">Designation</label>
							<input type="text" class="form-control"
								id="formGroupExampleInputDes"
								placeholder="Write Employee Designation"
								ng-model="empobj.designation">
						</div>



						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputST">Status</label>
							<input type="text" class="form-control"
								id="formGroupExampleInputST" placeholder="Write Employee Status"
								ng-model="empobj.status">
						</div>

						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputDOH">Date of Hired</label>
							<input type="date" class="form-control" id="formGroupExampleInputDOH"
								name="doh-start" value="yyyy-MM-dd" min="1900-01-01"
								max="2100-12-31" ng-model="empobj.doh">

						</div>

						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputDOH">Basic Salary</label>
							<input type="number" class="form-control"
								id="exampleInputbasic_salary"
								placeholder="Write Employee Basic_Salary"
								ng-model="empobj.basic_salary">
						</div>
						
						
						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputUN">Username</label>
							<input type="text" class="form-control"
								id="formGroupExampleInputUN" placeholder="Write Employee Username"
								ng-model="empobj.username">
						</div>
						
						
						
						<div class="form-group" style="width: 400px">

							
							<label for="formGroupExampleInputP">Password</label>
							<input type="text" class="form-control"
								id="formGroupExampleInputP" placeholder="Write Employee Password"
								ng-model="empobj.password">
						</div>
						

						<!-- <a href="javascript:void(0)" -->

						<button type="submit" class="btn btn-success"
							ng-click="onEmpSubmit()">Submit</button>

					</form>

				</div>

				
				<div class="col-lg-2"></div>
			</div>
		</div>
    
    
    
    
    
    
    
    <jsp:include page="footer.jsp" />