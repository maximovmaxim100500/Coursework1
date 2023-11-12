public class EmployeeManagement {
    private static int counter = 0;
    public static int getAndIncrement() {
        counter++;
        return counter;
    }
    private final Employee[] employees;
    private int count;

    public EmployeeManagement() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, int salary) {       //Создание сотрудника
        if (count > employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[count++] = newEmployee;
    }

    public void printAllContacts() {           //Печатаем все свойства всех объектов
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            System.out.println(employees[i]);
        }
    }

    int sumSalary;
    public void printSumSalaryOfMonth() {           //Печатаем затраты на зарплату в месяц
        sumSalary = 0;
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            sumSalary += contact.getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц составила = " + sumSalary);
    }

    public void printMinSalary() {           //Печатаем сотрудника с минимальной зарплатой
        int minSalary = 10_000_000;
        String minEmployee = " ";
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            if (contact.getSalary() < minSalary) {
                minSalary = contact.getSalary();
                minEmployee = contact.getFullName();
            }
        }
        System.out.println("Минимальная зарплата " + minSalary + " рублей/месяц у сотрудника " + minEmployee);
    }
    public void printMaxSalary() {           //Печатаем сотрудника с максимальной зарплатой
        int maxSalary = -1;
        String maxEmployee = " ";
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            if (contact.getSalary() > maxSalary) {
                maxSalary = contact.getSalary();
                maxEmployee = contact.getFullName();
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary + " рублей/месяц у сотрудника " + maxEmployee);
    }
    public void PrintAvarageSalary() {           //Печатаем среднюю зарплату за месяц
        int avarageSalary = sumSalary/count;

        System.out.println("Средняя зарплата за месяц = " + avarageSalary);
    }
    public void printAllFullNames() {           //Печатаем ФИО всех сотрудников
        System.out.println("Имена всех сотрудников:");
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            System.out.println(contact.getFullName());
        }
    }
}
