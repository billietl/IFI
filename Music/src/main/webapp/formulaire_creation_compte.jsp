<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<script src="http://yui.yahooapis.com/3.13.0/build/yui/yui-min.js"></script>
<title>TIIR Web Music</title>
</head>
<body>
	<jsp:include page="import/fucking_pub.jsp" />
	<h1>Le formulaire d'inscription de noob :</h1>
	<form id="formulaire" method="POST"
		action="service_creation_compte_ici" enctype="x-www-form-urlencoded">
		Pseudo : <input type="text" name="pseudo" id="pseudo" /><span
			id="pseudo_validator">Il faut qu'on puisse te nommer !</span><br /> Adresse e-mail : <input
			type="text" name="email" id="email" /><span id="email_validator">Comment on va te spammer sans ton adresse e-mail ?</span><br />
		Mot de passe : <input type="password" name="passwd" id="passwd" /><span
			id="passwd_validator">Tu appelles &ccedil;a un mot de passe ?</span><br /> Confirmez le mot de passe : <input
			type="password" name="passwd_bis" id="passwd_bis" /><span
			id="passwd_bis_validator">Nope, c'est pas le m&ecirc;me...</span><br /> <input id="submit"
			type="submit" value="CREATION !!!" />
	</form>
</body>
<script type="text/javascript">
YUI().use('gallery-formvalidator', function(Y){
	var form = new Y.Validator({
		form: "formulaire",
        fieldJSON:[
            {
	            type:Y.TextBaseField,
                atts:{
                	incorrectIndicator:'pseudo_validator',
    	            inputDOM:'pseudo',
                    maxLength:30,
                    regex:/[a-zA-Z][a-zA-Z0-9]*/
                }
            },
            {
            	type:Y.TextBaseField,
                atts:{
                	incorrectIndicator:'email_validator',
    	            inputDOM:'email',
                    textType: 'email'
                }
            },
        	{
        		type:Y.PasswordField,
                atts:{
                	requiredLevel:'med',
                	incorrectIndicator:'passwd_validator',
                    inputDOM:'passwd'
                }
        	},
        	{
        	    type:Y.MatchField, 
        	    atts:{
        	    	incorrectIndicator:'passwd_bis_validator',
        	        inputDOM:'passwd_bis', 
        	        matchDOM:'passwd',
        	    } 
        	}
        ]
	});
});
</script>
</html>
