$(function(){
	/*마우스 오버 상위 카테고리 가져오기*/
	$(document).on('mouseover', '#goodsTopCategoryBtn', function(){
		
		var $goodsTopCategoryBtn = $("#goodsTopCategoryBtn").html();
		var $goodsTopCategoryBtn
		console.log("작동");
		
		
		var request = $.ajax({
			url: "/topCategory",
			method: "GET"
		});
		
		
		request.done(function( data ) {
			console.log(data)
			var html = '', $goodsTopCategoryUl = $('#goodsTopCategoryUl');
			if(data.length == 0){
				html += '<li value=""></li>';
			}else{ 								
				for(var i=0; i < data.length; i++){
					html += '<li data-cateCode="'+data[i].goodsTopCategoryCode+'"> ' + '<a href="#">' + data[i].goodsTopCategoryName + '</a>' + '</li>';
				}
			}
			$goodsTopCategoryUl.html(html);
		});
		
		request.fail(function( jqXHR, textStatus ) {
			alert( "Request failed: " + textStatus );
		});
	});
	/*마우스 오버 상위 카테고리 클릭 시 상품 조회 만들기*/
	//코드 작성 아직 안함
	
	/*마우스 오버 후 하위 카테고리 가져오기*/
	$(document).on('mouseover', '#goodsTopCategoryUl > li > a', function(){
		
		console.log("작동");
		var $goodsTopcate = $(this).parent();
		var goodsTopCategoryCode = $(this).parent().attr("data-cateCode");
		console.log(goodsTopCategoryCode);
		
	
		var request = $.ajax({
			url: "/subCategory",
			method: "GET",
			data: { "goodsTopCategoryCode" : goodsTopCategoryCode},
			dataType: "json"
		});
		
		
		request.done(function( data ) {
			console.log(data)
			$('#goodsTopCategoryUl li a').empty();
			console.log(data.length);
			console.log($goodsTopcate);
			var html = '', $goodsSubCategoryUl = $('#goodsTopCategoryUl li a');
			if(data.length == 0){
				html += '<li value=""></li>';
			}else{ 								
				for(var i=0; i < data.length; i++){
					html += '<li data-cateCode="'+data[i].goodsSubCategoryCode+'"> ' + '<a href="#">' + data[i].goodsSubCategoryName + '</a>' + '</li>';
				}
			}
			$goodsTopcate.html(html);
			
		});
		
		request.fail(function( jqXHR, textStatus ) {
			alert( "Request failed: " + textStatus );
		});
		
	});
});