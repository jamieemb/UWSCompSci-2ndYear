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
        studentDetails += String.format("%-20s", this.name);
        if (this instanceof FullTime){
            studentDetails += String.format("%-15s", "Full Time");

        } else {
            studentDetails += String.format("%-15s", "Part Time");
        }
        return studentDetails;
    }
}


