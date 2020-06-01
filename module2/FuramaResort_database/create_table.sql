create database furama_resort;
create table LoaiDichVu(
IDLoaiDichVu int auto_increment primary key,
TenLoaiDichVu varchar(45)
);
create table KieuThue(
IDKieuThue int auto_increment primary key,
TenKieuThue varchar(45),
Gia int
);
create table LoaiKhach(
IDLoaiKhach int auto_increment primary key,
TenLoaiKhach varchar(45)
);
create table KhachHang(
IDKhachHang TenDichVuint auto_increment primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVu(
IDDichVu int auto_increment primary key,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue int,
IDLoaiDichVu int,
TrangThai varchar(45),
foreign key(IDKieuThue) references kieuthue(IDKieuThue),
foreign key(IDLoaiDichVu) references loaidichvu(IDLoaiDichVu)
);
create table ViTri(
IDViTri int auto_increment primary key,
TenViTri varchar(45)
);
create table TrinhDo(
IDTrinhDo int auto_increment primary key,
TrinhDo varchar(45)
);
create table BoPhan(
IDBoPhan int auto_increment primary key,
TenBoPhan varchar(45)
);
create table NhanVien(
IDNhanVien int auto_increment primary key,
HoTen varchar(45),
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key(IDViTri) references vitri(IDViTri),
foreign key(IDTrinhDo) references trinhdo(IDTrinhDo),
foreign key(IDBoPhan) references bophan(IDBoPhan)
);
create table HopDong(
IDHopDong int auto_increment primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
foreign key(IDNhanVien) references nhanvien(IDNhanVien),
foreign key(IDKhachHang) references khachhang(IDKhachHang),
foreign key(IDDichVu) references dichvu(IDDichVu)
);
create table DichVuDiKem(
IDDichVuDiKem int auto_increment primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi int,
TrangThaiKhaDung varchar(45)
);
create table HopDongChiTiet(
IDHopDongChiTiet int auto_increment primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
foreign key (IDHopDong) references hopdong(IDHopDong),
foreign key (IDDichVuDiKem) references dichvudikem(IDDichVuDiKem)
);
insert into loaikhach values (1,'Diamond');
insert into loaikhach values (2,'Plantinum');
insert into loaikhach values (3,'Gold');
insert into loaikhach values (4,'Silver');
insert into loaikhach values (5,'Member');
insert into LoaiDichVu
values (1,'Villa'),(2,'House'),(3,'Room');
insert into KieuThue
values (1,'Nam',8760),(2,'Thang',720),(3,'Ngay',24),(4,'Gio',1);
insert into ViTri
values (1,'Le Tan'),(2,'Phuc Vu'),(3,'Chuyen Vien'),(4,'Giam Sat'),(5,'Quan Ly'),(6,'Giam Doc');
insert into TrinhDo
values (1,'Trung Cap'),(2,'Cao Dang'),(3,'Dai Hoc'),(4,'Sau Dai Hoc');
insert into BoPhan
values (1,'Sale-Marketing'),(2,'Hanh Chinh'),(3,'Phuc Vu'),(4,'Quan Ly');
insert into DichVuDiKem
values (1,'massage',500000,1,'Dang mo'),
(2,'karaoke',300000,1,'Dang mo'),
(3,'thuc an',200000,1,'Dang mo'),
(4,'nuoc uong',50000,1,'Dang mo'),
(5,'thue xe',1000000,1,'Dang mo');
insert into DichVu 
values (1,'Villa thue theo gio',2000,4,'20 nguoi',500000,'4','1','Con phong'),
(2,'Villa thue theo ngay',2000,4,'20 nguoi',12000000,'3','1','Con phong'),
(3,'Villa thue theo thang',2000,4,'20 nguoi',360000000,'2','1','Con phong'),
(4,'Villa thue theo nam',2000,4,'20 nguoi',4320000000,'1','1','Con phong'),
(5,'House thue theo gio',1500,2,'10 nguoi',300000,'4','2','Con phong'),
(6,'House thue theo ngay',1500,2,'10 nguoi',7200000,'3','2','Con phong'),
(7,'House thue theo thang',1500,2,'10 nguoi',216000000,'2','2','Con phong'),
(8,'House thue theo nam',1500,2,'10 nguoi',2592000000,'1','2','Con phong'),
(9,'Room thue theo gio',1000,0,'4 nguoi',100000,'4','3','Con phong'),
(10,'Room thue theo ngay',1000,0,'4 nguoi',2400000,'3','3','Con phong'),
(11,'Room thue theo thang',1000,0,'4 nguoi',72000000,'2','3','Con phong'),
(12,'Room thue theo nam',1000,0,'4 nguoi',864000000,'1','3','Con phong');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (1, 1, 'Thạch Hồng Diệp', '1978-11-18', 338159730, 937878483, 'tsmitheman0@npr.org', 'Đà Nẵng');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (2, 4, 'Ân Xuân Hiền', '1990-01-31', 600273966, 975122970, 'ndaintith1@edublogs.org', 'Huế');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (3, 1, 'Phạm Bảo Duy', '1960-10-03', 780298833, 975236504, 'knortunen2@biblegateway.com', 'Quảng Trị');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (4, 5, 'Trần Thành Công', '1973-08-29', 104346978, 930372771, 'fmctrustie3@posterous.com', 'Quảng Nam');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (5, 5, 'Bùi Anh Hoàng', '1983-07-06', 671093539, 902265945, 'jmansel4@acquirethisname.com', 'Quảng Ngãi');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (6, 5, 'Phạm Ðức Chính', '1994-10-10', 171126514, 950267102, 'vyeardsley5@soundcloud.com', 'Hà Nội');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (7, 1, 'Bùi Thu Vân', '1964-10-05', 501667857, 956692543, 'zkiln6@msu.edu', 'Hồ Chí Minh');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (8, 4, 'Bùi Liên Phương', '1988-02-15', 199719544, 975091044, 'gdollimore7@trellian.com', 'Đà Nẵng');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (9, 5, 'Thi Ngọc Lam', '1968-08-03', 346418794, 919250239, 'ssongust8@hatena.ne.jp', 'Huế');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (10, 1, 'Lê Bình An', '1996-08-13', 754930913, 971791382, 'cklimkov9@slideshare.net', 'Quảng Trị');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (11, 5, 'Đặng Quốc Hoàng', '1968-11-28', 392200961, 919444463, 'odanihela@tumblr.com', 'Hà Nội');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (12, 3, 'Ân Hồng Thịnh', '1967-10-02', 339275336, 933431180, 'lwaitonb@tinypic.com', 'Hồ Chí Minh');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (13, 5, 'Trần Thái Hà', '1994-08-01', 152620560, 904077992, 'dplacstonec@virginia.edu', 'Đà Nẵng');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (14, 5, 'Phạm Tâm Hiền', '1972-12-28', 632023841, 911819982, 'fmcanultyd@scribd.com', 'Quảng Trị');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (15, 1, 'Hồ Ngọc Hoa', '1966-03-07', 981704042, 917484643, 'cmuldere@ustream.tv', 'Hà Nội');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (16, 5, 'Hà Thành Doanh', '1975-12-03', 605186714, 962432800, 'hdanilenkof@psu.edu', 'Huế');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (17, 5, 'Thái Quốc Trung', '1993-08-18', 734298790, 908229656, 'fdevonshireg@gmpg.org', 'Vinh');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (18, 3, 'Võ Huy Thành', '1978-05-02', 303088756, 929091254, 'ndonnh@google.it', 'Nghệ An');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (19, 2, 'Đỗ Duy An', '1993-11-30', 836518527, 977784429, 'ltappi@nbcnews.com', 'Quảng Nam');
insert into KhachHang (IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values (20, 5, 'Phùng Hoàng Yến', '1979-08-19', 371193040, 965125086, 'fsealeafj@storify.com', 'Quảng Trị');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (1, 'Ngô Long Giang', 3, 1, 2, '1970-11-29', 984177413, 12000000, 960952906, 'gwitty0@e-recht24.de', 'Đà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (2, 'Bùi Duy Thạch', 4, 3, 1, '1987-05-22', 783828561, 8000000, 902121550, 'btamlett1@statcounter.com', 'Huế');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (3, 'Phạm Ðức Khiêm', 3, 3, 1, '1995-03-02', 869124821, 6000000, 911534371, 'dtolley2@shop-pro.jp', 'Quảng Trị');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (4, 'Đặng Tiến Võ', 4, 2, 4, '1997-05-25', 746529524, 8000000, 988986164, 'wollerton3@mail.ru', 'Đà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (5, 'Võ Hải Vy', 3, 2, 1, '1998-04-14', 421056935, 6000000, 928882227, 'sfruen4@ft.com', 'Quảng Nam');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (6, 'Trần Minh Khai', 6, 4, 4, '1988-05-22', 803993235, 30000000, 907365350, 'asmythin5@weibo.com', 'Đà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (7, 'Nguyễn Nguyệt Nga', 4, 2, 2, '1992-11-16', 881185006, 13000000, 920461007, 'tbellany6@elegantthemes.com', 'Đà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (8, 'Lê Trí Hùng', 2, 2, 4, '1977-12-24', 725375945, 11000000, 975081622, 'hsmallsman7@soup.io', 'Huế');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (9, 'Nguyễn Tâm Thiện', 3, 4, 2, '1979-01-30', 314698026, 10000000, 985354008, 'nburlingame8@facebook.com', 'Quảng Trị');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (10, 'Vũ Việt Anh', 2, 2, 4, '1982-09-16', 866859600, 14000000, 942366581, 'fcoombe9@google.it', 'Đà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (11, 'Phan Phi Long', 4, 2, 1, '1982-04-24', 984637872, 10000000, 901965164, 'terratta@marriott.com', 'Quảng Nam');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (12, 'Trang Thanh Vân', 3, 1, 1, '1972-10-21', 259439497, 9000000, 963681899, 'vhebblethwaiteb@t-online.de', 'Vinh');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (13, 'Tiêu Kim Ly', 5, 2, 1, '1984-01-08', 860203872, 8000000, 943913688, 'eallikerc@techcrunch.com', 'Dà Nẵng');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (14, 'Nguyễn Khánh Chi', 5, 3, 1, '1971-08-14', 605294004, 13000000, 955322884, 'smoraisd@irs.gov', 'Huế');
insert into nhanvien (IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMND, Luong, SDT, Email, DiaChi) values (15, 'Huỳnh Quỳnh Anh', 4, 3, 1, '1991-02-15', 997778792, 14000000, 968884959, 'gcucheye@oracle.com', 'Quảng Trị');
insert into HopDong
values (1,1,1,1,'2019-04-30','2019-05-02',500000,7000000),
(2,2,2,5,'2019-11-30','2019-12-02',500000,5000000),
(3,6,3,9,'2019-08-30','2019-09-02',500000,4000000),
(4,7,4,3,'2017-01-30','2017-02-02',500000,6000000),
(5,10,5,6,'2019-04-28','2019-05-05',500000,8000000),
(6,9,6,10,'2019-10-30','2019-11-02',500000,5000000),
(7,1,7,3,'2019-04-30','2019-05-02',500000,6000000),
(8,8,1,1,'2019-02-28','2019-03-02',500000,10000000),
(9,6,6,11,'2018-04-30','2018-05-02',500000,5000000),
(10,9,6,12,'2018-01-14','2018-01-26',500000,7000000),
(11,10,12,11,'2019-01-14','2019-01-26',500000,4000000),
(12,12,3,4,'2018-01-14','2018-01-26',500000,8000000),
(13,11,3,4,'2017-01-14','2017-01-26',500000,9000000),
(14,15,5,3,'2016-01-14','2016-01-26',500000,8000000),
(15,8,13,3,'2015-01-14','2015-01-26',500000,0);
insert into HopDongChiTiet
values (1,1,2,2),(2,2,2,2),(3,3,3,2),(4,4,4,2),(5,5,5,2),(6,6,2,2),(7,7,2,2),(8,6,3,2),(9,3,4,2),(10,10,1,2),(11,13,2,2),(13,11,2,2),(14,15,2,2),
(15,9,4,2),(16,5,2,2),(17,4,1,2),(18,6,2,2),(19,7,3,2),(20,15,2,2),(21,12,1,3);