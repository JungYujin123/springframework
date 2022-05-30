<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>


<script>
  alert('로그인은 필수입니다.');
   //열려진 창이 로그인 안하고 6분 지나면 닫고 지정 창으로 이동 
   if(window.opener){
	   window.close();
	   window.opener.parent.location.href="<%=request.getContextPath()%>/";
   }else{
	   window.parent.location.href="<%=request.getContextPath()%>/";
   }
</script>