# Review-Source-VanTuan

## Bài tập 1
### SRP
#### Vi phạm trong class Vihicle lý do method formatDate, connectToDatabase không có mục đích vaf chịu trách nhiệm cụ thể nào trong class
### OCP
#### Vi phạm trong class Vihicle lý do method refuel không thể áp dụng cho xe đạp, khi kế thừa lại Vehicle sẽ phải ghi đè thuộc tính không cần thiết cho đối tượng xe đạp
### LSP
#### Không có
### ISP
#### Vi phạm trong interface Action lý do hành động run, stop không cùng chung mục đích với setTemperature
### DIP
#### Vi phạm trong abtract Vehicle lý do class Main đang quá phụ thuộc vào abtract Vehicly. Nếu car hoặc bicycle thêm thuộc tính thì class Main sẽ cần phải chỉnh sửa.
## Bài tập 2
### SRP
#### Vi phạm trong class StoreManager lý do class đang chịu trách nhiệm nhiều công việc chưa cụ thể. Vì vậy nên tách thành 2 class riêng biệt hoặc Interface class
### OCP
### LSP
### ISP
#### 
### DIP
#### Vi phạm trong class ShoppingCart lý do class ShoppingCart đang bị phụ thuộc vào class EmailService.