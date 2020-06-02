/*Task6. Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
 của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019
 (Quý 1 là tháng 1, 2, 3).*/
 select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu
 from dichvu join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
 where not exists (select hopdong.IDHopDong from hopdong where(hopdong.IDDichVu = dichvu.IDDichVu and hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-31"))
 group by IDDichVu;
 /*Task7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
 của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018
 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/
 select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.SoNguoiToiDa, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu
 from dichvu join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
 where exists(select hopdong.IDHopDong from hopdong where (hopdong.IDDichVu = dichvu.IDDichVu and hopdong.NgayLamHopDong between "2018-01-01" and "2018-12-31"))
 and not exists (select hopdong.IDHopDong from hopdong where (hopdong.IDDichVu = dichvu.IDDichVu and hopdong.NgayLamHopDong between "2019-01-01" and "2019-12-31"));
 /*Task 8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang
 không trùng nhau.*/
 select distinct khachhang.HoTen from khachhang;
 select khachhang.HoTen from khachhang group by khachhang.HoTen;
 select khachhang.HoTen from khachhang union select khachhang.HoTen from khachhang;
 /*Task9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019
 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
 select month(hopdong.NgayLamHopDong) as Tháng, count(*) as 'Tổng khách hàng đặt phòng', sum(hopdong.TongTien) as "Doanh Thu" from khachhang
join hopdong on khachhang.IDKhachHang = hopdong.IDKhachHang
where year(hopdong.NgayLamHopDong)=2019
group by month(hopdong.NgayLamHopDong)
order by month(hopdong.NgayLamHopDong);
/*10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
 Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
 (được tính dựa trên việc count các IDHopDongChiTiet).*/
 select hopdong.IDHopDong, hopdong.NgayLamHopDong, hopdong.NgayKetThuc, hopdong.TienDatCoc, count(hopdongchitiet.IDHopDongChiTiet) as 'Số lượng dịch vụ đi kèm đã sử dụng', sum(hopdongchitiet.SoLuong) as 'Tổng dịch vụ đi kèm đã sử dụng'
 from hopdong join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
group by hopdong.IDHopDong
order by hopdong.IDHopDong;


 