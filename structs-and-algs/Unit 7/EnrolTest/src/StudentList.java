public class StudentList {

    // Declaring initial variables
    private Student[] students;
    private Integer listCounter;

    // Constructor
    public StudentList(Integer listSize){

        // set the length of the array
        this.students = new Student[listSize];

        // sets the initial value of the listCounter to maintain array position and max array length
        this.listCounter = 0;
    }

    // toString Method to display output in table format
    @Override
    public String toString(){

        StringBuilder studentListDetails = new StringBuilder();
        studentListDetails.append(String.format("%-20s%-15s%10s%15s\n", "NAME", "TYPE", "MODULES", "LOAN ISSUED"));

        // Iterative loop to output all objects stored within the array
        if (this.listCounter !=0){
            for (int student =0; student<this.listCounter; student++) {
                studentListDetails.append(this.students[student]).append("\n");
            }
        }
        // Exception handling for empty array
        else studentListDetails.append("There are no Students within this list");

        // Returns object from array in tabled format
        return studentListDetails.toString();
    }

    // Method for adding a partTime student object to the array
    public void addPartTime(String name, Integer numberOfModules){

        // Adds partTime student object to the array at current position of listCounter
        this.students[this.listCounter] = new PartTime(name, numberOfModules);

        // Adding 1 to the list counter
        this.listCounter++;

    }

    // Method for adding a fullTime student object to the array
    public void addFullTime(String name){

        // Adds fullTime student object to the array at current position of listCounter
        this.students[this.listCounter] = new FullTime(name);

        // Adding 1 to the list counter
        this.listCounter++;

    }

    // Method for issuing loans
    public void issueLoans(){
        for (int student = 0; student < this.listCounter; student++){
            if (this.students[student] instanceof FullTime)
                ((FullTime) this.students[student]).issueLoan();
        }


    }


}
