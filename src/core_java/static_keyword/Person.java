package core_java.static_keyword;

/**
 * Let say a person class need to be tracked to count the number of object created for the class
 * In this case if we will create instance variable then it will not work because it will keep renewing the value of
 * noOfPersonObjectCreated with every object creation, for the solution we need some global level variable which will be store in
 * the memory till the execution of program.
 * So 'static' keyword could only be the solution to above problem.
 */
public class Person {
    private Integer id;
    private String name;
    private String email;
    private String pass;
    private static int noOfPersonObjectCreated  = 0;

    public Person(Integer id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        noOfPersonObjectCreated++;
    }

    public static void main(String[] args) {

        System.out.println(Person.noOfPersonObjectCreated);
        Person p1 = new Person(1, "Satish", "satish@gmail.com", "1234");
        Person p2 = new Person(1, "Satish", "satish@gmail.com", "1234");
        Person p3 = new Person(1, "Satish", "satish@gmail.com", "1234");
        Person p4 = new Person(1, "Satish", "satish@gmail.com", "1234");
        Person p5 = new Person(1, "Satish", "satish@gmail.com", "1234");
        System.out.println(Person.noOfPersonObjectCreated);
    }
}
