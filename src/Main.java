public class Main {

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Курсовая работа 1");
        System.out.println("======================");
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee("Иванов Иван Иванович", 1, 50000);
        employeeManagement.addEmployee("Петров Петр Петрович", 2, 40000);
        employeeManagement.addEmployee("Антонов Антон Антонович", 3, 45000);
        employeeManagement.addEmployee("Максимов Максим Максимович", 4, 200_000);
        employeeManagement.addEmployee("Артемов Артем Артемович", 5, 150000);
        employeeManagement.addEmployee("Вазген Мурат Юсупович", 1, 55000);
        employeeManagement.addEmployee("Я Есть Грут", 2, 63000);
        employeeManagement.addEmployee("Люк Скай Вокер", 3, 79000);
        employeeManagement.addEmployee("Хренова Гадя Петрович", 5, 42000);
        employeeManagement.addEmployee("Дарт Вэйдэр", 5, 97000);
        employeeManagement.printAllContacts();
        System.out.println("======================");
        employeeManagement.printSumSalaryOfMonth();
        System.out.println("======================");
        employeeManagement.printMinSalary();
        System.out.println("======================");
        employeeManagement.printMaxSalary();
        System.out.println("======================");
        employeeManagement.PrintAvarageSalary();
        System.out.println("======================");
        employeeManagement.printAllFullNames();
    }
}