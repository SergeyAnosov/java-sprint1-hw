public class Converter {

    public double distance(int steps) {
            double distance = steps * 0.75 / 1000;
            return distance;
        }

        public double consumption(int steps) {
            double consumption = steps * 50 / 1000;
            return consumption;

        }


}

