package StudentTest;

public class StudentTest {

    public static void main (String[] args){
        PartTime partTime = new PartTime("Jamie", 2);
        FullTime fullTime = new FullTime("Shannon");
        FullTime student = new FullTime("Holly");

        // Original output before loans are issued
        System.out.println("- Object Details -");
        System.out.println("\t" + partTime);
        System.out.println("\t" + fullTime);
        System.out.println("\t" + student);

        // Loans are issued
        fullTime.issueLoan();
        student.issueLoan();

        // After loans are issued
        System.out.println("\n");
        System.out.println("- Loans Issued -");
        System.out.println("\t"+partTime);
        System.out.println("\t"+fullTime);
        System.out.println("\t"+student);






    }


}
