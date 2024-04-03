//custom exception
public class AgeCheckingException extends Exception{
    @Override
    public String getMessage() {
        return "An error occurred: " + super.getMessage();
    }

    //đây là phương thức do tự định nghĩa
    public AgeCheckingException(String message){
        super(message);
    }

}

