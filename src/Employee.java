public abstract class Employee {
    String name;
    String lastname;
    String department;
    boolean isMilitary;

    public Employee(String name, String lastname,String department, boolean isMilitary) {
        this.name = name;
        this.lastname = lastname;
        this.department = department;
        this.isMilitary = isMilitary;
    }
    public String getInfo(){
        return "Name:"+name+", lastname:"+lastname+", department:"+department+", Military:"+(isMilitary?"Yes":"No");
    }


    public abstract double calculateSalary();
}
