public class StepTracker {
    public int stepsGoal = 10000;

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
       int[] stepsPerDay = new int[30];
    }


}
