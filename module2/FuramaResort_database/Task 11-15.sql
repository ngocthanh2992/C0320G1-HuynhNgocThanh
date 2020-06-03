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
select hopdong.IDHopDong, nhanvien.HoTen, khachhang.HoTen, khachhang.SDT, dichvu.TenDichVu, count(hopdongchitiet.IDDichVuDiKem) as 'Số lượng dịch vụ đi kèm', hopdong.TienDatCoc
from hopdong join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
where exists(select hopdong.IDHopDong from hopdong where ( (hopdong.NgayLamHopDong between '2019-10-01' and '2019-12-31') and (hopdong.IDDichVu = dichvu.IDDichVu)))
and not exists (select hopdong.IDHopDong from hopdong where ( (hopdong.NgayLamHopDong between '2019-01-01' and '2019-06-30') and (hopdong.IDDichVu = dichvu.IDDichVu)));
/*Task13. Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng
 đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).*/
 select dichvudikem.IDDichVuDiKem, dichvudikem.TenDichVuDiKem, sum(hopdongchitiet.SoLuong) as 'Tổng số lượng sử dụng', count(hopdongchitiet.IDDichvudikem) as 'Số lần đặt' from dichvudikem
 join hopdongchitiet on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
 group by dichvudikem.IDDichVuDiKem
 having sum(hopdongchitiet.SoLuong) > 6
 order by sum(hopdongchitiet.SoLuong) desc;
 /*Task14. Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
 Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.*/
select hopdong.IDHopDong, dichvu.TenDichVu, dichvudikem.TenDichVuDiKem, count(hopdongchitiet.IDDichVuDiKem) as 'Số lần sử dụng'
from hopdong join dichvu on hopdong.IDDichVu = dichvu.IDDichVu
join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
 group by dichvudikem.IDDichVuDiKem
 having count(hopdongchitiet.IDDichVuDiKem) = 1;
 /*Task15. Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, 
 TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.*/
 select nhanvien.IDNhanVien, nhanvien.HoTen, trinhdo.TrinhDo, bophan.TenBoPhan, nhanvien.SDT, nhanvien.DiaChi, count(hopdong.IDHopDong) as 'Số hợp đồng lập được'
 from nhanvien join hopdong on nhanvien.IDNhanVien = hopdong.IDNhanVien
 join trinhdo on nhanvien.IDTrinhDo = trinhdo.IDTrinhDo
 join bophan on nhanvien.IDBoPhan = bophan.IDBoPhan
 where year(hopdong.NgayLamHopDong) = 2018 or year(hopdong.NgayLamHopDong) = 2019
 group by IDNhanVien
having count(hopdong.IDHopDong) < 2;
