public class MoreClass{

    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1);
        //in ra kết quả: tên lớp@địa chỉ bộ nhớ
        //do không định nghĩa một phương thức tùy chỉnh
        //nên sẽ in ra chuỗi có dạng  "Tên lớp @ địa chỉ bộ nhớ"
        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
        //in ra kết quả: this is obj2
        //do phương thức println tự động gọi phương thức toString của obj2

    }
}

