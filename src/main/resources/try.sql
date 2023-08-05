select * from animal;

select idanimal, concat_ws(': ', anim_name, anim_desc) as nameAndDesc from animal;
update animal set anim_name = 'super Name' where idanimal = 2;

insert into animal (idanimal, anim_name, anim_desc) VALUE (4, 'slone', 'big nose');

delete from animal where idanimal = 3;