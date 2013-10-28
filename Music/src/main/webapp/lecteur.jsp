<jsp:include page="import/check_session.jsp"/>
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
	<div id="lecteur audio">
		<h1>Lecteur</h1>
		<p>
			Pour le lecteur en lui m&ecirc;me, on va utiliser <a
				href="http://www.alsacreations.fr/dewplayer.html">dewplayer</a>.
		</p>
	</div>
	<div id="liste lecture">
		<h1>Liste lecture</h1>
		<p>Pour chaque piste disponible, un clic modifiera dewplayer pour
			jouer la piste audio.</p>
		<p>On acc&egrave;dera a la piste audio via REST (ou autre).</p>
		<div id="paginator_liste_lecture">
		</div>
	</div>
</body>
<script type="text/javascript">
YUI().use("datatable", "datasource-get", "datasource-jsonschema", "datatable-datasource", function(Y) {
	
	var myDataSource = new Y.DataSource.Get({
	    source: "http://localhost:8080/music/bouchon/ListMusic.jsp?"
	});
	
	myDataSource.plug(Y.Plugin.DataSourceJSONSchema, {
        schema: {
        	resultListLocator: "list",
            resultFields: ["artiste", "titre"]
        }
    });
	
    var myDataTable = new Y.DataTable({
        columns:    ["Artiste", "Titre", "action"],
        scrollable: 'y',
        sortable: true
    });
 	
    myDataTable.plug(Y.Plugin.DataTableDataSource, {
        datasource: myDataSource
    });
    
    myDataTable.render('#paginator_liste_lecture');
    
    myDataTable.datasource.load();
 
});
</script>
</html>
