<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<c:set var="lista" value="${dao.lista}"/>

<table>
  <!-- percorre contatos montando as linhas da tabela -->
  <c:forEach var="contato" items="${dao.lista}">
    <tr>
      <td>${contato.nome}</td>
      <td>
      <c:if test="${not empty contato.email}">
      	<a href="mailto:${contato.email}">${contato.email}</a>
      </c:if>
      </td>
      <td>${contato.endereco}</td>
      <td>${contato.dataNascimentoFormatada}</td>
      <td><a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a> </td>
    </tr>
  </c:forEach>
</table>

<c:import url="rodape.jsp" />

</body>
</html>