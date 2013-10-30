<%if(session.getAttribute("sessionID") != null){return;}%>
<%= request.getParameter("callback") %>(
{"list":[
	{"id":"1","Artiste":"Interpol","Titre":"Slow Hands","moy":"4"},
	{"id":"2","Artiste":"Soulgrind","Titre":"Farewell to misery","moy":"5"},
	{"id":"3","Artiste":"Red Hot Chili Pepper","Titre":"Scar Tissue","moy":"5"},
	{"id":"4","Artiste":"Skid Row","Titre":"Monkey Business","moy":"3"},
	{"id":"5","Artiste":"Justin Bieber","Titre":"Baby","moy":"0"},
	{"id":"7","Artiste":"Haddaway","Titre":"What is love?","moy":"5"},
	{"id":"8","Artiste":"Bratisla Boys","Titre":"Stash Stash","moy":"2"},
	{"id":"6","Artiste":"Günter","Titre":"Ding Dong Song","moy":"0"}
]}
);