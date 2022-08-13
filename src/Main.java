import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0]= new Employee("Иванов", "Иван", "Иванович", 1, 52200);
        employee[1]= new Employee("Иванов", "Петр", "Иванович", 2, 45600);
        employee[2]= new Employee("Иванов", "Сергей", "Иванович", 3, 42350);
        employee[3]= new Employee("Иванов", "Артем", "Иванович", 4, 35950);
        employee[4]= new Employee("Иванов", "Роман", "Иванович", 5, 30500);
        employee[5]= new Employee("Иванов", "Данил", "Иванович", 1, 65420);
        employee[6]= new Employee("Иванов", "Василий", "Иванович", 2, 112300);
        employee[7]= new Employee("Иванов", "Антон", "Иванович", 3, 47850);
        employee[8]= new Employee("Иванов", "Федор", "Иванович", 4, 39500);
        employee[9]= new Employee("Иванов", "Алексадн", "Иванович", 5, 48500);

        System.out.println("Список всех сотрудников: ");
        for (int i = 0; i<employee.length;i++){
            System.out.println(employee[i].toString());
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < employee.length;i++){
            sum = employee[i].sumSalary() + sum;
        }
        System.out.println("Общая сумма затрат на зарплату: " + sum + "\n");

        double minSum = 0;
        for (int i = 0; i < employee.length;i++){
            minSum = employee[i].minSalaryEmployee();
        }
        System.out.println("Минимальная заработная плата: " + minSum + "\n");

        double maxSum = 0;
        for (int i = 0; i < employee.length;i++){
            if (maxSum < employee[i].maxSalaryEmployee()){
                maxSum = employee[i].maxSalaryEmployee();
            }
        }
        System.out.println("Максимальная заработная плата: " + maxSum + "\n");

        double mediumSum = 0;
        for (int i = 0; i<employee.length;i++){
            mediumSum = employee[i].mediumSalary() + mediumSum;
        }
        System.out.println("Средняя заработная плата: " + mediumSum);
    }
}