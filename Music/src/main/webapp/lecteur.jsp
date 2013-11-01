<jsp:include page="import/check_session.jsp"/>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.13.0/build/cssbase/cssbase-min.css">
<script src="http://yui.yahooapis.com/3.13.0/build/yui/yui-min.js"></script>
<script type="text/javascript">
	var play = function(music_id){
		alert("Vous voulez jouer la musique d'id "+music_id);
	};
	var vote = null;
</script>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body class="yui3-skin-sam">
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
		<div id="paginator">
		</div>
	</div>
</body>
<script type="text/javascript">
YUI().use("io-base", "datatable", "datasource-get", "datasource-jsonschema", "datatable-datasource", function(Y) {
	// Gestion de la liste des titres
	var myDataSource = new Y.DataSource.Get({source: "http://localhost:8080/music/bouchon/ListMusic.jsp?format=json&"});
	myDataSource.plug(Y.Plugin.DataSourceJSONSchema, {
        schema: {
        	resultListLocator: "list",
            resultFields: ["Artiste", "Titre", "id", "moy"]
        }
    });
	function format_play(o){
		return "<center><a href=\"#\" onclick=\"play("+o.data.id+")\"><img src=\"img/play.jpg\" alt=\"Play\" height=\"42\" width=\"42\"/></a></center>";
	}
	function format_vote(o){
		 return "<center><select id='vote_select"+o.data.id+"' onChange='vote("+o.data.id+", document.getElementById(\"vote_select"+o.data.id+"\").selectedIndex)'><option value='-1' selected>Choisissez une note</option><option>0</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option></select></center>";
	}
	function format_note(o){
		var note="";
		switch(o.data.moy){
		default:note='.....';break;
		case "0":note='.....';break;
		case "1":note='|....';break;
		case "2":note='||...';break;
		case "3":note='|||..';break;
		case "4":note='||||.';break;
		case "5":note='|||||';break;
		}
		return "<center>"+note+"</center>";
	}
    var myDataTable = new Y.DataTable({
        columns:    [
                     { key: "Artiste", sortable: true}, 
                     { key: "Titre", sortable: true},
                     { label: "Action", formatter: format_play, allowHTML: true }, 
                     { label: "Note", formatter: format_note, allowHTML: true, sortable: true,
                    	 sortFn: function(a,b,desc){
                    		 var aval = a.get("moy"),
                    			 bval = b.get("moy"),
                    			 order= aval>bval?-1:1;
                    			 order=desc?-order:order;
                    		 return aval==bval?0:order;
                    	 }},
			{ label: "Voter", formatter: format_vote, allowHTML: true}],
        scrollable: 'y',
        sortBy: {Artiste : 1}
    });
    myDataTable.plug(Y.Plugin.DataTableDataSource, {datasource: myDataSource});
    myDataTable.render('#paginator_liste_lecture');
    myDataTable.datasource.load();
    
    // Gestion des votes asynchrones
    Y.on('io:complete', function(id,o,args){
		if(o.responseText.contains("1")){
			alert("Merci pour le vote !");
		}else{
			alert("Désolé, mais tu as déjà voté pour ce titre !")
		}
	}, Y, null);
    vote = function(music_id, note){
    	if(note != -1){
    	Y.io("bouchon/NoteMusic.jsp?note=\""+note+"\"&mid=\""+music_id+"\"");
	}
    }; 
});
</script>
</html>
