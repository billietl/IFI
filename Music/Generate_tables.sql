create table Musique(
	musique_id bigint,
	titre varchar(50),
	artiste varchar(50),
	data bytea
);

create table Utilisateur(
	utilisateur_id bigint,
	pseudo varchar(50),
	email varchar(50),
	password varchar(50)
);

create table Note(
	note_id bigint,
	valeur int check (valeur<6 and valeur>-1),
	musique_concernee bigint
);

alter table Musique 		add primary key (musique_id);
alter table Utilisateur 	add primary key (utilisateur_id);
alter table Note 			add primary key (note_id);

alter table Note			add foreign key (musique_concernee) 	references Musique (musique_id);