<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'text.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script src="<%=basePath%>admin/javascript/jquery.min.js"></script>



  </head>
  
  <body>
       <form action="uploadPeLoOrderServlet" method="post">
         <button type="submit">下载</button>
        
       </form>
      
      
      
<script type="text/javascript">
$.ajax({
//     url: 'https://restapi.amap.com/v3/ip?ip=114.247.50.2&output=json&key=0a8f5b32f5bbb5f63bbc8077d0da2db2',
    url: 'https://apis.map.qq.com/ws/location/v1/ip?output=jsonp&key=4FUBZ-CK33Q-ZDK5T-GMZ4L-UU34Z-PBFXL',
    type: 'get',
    dataType: 'jsonp',  // 请求方式为jsonp
     crossDomain: true,
	 success: function(data) {
	 
// 	 	x.innerHTML = data.result.ad_info.district;
	 	alert("您所在的城市是：" + data.result.ad_info.district + ", ip是："+ data.result.ip);
	 },

});
</script> 
    
  </body>
</html>
