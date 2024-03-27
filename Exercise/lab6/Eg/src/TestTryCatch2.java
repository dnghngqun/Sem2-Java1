public class TestTryCatch2 {
    public static void main(String args[]) {
    try {
        int data = 50 / 0;//lỗi ở đây
        } catch (ArithmeticException e) {
            System.err.println("Có lỗi trong phép tính số học");
        }
    }
}

