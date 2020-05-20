package ss2_mang_va_phuong_thuc_trong_java.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
    @Override
    public String getMessage(){
        return "Lỗi giá trị khi nhập: "+super.getMessage();
    }
}
