<%@page import="br.ufpr.dao.ContatoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="cabecalho.jsp" />


 <!-- cria o DAO -->
<jsp:useBean id="dao" class="br.ufpr.dao.ContatoDao"/>
 
<c:set var="test" value="${dao.lista}" scope="request"/>

<display:table name="test" >
  <display:column property="nome" title="Nome" />
  <display:column property="email" title="E-mail" />
  <display:column property="endereco" title="Endereço" />
  <display:column property="dataNascimentoFormatada" title="Data de Nascimento"/>
  <display:column property="id" href="mvc?logica=RemoveContatoLogica" paramId="id" value="Remover" />
</display:table>

<c:import url="rodape.jsp" />

</body>
</html>