public class DepartmentTest {

    public static void main (String[] args){

        String newManager = Input.getString("Who is the manager? >> ");
        String departmentName = Input.getString("What is the name of the department? >> ");

        Manager managerNew = new Manager (newManager);
        Department department = new Department(departmentName, managerNew);


        System.out.println(department.toString());








    }
}
