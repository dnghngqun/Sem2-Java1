package Bank.T2307M;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private  static Long id = 0L;
    private  static ReentrantLock lock = new ReentrantLock();

    public static Long getNewID(){
        Long result = null;
        lock.lock();// khóa biến id lại chỉ cho duy nhất một thread được truy xuất cập
        //để tránh tình trạng Data Racing!
        /*
        * Data racing là một vấn đề trong lập trình đa luồng (multithreading),
        * xảy ra khi hai hoặc nhiều luồng cố gắng cùng truy cập hoặc thay đổi dữ liệu chia sẻ cùng một lúc
        * mà không có cơ chế đồng bộ hóa hoặc bảo vệ.
        * Kết quả của việc này là không thể đoán trước được, và phụ thuộc vào thời điểm mà các luồng được thực thi.
        * Các vấn đề có thể phát sinh bao gồm dữ liệu bị mất hoặc không nhất quán,
        *  dẫn đến kết quả không chính xác hoặc không mong muốn*/
        try {
            result = ++id;//tăng rồi gán vào result
        } finally {
            lock.unlock();//tăng rồi thì mở cho thread khác cùng truy cập
            //giống như đi vệ sinh xong thì ra
        }
        return result;
    }
    private  IdGenerate(){
    }
}
