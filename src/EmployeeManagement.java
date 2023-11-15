public class EmployeeManagement {
                 //Статическая переменная - счетчик, которая отвечает за ID
    public static int getAndIncrement() {
        int counter = 0;
        counter++;
        return counter;
    }



    private final Employee[] employees;
    private int count;

    public EmployeeManagement() {
        this.employees = new Employee[10];
    }

    public void addEmployee(Employee newEmployee) {       //Создание сотрудника
        if (count > employees.length - 1) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        employees[count++] = newEmployee;
    }

    public void printAllContacts() {           //Печатаем все свойства всех объектов
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            System.out.println(employees[i]);
        }
    }



    public int getSumSalaryOfMonth() {           //Считаем затраты на зарплату в месяц
        int sumSalary = 0;
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            sumSalary += contact.getSalary();
        }
        return sumSalary;
    }

    public int getMinSalary() {           //Находим минимальную зарплату
        int minSalary = 10_000_000;
        String minEmployee = " ";
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            if (contact.getSalary() < minSalary) {
                minSalary = contact.getSalary();
                minEmployee = contact.getFullName();
            }
        }
        return minSalary;
    }

    public int getMaxSalary() {           //Находим максимальную зарплату
        int maxSalary = -1;
        String maxEmployee = " ";
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            if (contact.getSalary() > maxSalary) {
                maxSalary = contact.getSalary();
                maxEmployee = contact.getFullName();
            }
        }
        return maxSalary;
    }

    public int getAvarageSalary() {           //считаем среднюю зарплату за месяц
        int avarageSalary = getSumSalaryOfMonth() / count;
        return avarageSalary;
    }

    public void printAllFullNames() {           //Печатаем ФИО всех сотрудников
        System.out.println("Имена всех сотрудников:");
        for (int i = 0; i < count; i++) {
            Employee contact = employees[i];
            System.out.println(contact.getFullName());
        }
    }
}
