
package employee;

import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size; // Current number of employees

    // Constructor
    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add a new employee to the system
    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Employee array is full. Cannot add more employees.");
            return;
        }
        employees[size++] = employee;
    }

    // Search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by ID
    public void deleteEmployee(int employeeId) {
        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Employee not found.");
            return;
        }

        // Shift elements to the left to fill the gap
        for (int i = indexToDelete; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        // Nullify the last element and decrease size
        employees[size - 1] = null;
        size--;
    }
}
