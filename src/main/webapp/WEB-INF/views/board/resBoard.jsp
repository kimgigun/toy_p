<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <style>
                .hidden.menu {
                    display: none;
                  }
               
                  .masthead.segment {
                    min-height: 400px;
                    padding: 1em 0em;
                  }
                  .masthead .logo.item img {
                    margin-right: 1em;
                  }
                  .masthead .ui.menu .ui.button {
                    margin-left: 0.5em;
                  }
                  .masthead h1.ui.header {
                    margin-top: 1em;
                    margin-bottom: 0em;
                    font-size: 3em;
                    font-weight: normal;
                  }
                  .masthead h2 {
                    font-size: 1.7em;
                    font-weight: normal;
                  }
              
                  .ui.vertical.stripe {
                    padding: 8em 0em;
                  }
                  .ui.vertical.stripe h3 {
                    font-size: 2em;
                  }
                  .ui.vertical.stripe .button + h3,
                  .ui.vertical.stripe p + h3 {
                    margin-top: 3em;
                  }
                  .ui.vertical.stripe .floated.image {
                    clear: both;
                  }
                  .ui.vertical.stripe p {
                    font-size: 1.33em;
                  }
                  .ui.vertical.stripe .horizontal.divider {
                    margin: 3em 0em;
                  }
              
                  .quote.stripe.segment {
                    padding: 0em;
                  }
                  .quote.stripe.segment .grid .column {
                    padding-top: 5em;
                    padding-bottom: 5em;
                  }

                  .right.item .ui.inverted.button {
                    margin-left: 1em;
                  }
              
                  .footer.segment {
                    padding: 5em 0em;
                  }
              
                  .secondary.pointing.menu .toc.item {
                    display: none;
                  }
              
                /*   @media only screen and (max-width: 700px) {
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
                  } */
                 
                  body {
                    background-color: #FFFFFF;
                  }
                  .ui.menu .item img.logo {
                    margin-right: 1.5em;
                  }
                  .main.container {
                    margin-top: 7em;
                  }
                  .wireframe {
                    margin-top: 2em;
                  }
                  .ui.footer.segment {
                    margin: 5em 0em 0em;
                    padding: 5em 0em;
                  }
                  
          </style>

     <div>
       <div class="ui fluid main action input text container">
         <input type="text" placeholder="Search...">
         <select class="ui compact selection dropdown">
           <option value="all">NO</option>
           <option selected=""  value="articles">지역</option>
           <option value="products">도시</option>
           <option value="products">음식종류</option>
           <option value="products">NAME</option>
           <option value="products">등록일</option>
         </select>
         <div class="ui button">SEARCH</div>
       </div>
     </div>
     
  <div class="ui main container">
      <table class="ui celled padded table">
          <thead>
            <tr>
              <th>NO</th>
              <th>지역</th>
              <th>도시</th>
              <th>음식종류</th>
              <th>추천메뉴</th>
              <th>상호명</th>
              <th>등록 ID</th>
              <th>별점</th>
              <th>등록일</th>
              <th>READ</th>   
            </tr>
          </thead>
          <tbody id ="tbody">
          </tbody>
          <tfoot>
              <tr>
              <th colspan="11">
                <div class="ui right floated pagination menu" id='paging'>
                </div>
              </th>
            </tr>
           </tfoot>
        </table>
  </div>
<script>

		 function bodyContent(i){ 
			return '<tr onclick="moveDetail('+i+')">' 
		      +'<td id="rnum'+i+'"></td>'
		      +'<td id="area'+i+'"></td>'
		      +'<td id="cityName'+i+'"></td>'
		      +'<td id="foodType'+i+'"></td>'
		      +'<td id="bestMenu'+i+'"></td>'
		      +'<td id="shopName'+i+'"></td>'
		      +'<td id="regID'+i+'"></td>'
		      +'<td><div class="ui star rating" data-rating="3" data-max-rating="5" id="rating'+i+'">'
		      +'    <i class="icon active"></i>'
		      +'</div></td> '
		      +'<td id="regDt'+i+'"></td>'
		      +'<td id="readCnt'+i+'"></td>'
			  +'</tr>';
		}
		 
		 function pagingNum(firstPage,lastPage,currPage){
			 var page = "";
			page += '<a class="icon item">'
             +'<i class="left chevron icon" onclick="paging('+(currPage <= 1 ? 1 : currPage-1 )+');"></i>'
           	 +'</a>';
           	 
			 for(var i = firstPage; i <= lastPage ; i++){
				 if(i == currPage ){
				 page += '<a class="item" id = "page'+i+'" onclick="paging('+i+');" style="font-weight:bold; color:blue">'+i+'</a>';
				 }else{
				 page += '<a class="item" id = "page'+i+'" onclick="paging('+i+');">'+i+'</a>';
				 }
			 }
			 
			 page += '<a class="icon item">'
	             +'<i class="right chevron icon" onclick="paging('+(currPage+1)+');"></i>'
	           	 +'</a>';
	           	 
			 return page;
		 }
			  
		 
		function moveDetail(num){
			location.href = '/board/detail?pageNum='+num+1
		} 
		
	 	function paging(num){
			$.ajax({
				url: '/getBoard/list',
				method: 'POST',
				data : JSON.stringify({
					currPage : num
			    }),
				dataType:'json',
				contentType : 'application/json',
				success:function(data){
					$('#tbody').empty();
					$('#paging').empty();
					$.each(data.boardList,function(i,item){
						$('#tbody').append(bodyContent(i));
						
						$('#rnum'+i).text(item.rnum);
						$('#area'+i).text(item.area);
						$('#cityName'+i).text(item.cityname);
						$('#foodType'+i).text(item.foodtype);
						$('#bestMenu'+i).text(item.bestmenu);
						$('#shopName'+i).text(item.shopname);
						$('#reason'+i).text(item.reason);
						$('#regID'+i).text(item.reg_ID);
						$('#regDt'+i).text(item.reg_DT);
						$('#readCnt'+i).text(item.read_CNT);
					});
					
					$.each(data.boardInfo,function(i,item){
						$('#paging').append(pagingNum(item.firstPage,item.lastPage,item.currPage));
					});
				},
				error:function(x,s,m){
					alert(m);
				}
			});
			
 		}
	 	
	 	$(function(){
			paging(1);
		});
	 	
	 	
</script>
