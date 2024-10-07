public class Professor extends Employee implements Workable,Service{
    int lecture;
    double salaryProfessor;

    public Professor(String name,String lastname, String department, boolean isMilitary, int lecture, double salaryProfessor) {
        super(name, lastname, department, isMilitary);
        this.lecture = lecture;
        this.salaryProfessor = salaryProfessor;
    }
    public double calculateSalary(){
        return lecture*salaryProfessor;
    }

    @Override
    public boolean isDuty() {
        return isMilitary;
    }

    @Override
    public String performDuties() {
        return "Professor must teaches students";
    }
}
