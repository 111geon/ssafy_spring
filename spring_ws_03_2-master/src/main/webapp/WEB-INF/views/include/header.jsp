<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ssafy.ws.model.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set value="${pageContext.request.contextPath }" scope="session" var="root"></c:set>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
<link rel="stylesheet" href="${root }/resources/css/common.css">
<style>
</style>
<div class="container">
	<h1 class="display-4 text-center">영화 관리</h1>
	<br>
        <c:choose>
            <c:when test="${empty sessionScope.loginUser}">
            	<div style="text-align: right;">
	            	<form action="login" method="post">
	                	<input type="text" name="id" placeholder="id">
	                	<input type="password" name="pw" placeholder="password">
	                	<input type="submit" value="로그인">
	                </form>
            	</div>
            </c:when>
            <c:otherwise>
            	<div style="text-align: right;">
	                <span>${loginUser }님 반갑습니다.</span> 
	                <a href="logout">로그아웃</a>
                </div>
            </c:otherwise>
        </c:choose>
</div>
<hr>
