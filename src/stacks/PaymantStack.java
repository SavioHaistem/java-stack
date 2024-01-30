package stacks;

import entities.Employee;

import java.util.ArrayList;

public class PaymantStack {
    private ArrayList<Employee> employees = new ArrayList<>();

    public PaymantStack() {}

    public Employee getCurrentPaymant() {
        Employee currentEmployee = employees.getFirst();
        employees.removeFirst();
        System.out.println(employees);
        return currentEmployee;
    }

    public void addPaymant(Employee employee) {
        employees.addLast(employee);
    }
}
