public class Client {

    public Client() {
        // To do:
    }

    public void doUnchecked(String value) {
        // phải check exception ko sẽ bug
        int result=canThrowUncheckedException(value);
        System.out.println("result="+result);
    }

    private int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }

    public void doChecked() {
        try {
            //check exception ở đây
            canThrowCheckedException();
            System.out.println("OK");
        }catch(Exception ex) {
            System.err.println(ex);
        }
    }

    private int canThrowCheckedException() throws Exception{
        throw new Exception("Lỗi");
    }

    public static void main(String[] args) {
        Client client = new Client();
//        client.doUnchecked("Hello");
        System.out.println("-------------");
        client.doChecked();
    }
}