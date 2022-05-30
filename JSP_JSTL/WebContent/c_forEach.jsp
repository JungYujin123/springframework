<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	int sum = 0;
	for (int i=1; i < 11; i++) {
		sum += i;
	}
	out.println("out.println(sum) : "+sum+"</br>");
%>

<% pageContext.setAttribute("sum", 0); %>
<c:set scope="page" var="sum" value="0" />
<c:forEach begin="1" end="10" step="1" var="i" >
	<c:set var="sum" value="${sum+i }" />
</c:forEach>


out.println(pageContext.getAttribute("sum")) : <% out.println(pageContext.getAttribute("sum")); %> </br>
pageContext.getAttribute("sum") : <%= pageContext.getAttribute("sum") %> </br>
달러{sum} : ${sum}
<hr/>


<%
	 List<String> strList = new ArrayList<String>();
	 strList.add("a");;
	 strList.add("b");;
	 
	 //꼭 null체크 먼저 해야 예외가 안 터짐
	 if(strList !=null) for(String str : strList){
		 out.println(str+"<br/>");
	 }

%>

<c:set var="strList" value="<%= strList %>" />
<!-- EL에서 for문은 null예외 안터짐
EL에서는 해당값이 null이거나 공백일 경우에는 
    아무 내용도 표시하지 않고 에러도 발생하지 않는다. -->
<c:forEach items="${strList }" var="str">
  ${str }<br/>
</c:forEach>

