
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] arr){
        // iterating over the rows in the 2D array (each element)
        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("");
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] x){
        int total = 0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                total += x[i][j];
            }
        }
        return total;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] y){
        double avg = sum(y)/ (double) (y.length*y.length);
        return Math.round(avg * 100.0)/100.0;
    }
    

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] x){
        int lowest = x[0][0];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                if (x[i][j] < lowest){
                    lowest = x[i][j];
                }
            }
        }
        return lowest;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] x){
        int highest = x[0][0];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                if (x[i][j] > highest){
                    highest = x[i][j];
                }
            }
        }
        return highest;
    }


    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] x){
        int count = 0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                if (x[i][j] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] x){
        int count = 0;
        for (int[] row : x){ //since they are 2d arrays u need two enhanced for loops to get to the specific element
            for (int y : row){
                if (y % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] x){
        boolean pos = true;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++){
                if (x[i][j] < 0){
                    pos = false;
                }
            }
        }
        return pos;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] x){
        int[] newArray = new int[x.length];
        int sum;
        for (int i = 0; i < x.length; i++){
            sum = 0;
            for (int j = 0; j < x[i].length; j++){
                sum += x[i][j];
            }
            newArray[i] = sum;
        }
        return newArray;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] x){
        int[] newArray = new int[x[0].length]; // assuming that its a square (same num of rows and columns)
        int sum;
        for (int i = 0; i < x[0].length; i++){
            sum = 0;
            for (int j = 0; j < x.length; j++){
                sum += x[j][i];
            }
            newArray[i] = sum;
        }
        
        return newArray;
    }
}
