create table association(
libelle_association varchar(20) not null ,
nom_association varchar(20),
adresse_local varchar2(40),
cin varchar2(10),
constraint pk_libelle_association primary key (libelle_association),
constraint fk_cin_association foreign key(cin) references personne(cin)
);
commit;
