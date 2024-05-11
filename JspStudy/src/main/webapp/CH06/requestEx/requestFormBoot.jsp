<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container" style="max-width: 600px; border:1px solid #eee; margin-top:50px; border-radius: 5px; box-shadow: 0 10px 20px rgba(0,0,0,0.3); padding: 20px">
		<p class="text-start fs-1 fw-bold">Registration</p>
		<form action="requestProcBoot.jsp" method="post">
			<div class="mb-3">
			  <label for="exampleInputEmail1" class="form-label fw-bold fs-4">User Name</label>
			  <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="username">
			</div>
			
			<div class="mb-3">
			  <label for="exampleInputEmail1" class="form-label fw-bold fs-4">Email address</label>
			  <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
			</div>
			
			<div class="mb-3">
			  <label for="exampleInputEmail1" class="form-label fw-bold fs-4">Telephone</label>
			  <input type="tel" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="tel">
			</div>
			
			<div class="mb-3">
			  <label for="exampleInputEmail1" class="form-label fw-bold fs-4">Hobby</label>
			  <select class="form-select" aria-label="Default select example" name="hobby">
				  <option value="수영" selected>수영</option>
				  <option value="걷기">걷기</option>
				  <option value="숨쉬기">숨쉬기</option>
				</select>
			</div>
		  	
		  	<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label fw-bold fs-4">직업</label>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="소프트웨어 엔지니어" id="flexCheckDefault" name="job">
					<label class="form-check-label" for="flexCheckDefault">
						소프트웨어 엔지니어
					</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="DB 엔지니어" id="flexCheckDefault" name="job">
					<label class="form-check-label" for="flexCheckDefault">
						DB 엔지니어
					</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="UI/UX 엔지니어" id="flexCheckDefault" name="job">
					<label class="form-check-label" for="flexCheckDefault">
						UI/UX 엔지니어
					</label>
				</div>
			</div>
				
				
			
		  	<button type="submit" class="btn btn-primary">확인</button>
		  	<button type="reset" class="btn btn-primary">취소</button>
		</form>
	</div>
</body>
</html>