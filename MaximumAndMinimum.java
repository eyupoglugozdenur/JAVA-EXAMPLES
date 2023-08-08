//This application prints the maximum and minimum of the values entered by the user as array elements on the screen

import java.util.Scanner; //It is imported for the method to be used according to the type of input

public class MaximumAndMinimum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array: ");
        int arrayLength = scanner.nextInt(); //Because the value that the user will enter are integer, nextInt() is used

        int[] array = new int[arrayLength]; //It is created an array

        //For loop is used to assign values to the elements of the array
        for(int i=0;i<=(arrayLength-1);i++){

            boolean validInput = false;

            while (!validInput) {

                System.out.println("Enter " + (i + 1) + ". element of array:");

                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Please only enter an integer!"); // It alerts the user when an invalid value is entered
                    scanner.next(); //It prevents infinite loop
                }
            }
        }

        int max = array[0]; //Assume that max value
        int min = array[0]; //Assume that min value

        //For loop is used to compare the elements of the array with each other
        for(int j=0;j<(arrayLength-1);j++){
            if(array[j+1]>max){
                max = array[j+1];
            }
            if(array[j+1]<min){
                min = array[j+1];
            }
        }

        //The maximum and minimum values of the array are printed on the screen
        System.out.println("Maximum element of array: " + max);
        System.out.println("Minimum element of array: " + min);
    }
}