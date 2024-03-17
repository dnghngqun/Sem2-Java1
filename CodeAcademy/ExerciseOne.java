public class ExerciseOne{
    public static void main(String[] args){
        //Math.random(): Trả về một double giá trị có dấu dương,
        // lớn hơn hoặc bằng 0.0 và nhỏ hơn 1.0
        int randomNum = (int)(Math.random() * 10) + 1;
        System.out.println("Your random number between one and ten is " + randomNum);

        //Math.abs(): Trả về giá trị tuyệt đối của một int giá trị
        int negativeNum = -2;
        int absNum = Math.abs(negativeNum);
        System.out.println("The absolute value of "+ negativeNum + " is " + absNum);

        //Integer.toString(1): chuyển đổi số nguyên thành dạng chuỗi 1 -> "1"
        String myNewString = Integer.toString(1);
        System.out.println(myNewString);

    }
}