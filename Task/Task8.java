package Task;

public class Task8 {
    public static void main(String[] args) {
        //Call the method with sample inputs
        int total = sumOfSums(4, 5, 10);
        System.out.println("Total sum: " + total);
    }

    //Method must use varargs syntax
    public static int sumOfSums(int... numbers) {
        int cumulativeSum = 0;

        // Loop through each parameter
        for (int n : numbers) {
            int triangularSum = 0;
            
            //Compute the triangular sum (1 through n)
            for (int i = 1; i <= n; i++) {
                triangularSum += i;
            }
            
            //Track the running cumulative sum
            cumulativeSum += triangularSum;
            
            //Print each parameter's individual sum and running cumulative total
            System.out.println("Parameter " + n + ": sum = " + triangularSum + ", cumulative sum = " + cumulativeSum);
        }

        //Return the final total
        return cumulativeSum;
    }
}
