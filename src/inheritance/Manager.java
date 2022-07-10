package inheritance;

public class Manager extends Employee{
    private double bonus;

    /**
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Manager(String name, double salary, int year, int month, int day){
        super(name,salary,year,month,day);
        bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return bonus + baseSalary;
    }
    public void setBonus(double b){
        bonus = b;
    }

}
