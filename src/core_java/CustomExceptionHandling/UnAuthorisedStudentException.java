package core_java.CustomExceptionHandling;

public class UnAuthorisedStudentException extends RuntimeException{

    public UnAuthorisedStudentException(String message){
        super(message);
    }

}
