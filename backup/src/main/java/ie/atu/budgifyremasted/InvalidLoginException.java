package ie.atu.budgifyremasted;

public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message){
        super(message);
    }

}
