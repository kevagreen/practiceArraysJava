import java.util.Arrays;

public class PowerArray {
    //global variables
   public static double[] numberArr = {1,5,7,9,10};
    public static double sumNumbers = 0;

    public static void main(String[] args) {
        powerArray();
        maxArray();
        toPower(4, 2);
    }

    //sum numbers in an array
    public static double powerArray() {
        for (double number : numberArr) {
           sumNumbers += number;
        }
        System.out.println("The sum of the array: " + sumNumbers);
        return sumNumbers;
    }

    //output index of max number in an array
    public static double maxArray(){
        double[] exampleArray = {1,5,6,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for( int i = 1; i < exampleArray.length; i++ ){
            if(exampleArray[i] > maximum){
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println("The maximum number is at index " + index);
        return index;
    }
    //Get size of an array and value of each element raised to a power, both size and power passed in as arguments
    public static int[] toPower(int size, int power){
        int[] powerArr = new int[size];
        for(int i = 0; i < powerArr.length-1; i++){
            powerArr[i] = (int) Math.pow(i, power);
        }
        System.out.println("You're array: " + Arrays.toString(powerArr).replace("[","").replace("]",""));
        return powerArr;
    }
}//end class
