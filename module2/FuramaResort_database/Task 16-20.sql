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
and (select hopdong.IDKhachHang ,sum(hopdong.TongTien) from hopdong where year(hopdong.NgayLamHopDong) = 2019
group by sum(hopdong.TongTien));