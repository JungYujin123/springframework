<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">

<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/dist/css/adminlte.min.css">

</head>

<body>
	<div class="card card-primary">
		<div class="card-header">
			<h3 class="card-title">회원 정보 수정</h3>
		</div>

		<form action="update" method="post" name="formData">

			<div class="card-body">


				<div class="form-group">
					<label for="exampleInputEmail1">아이디</label>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ${member.id }<input
						type="hidden" class="form-control" name="id" value="${member.id }">
				</div>


s

				<div class="form-group">
					<label for="exampleInputPassword1">이름</label> <input type="text"
						class="form-control" name="name" value="${member.name }">
				</div>



				<div class="form-group">
					<label for="exampleInputPassword1">비밀번호</label> <input
						type="password" class="form-control" name="password"
						value="Password">
				</div>


				<div class="form-group">
					<label for="exampleInputPassword1">주소</label> <input type="text"
						class="form-control" name="address" value="${member.address }">
				</div>

				<div class="form-group">
					<label for="exampleInputPassword1">이메일</label> <input type="email"
						class="form-control" name="email" value="${member.email }">
				</div>

				<div class="form-group">
					<label for="exampleInputPassword1">휴대폰번호</label> <input type="text"
						class="form-control" name="phone" value="${member.phone }">
				</div>
			</div>




			<div class="card-footer">
				<!-- <button type="submit" class="btn btn-primary">수정 완료</button> -->
				<input type="button" class="btn btn-primary" onclick="submitForm()"
					value="수정 완료"> &nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-primary"
					onclick="top.window.close()">닫기</button>
			</div>
		</form>
	</div>






	<!-- jQuery -->
	<script
		src="<%=request.getContextPath()%>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script
		src="<%=request.getContextPath()%>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script
		src="<%=request.getContextPath()%>/resources/bootstrap/dist/js/adminlte.min.js"></script>





	<script type="text/javascript">
		function submitForm() {
			var form = document.querySelector("form[name=formData]");

			var result = form.submit();

			alert("수정이 완료되었습니다.");

		}
	</script>
    <script>
		opener.location.reload();
	</script>
</body>
</html>