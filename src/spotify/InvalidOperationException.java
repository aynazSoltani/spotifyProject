package spotify;

public class InvalidOperationException extends Exception{
    public InvalidOperationException(String massagee){
        super(massagee);
    }
}
