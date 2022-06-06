import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пришло время практики!");
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.setStepValue();            

            } else if (command == 2) {
                
            } else if (command == 3) {
                
                System.out.println("Текущая цель: " + stepTracker.stepsGoal);
                System.out.println("Введите новую цель по шагам в день:");
                int goal = scanner.nextInt();
                if (goal <= 0) {
                    System.out.println("Цель должна быть положительная");
                } else {
                    stepTracker.changeGoal(goal);
                    System.out.println("Новая цель: " + stepTracker.stepsGoal);
                }
            } else if (command == 4) {
                System.out.println("Программа завершена");
                return;
            } else {
                System.out.println("Такой команды пока нет");
            }

        }

    }


    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}
