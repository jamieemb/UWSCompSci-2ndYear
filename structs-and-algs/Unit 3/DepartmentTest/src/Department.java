public class Department {

    String departmentName;
    Manager manager;

    public Department(String departmentName, Manager manager){
        this.departmentName=departmentName;
        this.manager=manager;

    }

    @Override
    public String toString(){
        return "Department: " + this.departmentName + "\n" + "Manager: " + this.manager.toString();
    }



}
