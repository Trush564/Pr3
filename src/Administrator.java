public class Administrator extends Employee implements Workable,Service{
    int hoursWork;
    int hoursSalary;

    public Administrator(String name, String lastname, String department, boolean isMilitary, int hoursWork, int hoursSalary) {
        super(name, lastname, department, isMilitary);
        this.hoursWork = hoursWork;
        this.hoursSalary = hoursSalary;
    }

    @Override
    public double calculateSalary() {
        return hoursWork*hoursSalary;
    }
    @Override
    public String performDuties() {
        return "Administrator manages tasks";
    }

    @Override
    public boolean isDuty() {
        return isMilitary;
    }
}
