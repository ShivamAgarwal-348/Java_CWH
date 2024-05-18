class Employee{
    int salary;
    String name;

    public Employee(){

    }
    public Employee(int s, String n){
        salary = s;
        name = n;
    }
    public int getSalary(){
        return salary;
    }

    public void setName(String s){
        name = s;
    }
    public String getname(){
        return name;
    }

}

public class CWH_039 {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(1000, "name");
        // emp.salary = 10000;
        // emp.setName("Dull");
        System.out.println(emp.getSalary());
        System.out.println(emp.getname());
        
    }
}
