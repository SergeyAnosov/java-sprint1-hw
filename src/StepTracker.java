import java.util.Scanner;

public class StepTracker {
    public int stepsGoal = 10000;
    Scanner scanner = new Scanner(System.in);

    public int changeGoal(int steps) {
        stepsGoal = steps;      
        return stepsGoal;
    }
    
    MonthData[] monthToData = new MonthData[];


    public StepTracker() {

        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
       int[] days = new int[30];
    }

    public void setStepValue() {
        System.out.println("За какой месяц вы хотите ввести шаги? (от 1 до 12)");
        if ((scanner.hasNextInt()) {
            int month = scanner.nextInt();
        } else {
            System.out.println("Извините, не верный ввод. Перезапустите программу и попробуйте снова");
        }
        System.out.println("За какой день вы хотите ввести шаги? (от 1 до 30)");
        int day = scanner.nextInt();             
        System.out.println("Введите количество шагов (строго больше нуля):");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("введено отрицательное число. Программа завершена");
            return;
        }
        
        monthToData[month-1].days[day-1] = steps;
    }
    
    public void stepPerDay(int month) {
        for (int i = 0; i < 30; i++) {
            System.out.println(i + " день: " + monthToData[month - 1].days[i]);
    }
    
    public int sumMonthSteps(int month) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum = sum + monthToData[month - 1].days[i];
        }
        return sum;        
    }
     
    public int maxMonthStep(int month) {
        int max = monthToData[0].days[0];
        for (int i = 1; i < 30; i++) {
            if (monthToData[month - 1].days[i] > max) {
                max = monthToData[month - 1].days[i];
            }
        }
        return max;
    }
        
    public int bestSeria(int month) {
        int seria = 0;
        int count = 0;
        
        for (int i = 0; i < 30; i++) {
            if (monthToData[month - 1].days[i] >= stepsGoal) {
                count++;
                 if (count > seria) {
                    seria = count;
                }
            } else if (monthToData[month - 1].days[i] < stepsGoal)  { 
                
                count = 0;
            } 
        }
        return seria;
    }
        
    scanner.close();
        
    

}
