package StudentTest;

public class Student {

    // Declaring attribute variables
    private final String name;

    //Constructor
    public Student(String name) {
        this.name = name;
    }

    // toString override method
    @Override
    public String toString(){
        String studentDetails = "";
        studentDetails += "name: " + this.name;
        return studentDetails;
    }
}


