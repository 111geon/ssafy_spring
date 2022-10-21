<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- jstl의 core 라이브러리를 사용하기 위해 taglib를 이용한다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록 결과</title>
	<style>
		table, th, td {
		  border: 1px solid black;
		  border-collapse: collapse;
		  width: 300px;
		}
	</style>
</head>
<body>
	<h1>영화 등록 결과</h1>
	<h2>등록 영화 정보</h2>
	<table>
    	<thead>
     	<tr>
            <th>항목</th>
            <th>내용</th>
        </tr>
      </thead>
      <tbody>
        <tr>
            <td>영화 제목</td>
            <td>${movie.title }</td>
        </tr>
		<tr>
            <td>감독</td>
            <td>${movie.director }</td>
        </tr>
		<tr>
            <td>장르</td>
            <td>${movie.genre }</td>
        </tr>
		<tr>
            <td>상영 시간</td>
            <td>${movie.runningTime }</td>
        </tr>
        <tr>
            <td>이미지 이름</td>
            <td>${movie.img }</td>
        </tr>
      </tbody>
	</table>
	<img src="/ws/resources/upload/${movie.orgImg }">
	<a href="regist">추가등록</a>
</body>
</html>