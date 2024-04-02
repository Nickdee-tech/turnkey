public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {

    int total = 0;

    for (int num : numbers) {

    total += num;

    }

    double average = total / numbers.length;

    return average;

    }
    
    public static void main(String[] args) {

    int[] data = {5, 10, 15, 20, 25};

    double result = calculateAverage(data);

    System.out.println("The average is: " + result);
    
    }
    }

    // The "AverageCalculator" class and "calculateAverage" method seem fine for calculating the average of an array of integers. 
    // However, there's a potential issue with the calculation of the average due to integer division, which may result in loss of precision. 
    // To fix this, we convert "total" or "numbers.length" to a double before performing the division.
    // Below is the corrected code

    /*public class AverageCalculator {
        public static double calculateAverage(int[] numbers) {
            int total = 0;
            for (int num : numbers) {
                total += num;
            }
            double average = (double) total / numbers.length; // Convert one operand to double
            return average;
        }
    
        public static void main(String[] args) {
            int[] data = {5, 10, 15, 20, 25};
            double result = calculateAverage(data);
            System.out.println("The average is: " + result);
        }
    } */