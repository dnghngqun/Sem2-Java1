

public class UncheckedException{

    public UncheckedException () {
    }

    public static void main(String[] args) {
        int i, n = 4;
        int a[] = new int[n];

        java.util.Scanner input = new java.util.Scanner(System.in);
        //kiểm tra đoạn mã nghi ngờ xảy ra lỗi
        try {
            for (i = 0; i <= n; i++) {
                System.out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            }
        // bắt lỗi
        //lỗi ArrayIndexOutOfBoundsException lấy được sau khi chạy đoạn mã lần đầu tiên
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Vị trí truy xuất không thuộc mảng, vui lòng xem lại mã nguồn!");

        } finally {//chạy code trong ngoặc khi kết thúc try catch bất kì có lỗi hay không
            System.out.println("Kết thúc!");
        }
    }
}

