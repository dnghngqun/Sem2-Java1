public class Main {
    /*
     * Khối lệnh try catch finally
     * try{
     * //code có thể ném ra ngoại lệ
     * }catch(Exception_class_name e){
     * //code xử lý ngoại lệ
     * }finally{
     * //code trong khối này luôn được thực thi
     * }
     *
     * Một số phương thức(method) của lớp Exception
     * getMessage(): trả về một message cụ thể về exception đã xảy ra
     * getCause(): trả về nguyên nhân xảy ra exception
     * toString(): trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
     * printStackTrace(): in ra kết quả của phương thức toString() cùng với stack trace đến System.err
     * fillInStackTrace(): làm đầy stack trace của đối tượng Throwable bằng stack trace hiện tại
     *
     * ************************************************************************
     *
     * Throw và Throws
     * Từ khóa throw trong java được sử dụng để ném ra một ngoại lệ (chủ động ném ra lỗi) cụ thể
     * Chúng ta có thể ném ra hai ngoại lệ checked và unchecked trong java bằng tùe khóa throw.
     * Từ khóa throw chủ yếu được sử dụng để ném ra ngoại lệ tùy chỉnh
     * (Ngoại lệ do người dùng định nghĩa)
     * Sau throw là một hoặc nhiều instance
     * Không thể throw nhiều exceptions
     *
     * Từ khóa Throws
     * Từ khóa throws trong java được sử dụng khi bạn không muốn phải xây dựng try-catch bên trong 1 phương thức nào đó
     * Bạn "đẩy trách nhiệm" phải try catch này cho phương thức nào đó bên ngoài có gọi đến nó phải try catch giúp bạn
     * Sau throws là một hoặc nhiều class
     * Có thể khai báo nhiều exceptions
     * Ví dụ: public methodName() throws Exception_name_1, Exception_name_2, Exception_name_3{}
     *
     * */
    public static void main(String[] args) throws Exception {

    }
}