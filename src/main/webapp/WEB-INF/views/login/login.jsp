<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/semantic.min.css"/>">
    <script
        src="https://code.jquery.com/jquery-3.1.1.min.js"
        integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
        crossorigin="anonymous"></script>
        <script src= <c:url value="/resources/js/semantic.min.js"/>></script>
       
        <style>
       
      
          @media only screen and (max-width: 700px) {
            .ui.fixed.menu {
              display: none !important;
            }
            .secondary.pointing.menu .item,
            .secondary.pointing.menu .menu {
              display: none;
            }
            .secondary.pointing.menu .toc.item {
              display: block;
            }
            .masthead.segment {
              min-height: 350px;
            }
            .masthead h1.ui.header {
              font-size: 2em;
              margin-top: 1.5em;
            }
            .masthead h2 {
              margin-top: 0.5em;
              font-size: 1.5em;
            }
          }

        body {
        background-color:white;
        }
        body > .grid {
        height: 100%;
        }
        .image {
        margin-top: -100px;
        }
        .column {
        max-width: 450px;
        }
        </style>
    <title>Document</title>
</head>
<body>
    <div class="ui middle aligned center aligned grid">
    <div class="column">
        <h2 class="ui blue image header">
        <div class="content">
           	 로그인
        </div>
        </h2>
        
        <form action="/authCheck" method="POST" class="ui large form">
	        <div class="ui stacked segment">
	            <div class="field">
	            <div class="ui left icon input">
	                <i class="user icon"></i>
	                <input name="USER_ID" id="" placeholder="아이디 입력(이메일)">
	            </div>
	            </div>
	            <div class="field">
	            <div class="ui left icon input">
	                <i class="lock icon"></i>
	                <input type="password" name="USER_PASSWORD" id ="" placeholder="비밀번호 입력">
	            </div>
	            </div>
	            <input class="ui fluid large blue submit button" type="submit" title="로그인" alt="로그인" value="로그인"></input>
	        </div>
	        <div class="ui error message"></div>
        </form>
        
        <div class="ui message">
	        <a href="#">아이디찾기  &nbsp|&nbsp   </a>
	        <a href="#">비밀번호찾기  &nbsp|&nbsp  </a>
	        <a href="#">가입하기</a>
        </div>
    </div>
    </div>
</body>
</html>