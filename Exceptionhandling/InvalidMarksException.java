package Exceptionhandling;

public class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}