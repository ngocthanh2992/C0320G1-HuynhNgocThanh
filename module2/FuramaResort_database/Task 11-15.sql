/*Task11. Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.*/
select dichvudikem.TenDichVuDiKem, dichvudikem.Gia , khachhang.HoTen, khachhang.DiaChi
from dichvudikem join hopdongchitiet on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
join hopdong on hopdongchitiet.IDHopDong = hopdong.IDHopDong
join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
where (khachhang.DiaChi in ('Vinh','Quảng Ngãi')) and (loaikhach.TenLoaiKhach = 'Diamond');
/*Task12. Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, 
TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.*/
select hopdong.IDHopDong, nhanvien.HoTen, khachhang.HoTen, khachhang.SDT, dichvu.TenDichVu, count(hopdongchitiet.IDHopDong) as 'Số lượng dịch vụ đi kèm', hopdong.TienDatCoc
from hopdong join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
where exists(select hopdong.IDHopDong from hopdong where ( (hopdong.NgayLamHopDong between '2019-10-01' and '2019-12-31') and (hopdong.IDDichVu = dichvu.IDDichVu)))
and not exists (select hopdong.IDHopDong from hopdong where ( (hopdong.NgayLamHopDong between '2019-01-01' and '2019-06-30') and (hopdong.IDDichVu = dichvu.IDDichVu)));