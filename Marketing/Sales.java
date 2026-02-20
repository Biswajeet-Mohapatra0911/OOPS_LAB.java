package Marketing;

import General.Employee;

public class Sales extends Employee {

    public Sales(int id, String name) {
        super(id, name);
    }

    public double tallowance(double total) {
        return 0.05 * total;
    }
}
