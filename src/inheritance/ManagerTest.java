package inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        for(Employee e : staff){
            System.out.println("name=" + e.getName()+",salary=" + e.getSalary());
        }
        /*if(staff[0] instanceof Manager){
            boss = (Manager) staff[0];
        }*/

        /*Manager[] managers = new Manager[3];
        managers[0] = new Manager("00",0,1,1,1);
        managers[1] = new Manager("11",11,1,1,1);
        managers[2] = new Manager("22",111,1,1,1);
        Employee[] staff = managers;
        //staff[0] = new Employee("1212",1221,11,1,1);
        for(Employee e : staff){
            System.out.println("name=" + e.getName()+",salary=" + e.getSalary());
        }*/
    }
}
