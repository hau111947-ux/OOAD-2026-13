1. Lập hợp đồng thuê xe (UC_Rent)
* **Actor:** Nhân viên bán hàng.
* **Điều kiện tiên quyết:** Khách hàng có bằng lái hợp lệ; Xe đang `Rảnh` và mức pin \(\ge 50\%\).
* **Luồng sự kiện chính:**
  1. Nhân viên nhập mã khách hàng và mã xe cần thuê.
  2. Hệ thống kiểm tra điều kiện: Bằng lái hợp lệ và xe `Rảnh` có pin \(\ge 50\%\).
  3. Nhập thời gian thuê, đơn giá và ghi nhận % pin lúc bàn giao.
  4. Hệ thống tạo hợp đồng, tự động chuyển xe sang trạng thái `Đang cho thuê`.
* **Luồng rẽ nhánh:** Nếu pin \(< 50\%\) hoặc xe bận, hệ thống từ chối tạo hợp đồng và báo lỗi.
2. Tiếp nhận trả xe & Thanh toán (UC_Return)
Actor: Nhân viên bán hàng.
Điều kiện tiên quyết: Hợp đồng thuê xe đang có hiệu lực.
Luồng sự kiện chính:Chọn mã hợp đồng cần kết thúc.
Nhập % pin thực tế khi nhận lại xe và thời gian trả.
Hệ thống tính tổng tiền thuê xe (kèm phụ phí nếu có).
Xác nhận thanh toán, đóng hợp đồng và chuyển xe về trạng thái Rảnh.
Luồng rẽ nhánh: Nếu % pin lúc trả $< 20\%$, hệ thống tự động gắn cờ cảnh báo pin yếu.
3. Thực hiện sạc xe điện (UC_Charge)Actor: Nhân viên kỹ thuật.
Điều kiện tiên quyết: Xe đang Rảnh (hoặc pin $< 20\%$); Trạm sạc sẵn sàng.
Luồng sự kiện chính:Chọn xe cần sạc và trạm sạc khả dụng.
Hệ thống chuyển trạng thái xe sang Đang sạc.
Nhập % pin cần nạp thêm; hệ thống mô phỏng quá trình sạc
Tự động tính tiền điện: $\text{Tiền sạc} = \text{Số kWh nạp} \times \text{Đơn giá trạm}$.
Hoàn tất sạc, lưu lịch sử phiên sạc và chuyển xe về trạng thái Rảnh.
Luồng rẽ nhánh: Trạm sạc đang bận thì yêu cầu kỹ thuật viên chọn trụ khác.
4. Cảnh báo xe pin yếu (UC_Alert)Actor: Nhân viên kỹ thuật
Điều kiện tiên quyết: Mở màn hình tra cứu/giám sát đội xe.
Luồng sự kiện chính:Hệ thống tự động quét danh sách phương tiện.
Phát hiện và lọc các xe có mức pin $< 20\%$.
Hiển thị danh sách cảnh báo để kỹ thuật viên ưu tiên cắm sạc.
5. Quản lý đội xe (UC_ManageCars)Actor: Quản lý (Manager).
Điều kiện tiên quyết: Đăng nhập tài khoản quyền Quản lý.
Luồng sự kiện chính:
Thêm xe: Nhập thông tin xe (Mã xe, biển số, hãng, dung lượng pin); hệ thống kiểm tra không trùng lặp và lưu với trạng thái Rảnh.
Sửa/Xóa: Chọn xe cần cập nhật thông số hoặc thanh lý khỏi hệ thống.
Luồng rẽ nhánh: Không cho phép xóa xe đang trong trạng thái Đang cho thuê.
