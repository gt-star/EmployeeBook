import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0]= new Employee("Иванов", "Иван", "Иванович", 1, 520000);
        employee[1]= new Employee("Иванов", "Иван", "Иванович", 2, 45000);
        employee[2]= new Employee("Иванов", "Иван", "Иванович", 3, 40000);
        employee[3]= new Employee("Иванов", "Иван", "Иванович", 4, 35000);
        employee[4]= new Employee("Иванов", "Иван", "Иванович", 5, 30000);
        employee[5]= new Employee("Иванов", "Иван", "Иванович", 1, 50000);
        employee[6]= new Employee("Иванов", "Иван", "Иванович", 2, 1111000);
        employee[7]= new Employee("Иванов", "Иван", "Иванович", 3, 40000);
        employee[8]= new Employee("Иванов", "Иван", "Иванович", 4, 35000);
        employee[9]= new Employee("Иванов", "Иван", "Иванович", 5, 30000);

        double sum = 0;
        for (int i = 0; i < employee.length;i++){
            sum = employee[i].sumSalary() + sum;
        }
        System.out.println(sum);

        double minSum = 0;
        for (int i = 0; i < employee.length;i++){
            minSum = employee[i].minSalaryEmployee();
        }
        System.out.println(minSum);

        double maxSum = 0;
        for (int i = 0; i < employee.length;i++){
            if (maxSum < employee[i].maxSalaryEmployee()){
                maxSum = employee[i].maxSalaryEmployee();
            }
        }
        System.out.println(maxSum);


    }
}