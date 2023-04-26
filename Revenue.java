public class Revenue {
    public static void main(String[] args) {
        
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        
        double sum = 0.0;

        for (int i = 0; i < revenue.length; i++) {
            sum += revenue[i];
        }
        
        double average = sum / revenue.length;
        System.out.println(average);
       
    }
}

/*
The given code declares an array that holds the monthly revenues for a company for a year.
You need to calculate the average monthly revenue for the year.
For that, calculate the sum of the revenue for all the months and divide it by the number of items in the array.
*/
