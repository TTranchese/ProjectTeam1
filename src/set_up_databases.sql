\use mysql;
DROP DATABASE mmo;

CREATE DATABASE IF NOT EXISTS mmo;
\use mmo;

CREATE TABLE IF NOT EXISTS accounts(
id INT NOT NULL AUTO_INCREMENT,
nick_name VARCHAR(255),
password VARCHAR(255),
PRIMARY KEY(id)
);
INSERT INTO accounts (nick_name, password)
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


CREATE TABLE IF NOT EXISTS items (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  description TEXT,
  value INT,
  weight INT,
  rarity VARCHAR(50),
  requirements INT,
  durability INT,
  isStackable BOOLEAN,
  type ENUM('WEAPON', 'ARMOR', 'CONSUMABLE', 'JUNK') NOT NULL,
  subtype1 VARCHAR(50),
  subtype2 VARCHAR(50),
  createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);

INSERT INTO items (name, description, value, weight, rarity, requirements, durability, isStackable, type, subtype1, subtype2)
VALUES
    ('Rusty Dagger', 'A small, rusty dagger', 5, 2, 'common', 1, 30, true, 'WEAPON', '10', 'Dagger'),
    ('Bastard Sword', 'A versatile sword suitable for both one-handed and two-handed use', 80, 15, 'rare', 10, 200, false, 'WEAPON', '60', 'Sword'),
    ('Aurora Blade', 'A beautiful sword that glows with an ethereal light', 200, 10, 'epic', 30, 500, false, 'WEAPON', '100', 'Sword'),
    ('Leather Hood', 'A simple hood made of leather', 15, 5, 'common', 1, 30, false, 'ARMOR', '10', 'Head'),
    ('Chainmail Shirt', 'A chainmail shirt that provides solid protection', 70, 20, 'uncommon', 5, 100, false, 'ARMOR', '30', 'Chest'),
    ('Plate Boots', 'Heavy boots made of sturdy plate armor', 150, 30, 'rare', 10, 500, false, 'ARMOR', '60', 'Legs'),
    ('Health Potion', 'Restores health', 10, 0, 'common', 1, 1, true, 'CONSUMABLE', '15', '50'),
    ('Mana Potion', 'Restores mana', 10, 0, 'common', 1, 1, true, 'CONSUMABLE', '10', '50'),
    ('Broken Arrow', 'A damaged arrow that can no longer be used for hunting or combat', 1, 0.5, 'common', 1, 1, true, 'JUNK', NULL, NULL),
    ('Rat Tail', 'A slimy rat tail that nobody would want to touch', 1, 0.2, 'common', 1, 1, true, 'JUNK', NULL, NULL),
    ('Wooden Shield', 'A basic wooden shield', 10, 5, 'common', 1, 50, false, 'ARMOR', '30', 'Shield'),
    ('Steel Shield', 'A sturdy steel shield', 60, 15, 'uncommon', 5, 100, false, 'ARMOR', '60', 'Shield'),
    ('Ancient Shield', 'An ancient shield said to have been wielded by a legendary hero', 500, 25, 'legendary', 100, 1000, false, 'ARMOR', '120', 'Shield'),
    ('Flame Staff', 'A staff that channels the power of fire', 150, 10, 'epic', 50, 500, false, 'WEAPON', '80', 'Staff'),
    ('Ice Wand', 'A wand that shoots freezing beams of ice', 200, 5, 'epic', 100, 1000, false, 'WEAPON', '80', 'Staff'),
    ('Better Health Potion', 'Restores 50 HP', 100, 10, 'common', 0, 100, False, 'CONSUMABLE', '25','100'),
    ('Better Mana Potion', 'Restores 50 MP', 100, 10, 'common', 0, 100, False, 'CONSUMABLE','25', '100'),
    ('Antidote', 'Cures to full health', 1000, 5, 'common', 0, 100, False, 'CONSUMABLE', '600', '1000'),
    ('Elixir', 'Restores all HP and MP', 500, 1, 'rare', 0, 50, False, 'CONSUMABLE', '1000', '1000'),
    ('Sword', 'A basic sword', 100, 20, 'common', 0, 100, False, 'WEAPON', '20', 'Sword'),
    ('Tiny Ice Wand', 'A wand that shoots freezing beams of ice', 200, 5, 'epic', 100, 1000, False, 'WEAPON', '100', 'Staff'),
    ('Super Fire Staff', 'A staff that shoots balls of fire', 300, 3, 'legendary', 500, 5000, False, 'WEAPON', '150', 'Staff'),
    ('Leather Armor', 'Basic armor made of leather', 150, 10, 'common', 0, 100, False, 'ARMOR', '30', 'Chest'),
    ('Chainmail Armor', 'Armor made of interlocking metal rings', 300, 5, 'rare', 100, 1000, False, 'ARMOR', '45', 'Chest'),
    ('Plate Helm', 'Heavy armor made of metal plates', 500, 2, 'legendary', 500, 5000, False, 'ARMOR', '100', 'Helm');

CREATE TABLE IF NOT EXISTS characters(
id INT NOT NULL AUTO_INCREMENT,
account_id INT,
name VARCHAR(255),
c_level INT,
job ENUM('Tank', 'Warrior', 'Mage') NOT NULL,
gender ENUM('M', 'F', 'N') NOT NULL,

PRIMARY KEY(id),
FOREIGN KEY(account_id) REFERENCES accounts(id)
);

INSERT INTO characters (account_id, name,  c_level, job, gender)
VALUES (1, 'Gringo1', 1, 'Warrior', 'M'),
       (2, 'Gringo2', 1, 'Mage', 'F'),
       (3, 'Gringo3', 1, 'Tank', 'N'),
       (4, 'Gringo4', 1, 'Warrior', 'F'),
       (5, 'Gringo5', 1, 'Mage', 'N'),
       (6, 'Gringo6', 1, 'Tank', 'M');