public class Arrays {
    public static void main(String[] args) {
        //Part2
        //Declare and Initialize
        double[] doubleArray = new double[5];
        //Assign values
        doubleArray[0] = 1.0;
        doubleArray[1] = 2.5;
        doubleArray[2] = 4.7;
        doubleArray[3] = 8.2;
        doubleArray[4] = 59.0;
        //Print values
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }

        //Part3
        //Create an array of 5 integers
        int[] intArray = new int[5];
        //Initialize the array with values
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        //Update the third element to a new value
        intArray[2] = 8;
        //Print all elements of the array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //Part4
        //Create an array of 10 integers
        int[] intArray2 = new int[10];
        //Fill the array with multiples of 3
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = (i + 1) * 3;
        }
        //Print the length of the array and all its elements
        System.out.println("The length of the array is: " + intArray2.length);
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
