insert into usr values(1, '22.11.1998', '1mail@gmail.com', 'lastName1', 'middleName1', 'name1', 'password', '89516752841', 'username1');
insert into usr values(2, '23.11.1998', '2mail@gmail.com', 'lastName2', 'middleName2', 'name2', 'password', '89516752845', 'username2');
insert into usr values(3, '26.11.1998', '3mail@gmail.com', 'lastName3', 'middleName3', 'name3,', 'password', '89516752843', 'username3');
insert into usr values(4, '29.11.1998', '4mail@gmail.com', 'lastName4', 'middleName4', 'name4', 'password', '89516752848', 'username4');
insert into usr values(5, '28.11.1998', '5mail@gmail.com', 'lastName5', 'middleName5', 'name5', 'password', '89516752849', 'username5');
insert into usr values(6, '25.11.1998', '6mail@gmail.com', 'lastName6', 'middleName6', 'name6', 'password', '89516752855', 'username6');

insert into student values('IST-711', 'nameParent11', 'nameParent12', '88005553538', '88005553540', 5);
insert into student values('IST-711', 'nameParent21', 'nameParent22', '88005553541', '88005553542', 4);
insert into student values('IST-712', 'nameParent31', 'nameParent32', '88005553543', '88005553544', 3);
insert into student values('IST-712', 'nameParent31', 'nameParent32', '88005553545', '88005553546', 2);

insert into teacher values('physics and mathematics', 1);
insert into teacher values('english and all you need', 6);

insert into lesson values(1, '', '20-09-01 09:00:00', 'mathematics', 'IST-712', '', 1);
insert into lesson values(2, '', '20-09-01 10:45:00', 'physics', 'IST-711', '', 1);
insert into lesson values(3, '', '20-09-01 13:00:00', 'mathematics', 'IST-711', '', 1);
insert into lesson values(4, '', '20-09-01 14:45:00', 'physics', 'IST-712', '', 1);
insert into lesson values(5, '', '20-09-01 09:00:00', 'english', 'IST-711', '', 6);
insert into lesson values(6, '', '20-09-01 10:45:00', 'english', 'IST-712', '', 6);
insert into lesson values(7, '', '20-09-01 13:00:00', 'physical culture', 'IST-712', '', 6);
insert into lesson values(8, '', '20-09-01 14:45:00', 'physical culture', 'IST-711', '', 6);

insert into groupp values('IST-711', 1);
insert into groupp values('IST-712', 6);

insert into lesson_Result values(2, 1, 1, 4);
insert into lesson_Result values(3, 1, 1, 3);
insert into lesson_Result values(4, 1, 1, 5);
insert into lesson_Result values(5, 1, 1, 4);
insert into lesson_Result values(2, 2, 1, 2);
insert into lesson_Result values(3, 2, 1, 2);
insert into lesson_Result values(4, 2, 1, 4);
insert into lesson_Result values(5, 2, 1, 3);
insert into lesson_Result values(2, 3, 1, 3);
insert into lesson_Result values(3, 3, 1, 4);
insert into lesson_Result values(4, 3, 1, 4);
insert into lesson_Result values(5, 3, 1, 4);
insert into lesson_Result values(2, 4, 1, 2);
insert into lesson_Result values(3, 4, 1, 3);
insert into lesson_Result values(4, 4, 1, 5);
insert into lesson_Result values(5, 4, 1, 2);
insert into lesson_Result values(2, 5, 1, 4);
insert into lesson_Result values(3, 5, 1, 4);
insert into lesson_Result values(4, 5, 1, 3);
insert into lesson_Result values(5, 5, 1, 4);
insert into lesson_Result values(2, 6, 1, 5);
insert into lesson_Result values(3, 6, 1, 5);
insert into lesson_Result values(4, 6, 1, 4);
insert into lesson_Result values(5, 6, 1, 2);
insert into lesson_Result values(2, 7, 1, 5);
insert into lesson_Result values(3, 7, 1, 4);
insert into lesson_Result values(4, 7, 1, 2);
insert into lesson_Result values(5, 7, 1, 4);
insert into lesson_Result values(2, 8, 1, 3);
insert into lesson_Result values(3, 8, 1, 5);
insert into lesson_Result values(4, 8, 1, 5);
insert into lesson_Result values(5, 8, 1, 3);

