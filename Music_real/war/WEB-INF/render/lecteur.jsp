<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/render/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="http://yui.yahooapis.com/3.13.0/build/cssbase/cssbase-min.css">
<link type="text/css" href="player/skin/jplayer.blue.monday.css"
	rel="stylesheet" />
<script src="http://yui.yahooapis.com/3.13.0/build/yui/yui-min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<script type="text/javascript" src="player/jquery.jplayer.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TIIR Web Music</title>
</head>
<body class="yui3-skin-sam">
	<jsp:include page="fucking_pub.jsp" />
	<div id="lecteur audio">
		<div id="jquery_jplayer_1" class="jp-jplayer"></div>
		<div id="jp_container_1" class="jp-audio">
			<div class="jp-type-single">
				<div class="jp-gui jp-interface">
					<ul class="jp-controls">
						<li><a href="javascript:;" class="jp-play" tabindex="1">play</a></li>
						<li><a href="javascript:;" class="jp-pause" tabindex="1">pause</a></li>
						<li><a href="javascript:;" class="jp-stop" tabindex="1">stop</a></li>
						<li><a href="javascript:;" class="jp-mute" tabindex="1"
							title="mute">mute</a></li>
						<li><a href="javascript:;" class="jp-unmute" tabindex="1"
							title="unmute">unmute</a></li>
						<li><a href="javascript:;" class="jp-volume-max" tabindex="1"
							title="max volume">max volume</a></li>
					</ul>
					<div class="jp-progress">
						<div class="jp-seek-bar">
							<div class="jp-play-bar"></div>
						</div>
					</div>
					<div class="jp-volume-bar">
						<div class="jp-volume-bar-value"></div>
					</div>
					<div class="jp-time-holder">
						<div class="jp-current-time"></div>
						<div class="jp-duration"></div>
						<ul class="jp-toggles">
							<li><a href="javascript:;" class="jp-repeat" tabindex="1"
								title="repeat">repeat</a></li>
							<li><a href="javascript:;" class="jp-repeat-off"
								tabindex="1" title="repeat off">repeat off</a></li>
						</ul>
					</div>
				</div>
				<div class="jp-title">
					<ul>
						<li>TIIR Music Player</li>
					</ul>
				</div>
				<div class="jp-no-solution">
					<span>Update Required</span> To play the media you will need to
					either update your browser to a recent version or update your <a
						href="http://get.adobe.com/flashplayer/" target="_blank">Flash
						plugin</a>.
				</div>
			</div>
		</div>
	</div>
	<div id="liste lecture">
		<h1>Liste lecture</h1>
		<p>On acc&egrave;dera a la piste audio via REST (ou autre).</p>
		<div id="paginator_liste_lecture"></div>
		<div id="paginator"></div>
	</div>
</body>
<script>
my_jPlayer = $("#jquery_jplayer_1");
my_jPlayer.jPlayer({swfPath:"player/"})
var play = function(music_id){
	my_jPlayer.jPlayer("stop");
	my_jPlayer.jPlayer("setMedia", {
		mp3: "music/test.mp3"
	});
	my_jPlayer.jPlayer("play");
	first_track = false;
};
</script>
<script type="text/javascript">
var vote = null;
YUI().use("io-base", "datatable", "datasource-get", "datasource-jsonschema", "datatable-datasource", function(Y) {
	// Gestion de la liste des titres
	var myDataSource = new Y.DataSource.Get({source: "action/list_music.htm?format=json&"});
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
			myDataTable.datasource.load();
		}else{
			alert("Désolé, mais tu as déjà voté pour ce titre !")
		}
	}, Y, null);
    vote = function(music_id, note){
    	if(note != -1){
    		Y.io("action/note_music.htm?note="+note+"&mid="+music_id);
		}
    }; 
});
</script>
</html>
