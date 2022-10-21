<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 영화 관리</title>
</head>
<body>
	<h1>SSAFY 영화 관리</h1>
	<form action="regist" method="POST">
		<fieldset>
			<legend>영화 정보 입력</legend>
			<label for="title">제목</label>
			<input type="text" id="title" name="title">
			<br>
			<label for="director">감독</label>
			<input type="text" id="director" name="director">
			<br>
			<label for="genre">장르</label>
			<input type="text" id="genre" name="genre">
			<br>
			<label for="runningTime">상영 시간</label>
			<input type="text" id="runningTime" name="runningTime">
			<br>
			<label for="img">이미지</label>
			<input type="file" id="img" name="img">
			<br>
			<input type="submit">
			<input type="reset">
			
		</fieldset>
	</form>
</body>
</html>