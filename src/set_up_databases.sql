\use mysql;
DROP DATABASE mmo;

CREATE DATABASE IF NOT EXISTS mmo;
\use mmo;

CREATE TABLE IF NOT EXISTS accounts(
id INT NOT NULL AUTO_INCREMENT,
nickName VARCHAR(255),
password VARCHAR(255),
PRIMARY KEY(id)
);
INSERT INTO accounts (nickName, password)
VALUES
    ('DragonSlayer77', 'password1'),
    ('TheWizard42', 'password2'),
    ('ShadowNinja', 'password3'),
    ('BlazeFire', 'password4'),
    ('IceQueen123', 'password5'),
    ('Thunderbolt56', 'password6'),
    ('ChaosKnight', 'password7'),
    ('MysticPhoenix', 'password8'),
    ('CrystalMage', 'password9'),
    ('SteelWarrior', 'password10'),
    ('SwiftArrow', 'password11'),
    ('MoonlightAssassin', 'password12'),
    ('FlameWarlock', 'password13'),
    ('Frostbite', 'password14'),
    ('TheVengefulOne', 'password15'),
    ('SoulEater666', 'password16'),
    ('DragonHeart', 'password17'),
    ('TheSilentBlade', 'password18'),
    ('TheLastSamurai', 'password19'),
    ('PhoenixRider', 'password20');
