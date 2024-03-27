public class CustomExceptionExample {

    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Phương thức có thể ném ra ngoại lệ kiểu CustomException
    public void throwError() throws CustomException {
        throw new CustomException("Lỗi gì đó");
    }

    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();

        try {
            example.throwError();
        } catch (CustomException e) {
            System.err.println("Custom exception: " + e.getMessage());
        }
    }
}
