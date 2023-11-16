public class Main {

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Курсовая работа 1");
        System.out.println("======================");
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee(new Employee("Иванов Иван Иванович", 1, 50000));
        employeeManagement.addEmployee(new Employee("Петров Петр Петрович", 2, 40000));
        employeeManagement.addEmployee(new Employee("Антонов Антон Антонович", 3, 45000));
        employeeManagement.addEmployee(new Employee("Максимов Максим Максимович", 4, 200_000));
        employeeManagement.addEmployee(new Employee("Артемов Артем Артемович", 5, 150000));
        employeeManagement.addEmployee(new Employee("Вазген Мурат Юсупович", 1, 55000));
        employeeManagement.addEmployee(new Employee("Я Есть Грут", 2, 63000));
        employeeManagement.addEmployee(new Employee("Люк Скай Вокер", 3, 79000));
        employeeManagement.addEmployee(new Employee("Хренова Гадя Петрович", 5, 42000));
        employeeManagement.addEmployee(new Employee("Дарт Вэйдэр", 5, 97000));
        employeeManagement.addEmployee(new Employee("Mr. Pickles", 5, 100_000));
        employeeManagement.printAllContacts();
        System.out.println("======================");
        System.out.println("Затраты на зарплату в месяц = " + employeeManagement.getSumSalaryOfMonth());
        System.out.println("======================");
        System.out.println("Минимальная зарплата в месяц = " + employeeManagement.getMinSalary());
        System.out.println("======================");
        System.out.println("Максимальная зарплата в месяц = " + employeeManagement.getMaxSalary());
        System.out.println("======================");
        System.out.println("Средняя зарплата в месяц = " + employeeManagement.getAvarageSalary());
        System.out.println("======================");
        employeeManagement.printAllFullNames();
    }
}
