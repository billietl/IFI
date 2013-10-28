<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<script src="http://yui.yahooapis.com/3.13.0/build/yui/yui-min.js"></script>
<title>TIIR Web Music</title>
</head>
<body class="yui3-skin-sam">
	<jsp:include page="fucking_pub.jsp"/>
	<h1>Le formulaire d'inscription de noob :</h1>
	<center>
		<form id="formulaire" method="POST" action="service_creation_compte_ici"
			enctype="x-www-form-urlencoded">
			Pseudo : <input type="text" name="pseudo" id="pseudo" /><br />
			Adresse e-mail : <input type="text" name="email" id="email" /><br />
			Mot de passe : <input type="password" name="passwd" id="passwd" /><br />
			Confirmez le mot de passe : <input type="password" name="passwd_bis" id="passwd_bis" /><br />
			<input id="submit" type="submit" value="CREATION !!!" />
		</form>
	</center>
</body>
<script type="text/javascript">
YUI().use('event', 'node', function(Y){
    Y.one('#formulaire').on("submit", function(e){
    	var OK = true;
    	if(Y.one('#pseudo').get('value') == ''){OK = false;}
    	if(Y.one('#email').get('value') == ''){OK = false;}
    	if(Y.one('#passwd').get('value') == Y.one('#passwd_bis').get('value')){OK = false;}
    	if(!OK){e.preventDefault();}
    });
});
</script>
</html>
