public class ExamMarksTest {


    public static void main (String[] args){

        int numberOfStudents = Input.getInteger("How many students would you like to add?: ");

        for (int i = 0; i < numberOfStudents; i++){
            int examMark=0;
            System.out.printf("Student %d\n", i+1);

            for (int j=0; j<4;j++){
                int input;

                do {
                    input = Input.getInteger(String.format("Mark for question %d: ", j+1));

                }
                while (input < 0 || input > 25);
                examMark+=input;

            }

            System.out.println("Exam mark: " + examMark);
            if (examMark < 40) {
                System.out.println("Student has failed\n");
            }
            else if(examMark >=40 && examMark < 70){
                System.out.println("Student has passed\n");
            }
            else {
                System.out.println("Student has passed with Merit\n");
            }
        }

    }
}
