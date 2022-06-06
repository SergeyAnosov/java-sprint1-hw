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
        int month = scanner.nextInt();
        System.out.println("За какой день вы хотите ввести шаги? (от 1 до 30)");
        int day = scanner.nextInt();
        if (day <= 0)             
        System.out.println("Введите количество шагов (строго больше нуля):");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("введено отрицательное число. программа завершена");
            return;
        }
        
        monthToData[month-1].days[day-1] = steps;
    }
    

}
