


select * from land

alter table land
drop column landowner

alter table land
add landcnt number(2) default 0

select landname, landnumber
from land
where landnumber = 23

delete from land
where landname = '보너스4'

insert into LAND(landname,landnumber)
values('보너스', 4)

insert into LAND(landname,landnumber)
values('보너스', 27)


