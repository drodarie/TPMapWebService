package calculette;

/**
 * Created by Dimitri on 08/09/2015.
 *
 * @version 1.0
 */
public class Calculette {
	/*
	 * Addition
	 */

        public float getAddition(float opera, float operb) {
            return opera + operb;

        }

	/*
	 * Multiplication
	 */

        public float getMultiplication(float opera, float operb) {
            return opera * operb;

        }

        /*
         * Soustraction
         */
        public float getSoustraction(float opera, float operb) {
            return opera - operb;

        }

        /*
         * Division erreur non g�r�e par le web service
         */
        public float getDivision(float opera, float operb) {
            if (operb != 0)
                return opera / operb;
            else
                return 0;
        }

}
