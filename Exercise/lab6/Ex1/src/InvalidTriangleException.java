public class InvalidTriangleException extends Exception{

    public InvalidTriangleException(String message) {
        super(message);
    }

//    public InvalidTriangleException() {
//        super();
//    }
    public void throwException() throws InvalidTriangleException{
        throw new InvalidTriangleException(getMessage());
    }
}
