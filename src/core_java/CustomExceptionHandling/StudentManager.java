package core_java.CustomExceptionHandling;

public class StudentManager {

    public void getAuthorisedStudent(Integer rollNo) {
        Student student = new Student();

            try {
                if (rollNo == 12345){
                    student.setName("Prabhakar Mishra");
                    System.out.println("Student is authorised with name "+student.getName());
                }else {
                    throw new UnAuthorisedStudentException("Unauthorised User");
                }
            }catch (UnAuthorisedStudentException e){
                System.out.println("Custom Exception "+e.getMessage());
            }


    }

    public static void main(String[] args) throws UnAuthorisedStudentException {
        StudentManager manager = new StudentManager();
        manager.getAuthorisedStudent(123456);
    }
}
