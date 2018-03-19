CREATE TABLE IF NOT EXISTS characters (
	ID int NOT NULL AUTO_INCREMENT,
	character_class varchar(255) NOT NULL,
	character_name varchar(255) NOT NULL,
	health int NOT NULL,
	mana int NOT NULL,
	stamina int NOT NULL,
	dexterity int NOT NULL,
	intelligence int NOT NULL,
	attackSpeed double(12,5) NOT NULL,
	castSpeed double(12,5) NOT NULL,
	level int NOT NULL,
	exp int NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE IF NOT EXISTS weapons (
	ID int NOT NULL AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	legendary boolean NOT NULL,
	weapon_type varchar(255) NOT NULL,
	physical_min int NOT NULL,
	physical_max int NOT NULL,
	magical_min int NOT NULL,
	magical_max int NOT NULL,
	PRIMARY KEY(ID)
);
