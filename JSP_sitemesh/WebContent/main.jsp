<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!-- jsp 인크루드: 따로 컴파일, 헤더,메인,포터 헤드 바디설정 각각 -->
<%-- <jsp:include page="./header.jsp" /> --%>

<!--디랙티브 인크루드: 넘어와 같이 컴파일, 변수 공유 가능,
 주로 사용, 헤더 메인 포터 헤드 바디 설정 1개로 붙여지도록 -->
<%-- <%@ include file="./header.jsp" %> --%>

<title>main.jsp</title>

<head>
 <style>
 body{background: yellow;}</style>
</head>


<body>
  main.jsp<br/>
  header.jsp : message : ${message }
</body>
<%-- <jsp:include page="./footer.jsp" /> --%>
