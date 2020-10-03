<%@ include file="/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin page</title>
<link href='<c:url value="/template/admin/vendor/fontawesome-free/css/all.min.css"></c:url>' rel="stylesheet" type="text/css">
<link rel="stylesheet" href='<c:url value= "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></c:url>'>
  <!-- Page level plugin CSS-->
  <link href='<c:url value="/template/admin/vendor/datatables/dataTables.bootstrap4.css"></c:url>' rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href='<c:url value="/template/admin/css/sb-admin.css"></c:url>' rel="stylesheet">
  <script src='<c:url value="/template/admin/vendor/jquery/jquery.min.js"></c:url>'></script>
  <script src='<c:url value="/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></c:url>'></script>

  <!-- Core plugin JavaScript-->
  <script src='<c:url value="/template/admin/vendor/jquery-easing/jquery.easing.min.js"></c:url>'></script>

  <!-- Page level plugin JavaScript-->
  <script src='<c:url value="/template/admin/vendor/chart.js/Chart.min.js"></c:url>'></script>
  <script src='<c:url value="/template/admin/vendor/datatables/jquery.dataTables.js"></c:url>'></script>
  <script src='<c:url value="/template/admin/vendor/datatables/dataTables.bootstrap4.js"></c:url>'></script>

  <!-- Custom scripts for all pages-->
  <script src='<c:url value="/template/admin/js/sb-admin.min.js"></c:url>'></script>

  <!-- Demo scripts for this page-->
  <script src='<c:url value="/template/admin/js/demo/datatables-demo.js"></c:url>'></script>
  <script src='<c:url value="/template/admin/js/demo/chart-area-demo.js"></c:url>'></script>
  <script src='<c:url value="/template/paging/jquery.twbsPagination.js"/>' type="text/javascript"></script>
</head>
<body id="page-top">
<%@ include file="/common/admin/header.jsp" %>
<div id="wrapper">

<%@ include file="/common/admin/menu.jsp" %>

<div id="content-wrapper">
<dec:body/>
<%@ include file="/common/admin/footer.jsp" %>
</div>
</div>

<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  
 

</body>
</html>