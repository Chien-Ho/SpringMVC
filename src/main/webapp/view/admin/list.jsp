<%@ include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<form action ='<c:url value= "/admin/list?page=${model.page}&limit=${model.limit}"/>' id = "formSubmit" method="get">
        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
          <li class="breadcrumb-item">
            <a href="#">Admin</a>
          </li>
          <li class="breadcrumb-item active">Overview</li>
        </ol>
<div class="widget-box table-filter">
          <div class="table-btn-controls">
            <div class="pull-right tableTools-container">
              <div class="dt-buttons btn-overlap btn-group">
                <c:url var="#" value="#"/>
                <a 
                   class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                   title='Add News' href='<c:url value="/admin/edit"></c:url>'>
                      <span>
                        <i class="fa fa-plus-circle bigger-110 purple"></i>
                      </span>
                </a>
                <button id="btnDelete" type="button" onclick="warningBeforeDelete()"
                    class="dt-button buttons-html5 btn btn-white btn-primary btn-bold" data-toggle="tooltip" title='Xóa bài viết'>
                        <span>
                          <i class="fa fa-trash-o bigger-110 pink"></i>
                        </span>
                </button>
              </div>
            </div>
          </div>
</div>
<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Tên bài viết</th>
        <th>Mô tả ngắn</th>
        <th>Thao tác</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${model.listResult}">
     <tr>
        <td>${item.tittle}</td>
        <td>${item.shotDecription}</td>
        
        <td>
        <c:url var = "editURL" value= "/admin/edit">
       
        </c:url>
        <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip" 
        title = "update news" href ='${editURL}?id=${item.id}'>
        <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
        </a>
        </td>
      </tr>
      </c:forEach>
      
     
    </tbody>
  </table>
   <ul class="pagination" id="pagination"></ul>
  <input type="hidden" value="" id="page" name="page"/>
  <input type="hidden" value="" id="limit" name="limit"/>
</div>
</form>
</div>

<script type="text/javascript">
var currentPage = ${model.page};
var totalPages = ${model.totalPage};
    $(function () {
        window.pagObj = $('#pagination').twbsPagination({
            totalPages: totalPages,
            startPage: currentPage,
            visiblePages: 10,
            onPageClick: function (event, page) {
                if(currentPage != page) {
                	$('#page').val(page),
                	$('#limit').val(2);
                	$('#formSubmit').submit();
                }
            }
        });
        });
    
</script>
</body>
</html>