<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%if(session.getAttribute("sessionID") != null){return;}%>
<%= request.getParameter("callback") %>(
{"list":[
	<
	{
	"id":"${map.keys()[1].key.getMusiqueId()}",
	"Artiste":"${musique.key.getArtiste()}",
	"Titre":"${musique/key.getTitre()}",
	"moy":"${musique.value}"
	}
	<c:forEach var="musique" items="${map}">
		,{
		"id":"${musique.key.getMusiqueId()}",
		"Artiste":"${musique.key.getArtiste()}",
		"Titre":"${musique/key.getTitre()}",
		"moy":"${musique.value}"
		}
	</c:forEach>
]}
);