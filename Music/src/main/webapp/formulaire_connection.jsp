<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.13.0/build/cssbase/cssbase-min.css">
<script src="http://yui.yahooapis.com/3.13.0/build/yui/yui-min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body class="yui3-cssbase">
	<jsp:include page="import/fucking_pub.jsp" />
	<h2>Le formulaire de connexion de madame :</h2>
	<form id="formulaire" method="POST" action="service_connexion_ici"
		enctype="x-www-form-urlencoded">
		<br /> Pseudo : <input type="text" name="login" id="login" /><br /> Mot de
		passe : <input type="password" name="passwd" id="passwd" /><br /> <input
			type="submit" value="CONNEXION !!!" />
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
    	            inputDOM:'login'
                }
            },
        	{
        		type:Y.PasswordField,
                atts:{
                    inputDOM:'passwd'
                }
        	}
        ]
	});
});
</script>
</html>
