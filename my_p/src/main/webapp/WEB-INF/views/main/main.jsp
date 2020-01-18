<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<body>

	<div class="ui sidebar vertical inverted menu left" id="sideBar">
	  <c:forEach var="menu_list" items="${list}">
	  	<a class="item" href="${menu_list.ADDRESS}">${menu_list.MENU_NM}</a>
	  </c:forEach>
	</div>

    <section class="pusher">
        <div class="ui inverted vertical masthead center aligned segment">

          <div class="ui container">
            <div class="ui large secondary inverted pointing menu">
              <a class="toc item">
                <i class="sidebar icon"></i>
              </a>
              <a class="item">Home</a>
              <a class="item">맛집</a>
              <a class="item">게시판</a>
              <a class="item">크롤링</a>
              <a class="item" onclick="excelDown();">엑셀 다운로드</a>
              <div class="right item">
              <c:choose>
	              <c:when test="${msg == 'success'}">
	              	<h2>${sessionScope.userName} ${sessionScope.userId}님 환영합니다.</h2>
	              </c:when>
	              <c:otherwise>
	                <a class="ui inverted button">Log in</a>
	                <a class="ui inverted button">Sign Up</a>
	              </c:otherwise>
              </c:choose>
	              <div >
	              	<span style="font:9px solid; padding-left:10px;">ALL : ${sessionScope.totalCount}</span>
	              	<span style="font:9px solid;">Today : ${sessionScope.todayCount}</span>
	              </div>
              </div>
            </div>
          </div>

          <div class="ui text container">
            <h1 class="ui header inverted ">
                Welcome to functions
            </h1>
            <h2>I hope to provide you with some useful features.</h2>
            <div class="ui huge primary button" id ='side_btn'> ENTER</div>
          </div>

        </div>
        <div class="ui vertical stripe segment">
		    <div class="ui text container">
		      <h3 class="ui header">Breaking The Grid, Grabs Your Attention</h3>
		      <p>Instead of focusing on content creation and hard work, we have learned how to master the art of doing nothing by providing massive amounts of whitespace and generic content that can seem massive, monolithic and worth your attention.</p>
		      <a class="ui large button">Read More</a>
		      <h4 class="ui horizontal header divider">
		        <a href="#"> </a>
		      </h4>
		      <h3 class="ui header">Did We Tell You About Our Bananas?</h3>
		      <p>Yes I know you probably disregarded the earlier boasts as non-sequitur filler content, but its really true. It took years of gene splicing and combinatory DNA research, but our bananas can really dance.</p>
		      <a class="ui large button">Read More</a>
		    </div>
  		</div>

    </section>

         <!-- <table class="ui celled table">
            <thead>
                <tr>
                    <th>지역</th>
                    <td>도시</td>
                    <td>음식종류</td>
                    <td>대표메뉴</td>
                    <td>상호명</td>
                    <td>포털사이트 검색명</td>
                    <td>추천 이유</td>
                </tr>
            </thead>
        </table> -->
   <script>

   $(function(){

	   $('.toc.item').click(function(){
		   $('#sideBar').sidebar('toggle');
	   });

   });


  		$("#yamiBoard").on('click',function(){
        	location.href = "/moveBoard/list";
        });

        function excelDown(){
        	location.href = "${pageContext.request.contextPath}/exceldown";
        }

    </script>
    </body>

</html>
