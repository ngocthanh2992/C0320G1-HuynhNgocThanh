/*Task 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một
 trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.*/
select * from nhanvien
where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen) < 15;
/*Task 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ
 ở “Đà Nẵng” hoặc “Quảng Trị”.*/
select * from khachhang
where (year(curdate()) - year(NgaySinh) >=18 and year(curdate()) - year(NgaySinh) <= 50) and (DiaChi in ('Đà Nẵng','Quảng Trị'));
/*Task4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/
select khachhang.IDKhachHang,loaikhach.TenLoaiKhach,khachhang.HoTen,khachhang.Ngaysinh, khachhang.DiaChi ,count(hopdong.IDHopDong) as 'Số lần đặt phòng' from khachhang
join hopdong on hopdong.IDKhachHang =khachhang.IDKhachHang
join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
where loaikhach.TenLoaiKhach = 'Diamond'
group by IDKhachHang
order by count(hopdong.IDHopDong) asc;
/*Task5. Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, 
NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, 
với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
 (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).*/
 select khachhang.IDKhachHang, khachhang.HoTen,loaikhach.TenLoaiKhach,hopdong.IDHopDong,dichvu.TenDichVu,hopdong.NgayLamHopDong, hopdong.NgayKetThuc,sum(dichvu.ChiPhiThue+hopdongchitiet.SoLuong*dichvudikem.Gia) as TongTien
 from khachhang left join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
 left join hopdong on khachhang.IDKhachHang = hopdong.IDKhachHang
 left join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
 left join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
 left join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
 group by IDKhachHang;