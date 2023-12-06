INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (1, 'yuxin tong','Dragonborn','March 19, 1092','Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life.',19.95,3.2,'assets/images/dragonborn.png');

INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (2, 'Shaun','Dwarf','March 18, 1095','Bold and hardy, dwarves are known as skilled warriors, miners, and workers of stone and metal. Though they stand well under 5 feet tall, dwarves are so broad and compact that they can weigh as much as a human standing nearly two feet taller. Their courage and endurance are also easily a match for any of the larger folk.',32.99,4.2,'assets/images/bolddwaf.png');


INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (3, 'Emil','Elf','May 21, 1096','With their unearthly grace and fine features, elves appear hauntingly beautiful to humans and members of many other races. They are slightly shorter than humans on average, ranging from well under 5 feet tall to just over 6 feet. They are more slender than humans, weighing only 100 to 145 pounds. Males and females are about the same height, and males are only marginally heavier than females.',0.9,4.8,'assets/images/Elf.png');


INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (4, 'Bo','Human','March 19, 1096','With their penchant for migration and conquest, humans are more physically diverse than other common races. There is no typical human. An individual can stand from 5 feet to a little over 6 feet tall and weigh from 125 to 250 pounds.',11.55,3.7,'assets/images/human.png');


INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (5, 'David','Orc','October 15, 1096','Whether united under the leadership of a mighty warlock or having fought to a standstill after years of conflict, orc and human communities, sometimes form alliances. When these alliances are sealed by marriages, half-orcs are born.',35.95,4.6,'assets/images/orc.png');

INSERT INTO hero (hero_Id, hero_Name,hero_Race,hero_Dob,description,hire_Price,star_Rating,image_Url) 
VALUES (6, 'Oshan','Tiefling','October 15, 1103','Tieflings are derived from human bloodlines, and in the broadest possible sense, they still look human. However, their infernal heritage has left a clear imprint on their appearance. Tieflings have large horns that take any of a variety of shapes: some have curling horns like a ram, others have straight and tall horns like a gazelle’s, and some spiral upward like an antelopes’ horns.',27.25,3.1,'assets/images/tiefling.png');


INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(1,'unis2024','undergrade 2024','A');

INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(2,'unis2023','undergrade 2023','A');

INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(3,'unis2022','undergrade 2022','H');

INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(4,'tafe2024','TAFE 2024','A');

INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(5,'tafe2023','TAFE 2023','A');

INSERT INTO cycle (cycle_id,cycle_code,cycle_name,cycle_status) 
values(6,'tafe2022','TAFE 2022','H');


INSERT INTO applicant (applicant_id,surname,givens,reference,dob,course_code,cycle) 
values(1,'Tong','Yuxin','123456789','1978-04-19', '10001','tafe2024'); 

INSERT INTO applicant (applicant_id,surname,givens,reference,dob,course_code,cycle) 
values(2,'Feng','Bo','987654321','1978-04-19', '10002','unis2024'); 

INSERT INTO applicant (applicant_id,surname,givens,reference,dob,course_code,cycle) 
values(3,'Starkey','David','111111111','1978-04-19', '10003','tafe2023'); 

INSERT INTO note (applicant_id, note,when_created) VALUES (1, 'note 1 for yuxin', CURRENT_TIMESTAMP);










