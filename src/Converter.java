public class Converter {
    double stepSize = 0.75;
    int callorieInStep = 50;

    public double distance(int steps) {
            return steps * stepSize / 1000;
        }

        public double consumption(int steps) {
            return steps * callorieInStep / 1000;

        }


}

