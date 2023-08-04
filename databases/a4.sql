use a4;

select * from Users U join Listens L on L.userName=U.name join Song S on L.songName=S.name where U.name='Jamiya4' and S.name<='Dirty K4';
select * from Song S where dateReleased <= '1995-02-17' group by S.name ;
select A.name from Artist A, Song S, Performs P where A.name=P.artistName and S.name=P.songName group by A.name having count(*)=4;


insert into Users values('Oscar201', 21, 'Fayetteville', 'NC', '2021-02-17');
select * from Users U where U.name='Oscar201';
update Users set age=age+1 where name='Oscar201';
select * from Users U where U.name='Oscar201';
select * from Artist A where A.age=22;
update Artist set age=age+1 where age=22;
select * from Artist A where A.age=23;