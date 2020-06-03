/*Task16. Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.*/
set sql_safe_updates = 0;
set FOREIGN_KEY_CHECKS=0;
delete from nhanvien
where nhanvien.IDNhanVien not in
(select hopdong.IDNhanVien from hopdong where ((year(hopdong.NgayLamHopDong) between 2017 and 2019) and hopdong.IDNhanVien = nhanvien.IDNhanVien));
/*Task17. Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 
là lớn hơn 10.000.000 VNĐ.*/
update khachhang
set khachhang.IDLoaiKhach = 1
where khachhang.IDLoaiKhach = 2 
and khachhang.IDKhachHang in (select hopdong.IDKhachHang from hopdong where year(hopdong.NgayLamHopDong) = 2019
group by hopdong.IDKhachHang having sum(hopdong.TongTien)>= 10000000);
/*Task18. Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).*/
set sql_safe_updates = 0;
set FOREIGN_KEY_CHECKS=0;
delete from khachhang
where khachhang.IDKhachHang in 
(select hopdong.IDKhachHang from hopdong where year(hopdong.NgayLamHopDong) < 2016);
/*Task19. Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 
lên gấp đôi.*/
update dichvudikem
set dichvudikem.Gia = dichvudikem.Gia * 2
where dichvudikem.IDDichVuDiKem in 
(select hopdongchitiet.IDDichVuDiKem from hopdongchitiet group by hopdongchitiet.IDDichVuDiKem having count(hopdongchitiet.IDDichVuDiKem)>=10);
/*20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
 thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai,
 NgaySinh, DiaChi.*/
 select nhanvien.IDNhanVien, nhanvien.HoTen, nhanvien.Email, nhanvien.SDT,nhanvien.NgaySinh,nhanvien.DiaChi
 from nhanvien
 union all
 select khachhang.IDKhachHang,  khachhang.HoTen, khachhang.Email, khachhang.SDT, khachhang.NgaySinh, khachhang.DiaChi
 from khachhang;

