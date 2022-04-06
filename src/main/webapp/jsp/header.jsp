<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import="entities.Link" %>
<%@ page import="configs.HeaderConfig" %>
<%@ page import="java.util.List" %>
	<%
		HeaderConfig configs = new HeaderConfig();
		List<Link> links = configs.getLinks();
		pageContext.setAttribute("links", links);
	%>
	<ul>
		<c:forEach items="${links}" var="link">
		<a href="${link.getPath()}">${link.getTitle()}</a>
			
		</c:forEach>	
	</ul>