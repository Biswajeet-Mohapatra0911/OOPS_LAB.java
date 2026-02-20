package General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int id, String name) {
        empid = id;
        ename = name;
    }

    public double earnings(double basic) {
        return basic + 0.80 * basic + 0.15 * basic;
    }

    public int getEmpid() {
        return empid;
    }
}
