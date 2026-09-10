# BÀI TẬP: HỆ THỐNG QUẢN LÝ XE Ô TÔ ĐIỆN (JAVA)

## 1. Thông tin nhóm
- Lớp: [OOAD IT25M]
- Nhóm: [13]

Họ và tên 
| 1 | [Đỗ Văn Hậu] | 
| 2 | [Triệu Quang Mười] 

---

## 2. Mục tiêu đề tài
Xây dựng ứng dụng quản lý xe ô tô điện nhằm áp dụng các kiến thức cốt lõi của môn Lập trình Hướng đối tượng (OOP) với Java:
- Áp dụng 4 tính chất: Kế thừa (Inheritance), Đóng gói (Encapsulation), Đa hình (Polymorphism), Trừu tượng (Abstraction).
- Xử lý cấu trúc dữ liệu (Collections: ArrayList, HashMap) và xử lý ngoại lệ (Exception Handling).
- Thao tác lưu trữ dữ liệu (Đọc/ghi File hoặc JDBC/MySQL).

---

## 3. Phạm vi và Thực thể quản lý
- **Xe ô tô điện:** Mã xe, Biển số, Hãng sx, Model, Năm sx, Dung lượng pin (kWh), % pin hiện tại, Tầm vận hành tối đa (km), Trạng thái (Rảnh / Đang sạc / Đang cho thuê / Bảo trì).
- **Trạm sạc:** Mã trạm, Loại cổng sạc (AC thường / DC nhanh), Lịch sử sạc (thời gian, kWh nạp, số tiền).
- **Khách hàng / Tài xế:** Mã KH, Họ tên, CCCD, Số điện thoại, Hạng bằng lái.
- **Hợp đồng thuê / Giao dịch:** Mã GD, Xe thuê, Khách hàng, Thời gian bắt đầu - kết thúc, % pin nhận - trả, Thành tiền.

---

## 4. Chức năng hệ thống

Quản lý cơ bản (CRUD)
- Thêm, sửa, xóa thông tin xe ô tô điện.
- Tìm kiếm, lọc xe theo: Biển số, Hãng xe, Trạng thái hoạt động, Mức pin.
- Quản lý danh sách khách hàng và lịch sử giao dịch.

Nghiệp vụ xe điện
- **Cảnh báo pin:** Lọc danh sách xe có pin < 20% cần cắm sạc.
- **Mô phỏng sạc pin:** Tăng % pin theo thời gian và công suất cổng sạc.
- **Tính toán chi phí:** Tính tiền điện sạc dựa trên số kWh và đơn giá; tính tiền thuê xe theo thời gian/tiêu hao pin.

### Báo cáo & Thống kê
- Thống kê tỷ lệ xe theo từng trạng thái.
- Báo cáo doanh thu dịch vụ sạc và cho thuê xe.
- Lưu trữ dữ liệu hệ thống ra tệp (File I/O).

---

## 5. Cấu trúc mã nguồn dự kiến
```text
src/
├── model/          # Vehicle, ElectricCar, ChargingStation, Customer, Contract
├── service/        # Các Interface và Service xử lý logic nghiệp vụ
├── repository/     # Đọc/ghi dữ liệu từ file hoặc Database
└── main/           # Main.java - Chạy chương trình
6. Công nghệ sử dụng
Ngôn ngữ: Java (JDK 17+)

Quản lý mã nguồn: Git, GitHub

Lưu trữ: Text File / Object Serialization (hoặc MySQL nếu mở rộng)
