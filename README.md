BÀI TẬP NHÓM
Học phần: Phân tích và Thiết kế Hướng đối tượng (OOAD)
Lớp: OOAD IT25M
Nhóm: 13
Tên đề tài: Hệ Thống Quản Lý Xe Ô Tô Điện (Java)   
Thành viên nhóm:   Đỗ Văn Hậu   Triệu Quang Mười   
NỘI DUNG
1. Phát biểu bài toán
1.1. Đặt vấn đề và Mục tiêu đề tàiXu hướng chuyển dịch sang các phương tiện di chuyển thuần điện (EV) đang phát triển mạnh mẽ. Kéo theo đó, nhu cầu quản lý đội xe, theo dõi tình trạng pin, trạm sạc và các dịch vụ vận hành (cho thuê, sạc pin) ngày càng phức tạp. Đề tài "Hệ thống Quản lý Xe Ô tô Điện" được xây dựng nhằm mô phỏng và số hóa toàn diện quy trình vận hành này, đồng thời áp dụng chuẩn mực các nguyên lý trong Phân tích Thiết kế & Lập trình Hướng đối tượng:
3. 4 tính chất OOP:
4. Trừu tượng (Abstraction): Xây dựng lớp cơ sở Vehicle / các Interface dịch vụ ICarService, IChargingService.
5. Kế thừa (Inheritance): Lớp ElectricCar kế thừa từ Vehicle.
6. Đóng gói (Encapsulation): Che giấu dữ liệu (private attributes) và cung cấp getter/setter, validation ràng buộc.
7. Đa hình (Polymorphism): Ghi đè phương thức hiển thị chi tiết, tính giá cước linh hoạt theo từng loại xe/loại sạc.Cấu trúc dữ liệu & Xử lý ngoại lệ: Áp dụng ArrayList, HashMap, xử lý Custom Exceptions để ngăn chặn lỗi runtime.
8. Lưu trữ dữ liệu: Lưu trữ và đồng bộ hóa qua File I/O (Text File / Object Serialization).1.2. Phạm vi và Các thực thể quản lýXe ô tô điện (ElectricCar): Mã xe, biển số, hãng sản xuất, model, năm sản xuất, dung lượng pin (kWh), % pin hiện tại, tầm vận hành tối đa (km), trạng thái (Sẵn sàng, Đang sạc, Đang cho thuê, Đang bảo trì).
9. Trạm sạc (ChargingStation): Mã trạm, tên trạm, loại cổng sạc (AC thường / DC nhanh), công suất sạc (kW), đơn giá/kWh, lịch sử sạc.Khách hàng (Customer): Mã khách hàng, họ tên, CCCD, số điện thoại, hạng bằng lái.Hợp đồng cho thuê (RentalContract): Mã hợp đồng, xe thuê, khách hàng, thời gian bắt đầu - kết thúc, % pin lúc nhận - trả, đơn giá, tổng tiền thuê.
10. Giao dịch sạc pin (ChargingSession): Mã phiên sạc, xe sạc, trạm sạc, % pin ban đầu - kết thúc, số kWh tiêu thụ, tổng chi phí sạc.
11. 1.3. Yêu cầu hệ thốngYêu cầu chức năng (FR):FR1 (Quản lý xe điện - CRUD): Tiếp nhận xe mới, cập nhật thông số kĩ thuật, xóa xe hoặc ngừng theo dõi.
12. FR2 (Tìm kiếm & Tra cứu): Tìm kiếm đa tiêu chí theo biển số xe, hãng xe, khoảng dung lượng pin, trạng thái.
13. FR3 (Cảnh báo pin): Hệ thống tự động lọc các xe có dung lượng pin dưới 20% để ưu tiên cắm sạc.
14. FR4 (Nghiệp vụ sạc điện): Bắt đầu phiên sạc, cập nhật mức pin theo thời gian/công suất, tính cước nạp pin tự động và đổi trạng thái xe.
15. FR5 (Quản lý thuê xe): Lập hợp đồng thuê xe, kiểm tra điều kiện pin (>50%) và bằng lái khách hàng; bàn giao và nhận lại xe; thanh toán hợp đồng.
16. FR6 (Quản lý khách hàng): Quản lý hồ sơ tài xế, lịch sử thuê xe.
17. FR7 (Thống kê - Báo cáo): Báo cáo số lượng xe theo trạng thái hoạt động; thống kê doanh thu thuê xe và doanh thu dịch vụ sạc.
18. FR8 (Lưu trữ): Sao lưu và khôi phục dữ liệu từ tệp tin khi khởi động hoặc kết thúc ca làm việc.Yêu cầu phi chức năng (NFR)
19. :NFR1: Kiểm tra tính hợp lệ dữ liệu chặt chẽ (% pin từ 0 - 100, SĐT 10 số, định dạng biển số).
20. NFR2: Thiết kế kiến trúc 3 lớp (Model - Repository - Service).NFR3: Bắt lỗi ngoại lệ thân thiện, rõ ràng, không để ứng dụng crash đột ngột.
2. Vẽ biểu đồ Use Case (usecase-diagram.png)
2.1. Xác định Actors và Use CasesActor chính:Quản trị viên / Nhân viên vận hành (Admin / Operator): Người trực tiếp thao tác trên hệ thống để vận hành đội xe, thực hiện sạc, lập hợp đồng thuê và xem báo cáo.
Actor phụ (hoặc hệ thống nền):Hệ thống tệp tin (File System / Storage System): Đảm nhiệm việc nạp/ghi dữ liệu.
Các Use Cases chính:Đăng nhập hệ thốngQuản lý xe ô tô điện (Thêm, Sửa, Xóa, Xem danh sách)Tìm kiếm & Tra cứu xeCảnh báo xe sắp hết pin (<20%)Quản lý khách hàngThực hiện sạc xe điện (kèm tính phí nạp pin)Quản lý hợp đồng cho thuê xe (Tạo hợp đồng, Bàn giao xe, Trả xe & Thanh toán)Xem báo cáo & Thống kêĐọc/Ghi dữ liệu (File I/O)
