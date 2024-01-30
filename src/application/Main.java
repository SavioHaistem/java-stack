package application;

import entities.Employee;
import stacks.PaymantStack;

public class Main {
    public static void main(String[] args) {
        PaymantStack paymantStack = new PaymantStack();
        paymantStack.addPaymant(new Employee("Julia"));
        paymantStack.addPaymant(new Employee("Ana"));
        paymantStack.addPaymant(new Employee("Beta"));
        paymantStack.getCurrentPaymant();
        paymantStack.getCurrentPaymant();
    }
}
