<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">

<!-- Font Awesome Icons -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/bootstrap/dist/css/adminlte.min.css">

</head>
<body>
	<form action="insert" method="post">
	
  <!-- Content Wrapper. Contains page content -->
  <div >
  	 <section class="content-header">
	  	<div class="container-fluid">
	  		<div class="row md-2">
	  			<div class="col-sm-6">
	  				<h1>회원 등록 페이지</h1>  				
	  			</div>
	  			<div class="col-sm-6">
	  				<ol class="breadcrumb float-sm-right">
			        <li class="breadcrumb-item">
			        	<a href="#">
				        	<i class="fa fa-dashboard">회원 등록</i>
				        </a>
			        </li>
			        <li class="breadcrumb-item active">
			        	상세보기
			        </li>		        
	    	  </ol>
	  			</div>
	  		</div>
	  	</div>
  	</section>
    <!-- Main content -->
    <section class="content register-page">       
		<div class="register-box">         
	    	<form role="form" class="form-horizontal"  method="post">
	        	<div class="register-card-body" >
	            	<div class="row"  style="height:200px;">
						<div class="mailbox-attachments clearfix col-md-12" style="text-align: center;">							
							<div id="pictureView" data-id="${member.id }" style="border: 1px solid green; height: 200px; width: 140px; margin: 0 auto;"></div>														
						</div>
					</div>
					<br />
	                <div class="form-group row" >
	                  <label for="inputEmail3" class="col-sm-3 control-label text-right">아이디</label>
	
	                  <div class="col-sm-9">
	                    <input name="id" type="text" class="form-control" autocomplete="off">
	                  </div>
	                </div>	               
	                
	                <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">이  름</label>
	
	                  <div class="col-sm-9">
	                    <input name="name" type="text" class="form-control">
	                  </div>
	                </div>
	                
	                 <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">비밀번호</label>
	
	                  <div class="col-sm-9">
	                    <input name="password" type="password" class="form-control">
	                  </div>
	                </div>
	                
	                  <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">주 소</label>
	
	                  <div class="col-sm-9">
	                    <input name="address" type="text" class="form-control">
	                  </div>
	                </div>
	                
	                 <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">이메일</label>
	
	                  <div class="col-sm-9">
	                    <input name="email" type="email" class="form-control">
	                  </div>
	                </div>
	                
	                 <div class="form-group row">
	                  <label for="inputPassword3" class="col-sm-3 control-label text-right">전화번호</label>
	                  <div class="col-sm-9">   
	                  	<input name="phone" type="text" class="form-control">	                
	                  </div>                  
	                </div>               
	              </div>  
		          <div class="card-footer" style="padding:5px 0;" >
		          		<div class="row">
		          	<%-- 	<c:if test="${loginUser.id eq member.id }"> --%>
			          		<div class="col-sm-3 text-center">
			                	<input type="submit" class="btn btn-primary pull-right" value="회원 저장">
			          		</div>
		          		
			          	
			       
		          		<%-- </c:if> --%>
		          	
			          		<div class="col-sm-3 text-center">
			            		<button type="button" id="listBtn" onclick="top.window.close()" class="btn btn-primary pull-right">닫 기</button>
			            	</div>
		          	    </div>  	
		          </div>
	      	  </form>
      	  </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 </form>
  
<!-- jQuery -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.min.js"></script>
	
	

	
<!-- 	<h1>회원 등록</h1>
	<hr/>
<form action="insert" method="post">
	 <table>
	     <tr>
	     <td>아이디</td>
		 <td><input name="id" type="text"></td>
         </tr>
         
         <tr>
	     <td>이름</td>
		 <td><input name="name" type="text" ></td>
         </tr>
         
         <tr>
	     <td>패스워드</td>
		 <td><input name="pwd" type="text"></td>
         </tr>
         
         <tr>
	     <td>주소</td>
		 <td><input name="address" type="text"></td>
         </tr>
         
         <tr>
	     <td>email</td>
		 <td><input name="email" type="text"></td>
         </tr>
         
         <tr>
	     <td>번호</td>
		 <td><input name="phone" type="text" ></td>
         </tr>

	</table>
	<input type="submit" value="회원 저장"> &nbsp;&nbsp;&nbsp;&nbsp;<button type="button" onclick="history.go(-1)">취소</button>
</form> -->

</body>
</html>