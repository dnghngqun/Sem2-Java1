public class ScopeExample{
    public static void main(String[] args){
        int sum = 0; //có thể sử dụng trong và ngoài for

        int[] myArray = {1, 2, 3, 4};
        for(int i = 0; i < myArray.length; i++){
            //i  chỉ sử dụng trong for
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}