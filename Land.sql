


select * from land

alter table land
drop column landowner

alter table land
add landcnt number(2) default 0

select landname, landnumber
from land
where landnumber = 23

delete from land
where landname = '���ʽ�4'

insert into LAND(landname,landnumber)
values('���ʽ�1', 4)

insert into LAND(landname,landnumber)
values('���ʽ�4', 27)


