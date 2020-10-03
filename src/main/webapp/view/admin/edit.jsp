<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="newsAPI" value="/api/news"></c:url>
<c:url var="listURL" value="/admin/list"></c:url>
<c:url var="editURL" value="/admin/edit"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit page</title>
</head>
<body>
<div class="container-fluid">
<form class="form-horizontal" role="form" id = "formSubmit" name ="formSubmit" >
                                   <label class="my-1 mr-2" for="categoryCode">Thể loại</label>
  <select class="custom-select my-1 mr-sm-2" id="categoryCode" name="categoryCode">
  <c:if test="${empty model.categoryCode}">
    <option selected>--Thể loại--</option>
    <c:forEach var="item" items="${categories}">
    <option value="${item.code}">${item.name}</option>
    </c:forEach>
   </c:if>
   <c:if test="${not empty model.categoryCode}">
   
    <c:forEach var="item" items="${categories}">
    <option value="${item.code}"
    <c:if test="${item.code == model.categoryCode}"> selected = "selected"</c:if>>
    ${item.name}
    </option>
    </c:forEach>
   </c:if>
    
  </select>
									
									<div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Tiêu đề</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="tittle" name="tittle" placeholder="Title" value="${model.tittle}">
    </div>
  </div>
									<div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Ảnh bìa</label>
    <div class="col-sm-10">
      <input type="file" class="form-control" id="thumbnail" name="thumbnail" placeholder="Thumbnail" value="${model.thumbnail}">
    </div>
  </div>

									<div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Mô tả ngắn</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="shotDescription" name="shotDescription" placeholder="Short description" value="${model.shotDecription}">
    </div>
  </div>
									<div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Nội dung</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="content" name="content" placeholder="Content" value="${model.content}">
    </div>
  </div>
  <input type="hidden" value="${model.id}" id="id" name="id"></input>
									
									<div class="clearfix form-actions">
										<div class="col-md-offset-3 col-md-9">
											<button class="btn btn-info" type="button" id="btnInsertAndUpdate">
												<i class="ace-icon fa fa-check bigger-110"></i>
												OK
											</button>

											&nbsp; &nbsp; &nbsp;
											<button class="btn" type="reset">
												<i class="ace-icon fa fa-undo bigger-110"></i>
												Thoát
											</button>
										</div>
									</div>

</form>
</div>
<script type="text/javascript">
$('#btnInsertAndUpdate').click(function (e) {
  e.preventDefault();
  var data = {};
  var formData = $('#formSubmit').serializeArray();
  $.each(formData , function (i, v){
    data[""+v.name+""] = v.value;
  });
 var id = $('#id').val();
 if(id == "") {
	 addNews(data);
 }else{
	 updateNews(data); 
 }
});

function addNews(data) {
	$.ajax({
        url: '${newsAPI}',
        type: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        dataType: 'json',
        success: function(result){
        	window.location.href = "${listURL}?page=1&limit=2";
        },
        error: function(error){
        	window.location.href = "${listURL}?page=1&limit=2";
        }
    });
}

function updateNews(data) {
    $.ajax({
        url: '${newsAPI}',
        type: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(data),
        dataType: 'json',
        success: function(result){
        	window.location.href = "${listURL}?page=1&limit=2";
        },
        error: function(error){
        	window.location.href = "${listURL}?page=1&limit=2";
        }
    });
}
</script>
</body>
</html>