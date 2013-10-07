create table Musique(
	musique_id bigint,
	titre varchar(50),
	artiste varchar(50),
	proprietaire bigint,
	data bytea
);

create table Utilisateur(
	utilisateur_id bigint,
	pseudo varchar(50),
	email varchar(50),
	password varchar(50)
);

create table Partage(
	partage_id bigint,
	musique_id bigint,
	utilisateur_id bigint
);

alter table Musique add primary key (musique_id);
alter table Utilisateur add primary key (utilisateur_id);
alter table Partage add primary key (partage_id);

alter table Musique add foreign key (proprietaire) references Utilisateur (utilisateur_id);
alter table Partage add foreign key (musique_id) references Musique (musique_id);
alter table Partage add foreign key (musique_id) references Utilisateur (utilisateur_id);