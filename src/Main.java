import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        Random random = new Random();
        var names = new String[]{"Иван", "Петр", "Сергей", "Артем", "Роман", "Данил", "Василий", "Антон", "Федор", "Алексаднр"};
        var surNames = new String[]{"Иванов", "Петров", "Сидоров", "Пшенов", "Хомяков"};
        var middleNames = new String[]{"Иванович", "Петрович", "Александрович"};
        for (int i = 0; i < employee.length; i++) {
            var salary = random.nextInt(100_000)+10000;
            var department = random.nextInt(5)+1;
            var name = names[random.nextInt(names.length)];
            var surName = surNames[random.nextInt(surNames.length)];
            var middleName = middleNames[random.nextInt(middleNames.length)];
            employee[i] = new Employee(name, surName, middleName, department, salary);
        }
        System.out.println("Список всех сотрудников: ");
        printAllEmployees();
        System.out.println("Общая сумма затрат на зарплату: " + sumSalary() + "\n");
        System.out.println("Минимальная заработная плата: " + minSalaryEmployee() + "\n");
        System.out.println("Максимальная заработная плата: " + maxSalaryEmployee() + "\n");
        System.out.println("Средняя заработная плата: " + mediumSalary());
    }
    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++)
        {
            sum = employee[i].getSalary() + sum;
        }
        return sum;
    }
    public static double minSalaryEmployee () {
        double minSum = Double.MAX_VALUE;
        for (int i = 0; i < employee.length;i++){
            minSum = Math.min(minSum, employee[i].getSalary());
        }
        return minSum;
    }
    public static double maxSalaryEmployee () {
        double maxSum = Double.MIN_VALUE;
        for (int i = 0; i < employee.length;i++){
            maxSum = Math.max(maxSum, employee[i].getSalary());
        }
        return maxSum;
    }
    public static double mediumSalary () {
        return sumSalary() / employee.length;
    }
    public static void printAllEmployees () {
        for (var employees : employee) {
            System.out.println(employees);
        }
    }
}