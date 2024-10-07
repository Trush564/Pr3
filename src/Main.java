//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professor professor=new Professor("Julia","Semeniv","Math",true,148,1580);
        Administrator administrator=new Administrator("Sasha","Semenko","Manager",false,205,1000);
        System.out.println("Professor info:"+professor.getInfo());
        System.out.println("Salary:"+professor.calculateSalary());
        System.out.println("Duty:"+professor.performDuties());
        System.out.println("Duty:"+professor.isDuty());
        System.out.println("Administrator info:"+administrator.getInfo());
        System.out.println("Salary:"+administrator.calculateSalary());
        System.out.println("Duties:"+administrator.performDuties());
        System.out.println("Duty:"+administrator.isDuty());
    }
}