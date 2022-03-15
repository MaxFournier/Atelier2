CREATE TABLE user
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255),
    password VARCHAR(255),
    argent float
);

INSERT INTO user VALUES
(1, "admin", "admin", "admin", 999),
(2, "BOB", "BOB", "BOB", 80),
(3, "cathy", "cathy", "cathy", 120),
(4, "john", "doe", "password", 10);


CREATE TABLE card 
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    hp float,
    attack float,
    defense float
);

CREATE TABLE card_user
(
    user_id integer PRIMARY Key,
    card_id integer Primary Key,
    prix float,
    to_sell boolean,
    FOREIGN KEY user_id REFERENCES user(id),
    FOREIGN KEY card_id REFERENCES card(id)
);

INSERT INTO card VALUES
(1, "une carte", "une jolie carte",100,20,20),
(2, "une 2eme carte", "une 2eme jolie carte",100,20,20),
(3, "une autre carte", "une autre jolie carte",100,20,20),
(4, "la magie", "pew pew pew ",100,20,22),
(5, "bulbazor", "carte holographique super rare",100,20,20),
(6, "une carte naze", "jette la serieux ...",100,20,20),
(7, "la nature", "les arbreq, les fleurs, les allergies au pollen tout ca ...",100,20,20),
(8, "L'espace", "toooin tooooin toin toin toin toin toin toin toinnnnnnnnn !",100,20,20);