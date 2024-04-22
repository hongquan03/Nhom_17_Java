import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Code: " + code);
        System.out.println("Salary Rate: " + salaryRate);
        System.out.println("--------------------------");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }
}

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void displayEmployeeList() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employees.remove(employee);
                System.out.println("Employee removed successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Khởi tạo 10 nhân viên mẫu
        management.addEmployee(new Employee(1, "John Doe", 30, "IT", "JD001", 30.0));
        management.addEmployee(new Employee(2, "Jane Smith", 35, "HR", "JS001", 25.0));
        management.addEmployee(new Employee(3, "Michael Johnson", 28, "Finance", "MJ001", 35.0));
        management.addEmployee(new Employee(4, "Emily Davis", 32, "Marketing", "ED001", 28.0));
        management.addEmployee(new Employee(5, "David Wilson", 40, "Operations", "DW001", 32.0));
        management.addEmployee(new Employee(6, "Olivia Brown", 27, "IT", "OB001", 30.0));
        management.addEmployee(new Employee(7, "James Taylor", 33, "HR", "JT001", 25.0));
        management.addEmployee(new Employee(8, "Sophia Martinez", 29, "Finance", "SM001", 35.0));
        management.addEmployee(new Employee(9, "Benjamin Anderson", 31, "Marketing", "BA001", 28.0));
        management.addEmployee(new Employee(10, "Mia Thomas", 36, "Operations", "MT001", 32.0));

        // Hiển thị danh sách 10 nhân viên
        management.displayEmployeeList();

        // Thêm một nhân viên mới vào danh sách
        Employee newEmployee = new Employee(11, "Emma Garcia", 26, "IT", "EG001", 30.0);
        management.addEmployee(newEmployee);

        // Hiển thị danh sách sau khi thêm nhân viên mới
        management.displayEmployeeList();

        // Xóa một nhân viên từ danh sách
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee ID to remove: ");
        int employeeIdToRemove = scanner.nextInt();
        management.removeEmployee(employeeIdToRemove);

        // Hiển thị danh sách sau khi xóa nhân viên
        management.displayEmployeeList();
    }
}