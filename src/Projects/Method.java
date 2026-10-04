package Projects;

public class Method {

        public double toc(double temp) {

            temp = ((temp - 32) * 5.0 / 9.0);


            return temp;
        }

        public double tof(double temp) {

            temp = ((temp * 9.0) / 5.0) + 32;

            return temp;
        }
    }


