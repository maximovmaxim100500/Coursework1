public class Employee {
    public static int length;
    private String fullName;
    private int department;
    private int salary;
    private int id;
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = EmployeeManagement.getAndIncrement();

    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID сотрудника - " + id + ", ФИО - " + fullName + ", отдел - " + department + ", зарплата - "
                + salary + " рублей.";
    }
}

