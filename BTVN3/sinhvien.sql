--hien thi danh sach diem sinh vien theo mon hoc
select masv as "Ma SV", hoten as "Ho ten", tenmh as "Ten MH", diem as "Diem"
from sinhvien, diem, monhoc
where sinhvien.id = diem.idsv
and monhoc.id = diem.idmh;
--hien thi danh sach sinh vien thi lai
select masv as "Ma SV", hoten as "Ho ten", tenmh as "Ten MH", diem as "Diem"
from sinhvien, diem, monhoc
where sinhvien.id = diem.idsv
and monhoc.id = diem.idmh
and diem.diem < 5;
--hien thi danh sach sinh vien theo diem giam dan
select masv as "Ma SV", hoten as "Ho ten", tenmh as "Ten MH", diem as "Diem"
from sinhvien, diem, monhoc
where sinhvien.id = diem.idsv
and monhoc.id = diem.idmh
order by diem.diem desc;
--hien thi 10 sinh vien co diem cao nhat
select masv as "Ma SV", hoten as "Ho ten", tenmh as "Ten MH", diem as "Diem"
from sinhvien, diem, monhoc
where sinhvien.id = diem.idsv
and monhoc.id = diem.idmh
and rownum <= 10;
--hien thi danh sach mon hoc va so sinh vien thi mon hoc
select monhoc.id, tenmh, count(sinhvien.id)
from sinhvien, diem, monhoc
where sinhvien.id = diem.idsv
and monhoc.id = diem.idmh
group by monhoc.id, monhoc.tenmh
order by monhoc.id;
-- danh sach mon hoc va tong so sinh vien thi lai
select m.id, m.tenmh, count(d.idsv) as SoLuong
from monhoc m
inner join diem d on m.id = d.idmh
where d.diem < 5
group by m.id, m.tenmh
order by m.id;
-- danh sach mon hoc va tong so sinh vien thi lai (cach 2)
select m.id, m.tenmh, count(d.idsv)
from monhoc m, diem d
where m.id = d.idmh and d.diem < 5
group by m.id, m.tenmh
order by m.id;
-- danh sach sinh vien co diem trung binh tren 7
select d.idsv, avg(d.diem)
from diem d
group by d.idsv
having avg(d.diem) > 7
order by d.idsv;