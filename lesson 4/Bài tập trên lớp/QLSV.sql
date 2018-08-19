--Hien thi danh sach diem cua sinh vien theo môn hoc (ma sinh vien, ho va ten, mon thi, diem thi)
select masv masinhvien, hoten hoten, tenmh tenmonhoc, diem diemthi
from sinhvien sv, monhoc mh, diem d
where sv.id = d.idsv and mh.id = d.idmh

--Hien thi danh sach sv thi lai theo môn hoc (ma sinh vien, ho va ten, mon thi, diem thi)
select masv, hoten, tenmh, diem
from sinhvien sv, diem d, monhoc mh
where d.diem < 5 and sv.id = d.idsv and mh.id = d.idmh

--Hien thi danh sach sinh vien theo diem giam dan (ma sinh vien, ho va ten, mon thi, diem thi)
select masv, hoten, tenmh, diem
from sinhvien sv, diem d, monhoc mh
where sv.id = d.idsv and mh.id = d.idmh
order by d.diem DESC

--Hien thi 10 sv có diem cao nhat(ma sinh vien, ho va ten, mon thi, diem thi)
select sv.masv, sv.hoten, mh.tenmh, d.diem
from sinhvien sv, diem d, monhoc mh
where sv.id = d.idsv and mh.id = d.idmh and ROWNUM <= 10
order by d.diem DESC

--Hien thi danh sach mon hoc và tong so sinh vien thi mon(ma mon, ten mon, tong so sinh vien)
select mh.id, mh.tenmh, count(sv.id)
from sinhvien sv, monhoc mh, diem d
where sv.id = d.idsv and mh.id = d.idmh
group by mh.id, mh.tenmh

--Hien thi danh sach mon hoc và tong so sinh vien thi lai(ma mon, ten mon, tong so sinh vien thi lai)
select mh.id, mh.tenmh, count(sv.id)
from sinhvien sv, monhoc mh, diem d
where sv.id = d.idsv and mh.id = d.idmh and d.diem < 5
group by mh.id, mh.tenmh

--Danh sach sinh vien có diem trung binh trên 7.0 (diem trung binh cac mon thi) (ma sinh vien, diem trung binh)
select sv.masv, avg(d.diem)
from sinhvien sv, diem d, monhoc mh
where sv.id = d.idsv and mh.id = d.idmh
group by sv.masv
having avg(d.diem) > 7