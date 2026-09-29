BÀI TẬP NHÓM
Học phần: Phân tích và Thiết kế Hướng đối tượng (OOAD)
Tên đề tài: Hệ Thống Quản Lý Xe Ô Tô Điện (Java)  
Lớp: OOAD IT25M | Nhóm: 13
Thành viên nhóm:   
1.Đỗ Văn Hậu   
2.Triệu Quang Mười   
NỘI DUNG:
1. Phát biểu bài toán
2. 1.1. Mục tiêu đề tài
Xây dựng ứng dụng quản lý xe ô tô điện áp dụng kiến thức OOP (Kế thừa, Đóng gói, Đa hình, Trừu tượng), cấu trúc dữ liệu Collections (ArrayList, HashMap), xử lý ngoại lệ và lưu trữ tệp tin (File I/O).
1.2. Các tác nhân tham gia (3 Actors)Quản lý (Manager): Quản lý xe (CRUD), thiết lập trạm sạc & giá điện, xem báo cáo doanh thu, sao lưu dữ liệu.
Nhân viên bán hàng (Sales Staff): Quản lý hồ sơ khách hàng, tra cứu xe rảnh, lập hợp đồng thuê xe (pin $\ge 50\%$), nhận trả xe và thanh toán.
Nhân viên kỹ thuật (Technical Staff): Nhận cảnh báo pin yếu ($< 20\%$), thực hiện cắm sạc (AC/DC), tính số kWh nạp và cập nhật trạng thái bảo trì xe.
1.3. Các thực thể chínhXe điện (ElectricCar): Mã xe, biển số, hãng, model, dung lượng pin (kWh), % pin, trạng thái (Rảnh, Đang sạc, Đang thuê, Bảo trì).
Trạm sạc (ChargingStation): Mã trạm, loại cổng (AC/DC), công suất (kW), đơn giá điện/kWh.Khách hàng (Customer): Mã khách, họ tên, CCCD, SĐT, hạng bằng lái.
Hợp đồng thuê (RentalContract): Mã hợp đồng, thông tin xe, khách hàng, % pin giao/trả, tổng tiền.
Phiên sạc (ChargingSession): Mã phiên, xe nạp, trạm sạc, kWh tiêu thụ, thành tiền.
1.4. Yêu cầu hệ thống tóm tắt
Chức năng (FR): CRUD xe điện; Tra cứu & Lọc xe; Cảnh báo pin $< 20\%$; Mô phỏng sạc & tính tiền điện; Quản lý khách hàng & Hợp đồng thuê xe; Báo cáo doanh thu & Trạng thái xe; Đọc/ghi File I/O.
Phi chức năng (NFR): Ràng buộc dữ liệu (pin $0 - 100\%$, SĐT 10 số); Thiết kế chuẩn kiến trúc 3 lớp (Model - Service - Repository); Bắt lỗi ngoại lệ tránh crash.
2. Biểu đồ Use Case (Use Case Diagram)
4. Đặc tả Use Case tiêu biểu: Lập hợp đồng thuê xeActor: Nhân viên bán hàng.
5. Điều kiện tiên quyết: Khách có bằng lái hợp lệ; Xe đang Rảnh và mức pin $\ge 50\%$.
6. Các bước thực hiện:Chọn xe và khách hàng thuê.
7. Hệ thống kiểm tra điều kiện pin $\ge 50\%$ và bằng lái hợp lệ.
8. Nhập thời gian thuê, ghi nhận % pin lúc bàn giao.
9. Hệ thống tạo hợp đồng, tự động chuyển xe sang trạng thái Đang cho thuê.
