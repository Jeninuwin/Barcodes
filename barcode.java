import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;

class barcode {
    /**
     * This will check if the barcode is valid or not
     * @param values
     * @param num
     */
    static void check(int values, int [] num){
        int digit = 10 - (values % 10); //this will condense the value to have it be checked

        for(int i = 0; i < 1; i++){
            if(digit == num[11] ){
                System.out.println("This is a valid barcode. \n\n");
            }
            else{
                System.out.println("This is not a valid barcode. \n\n");
            }
        }
    }
    /**
     * This will add the odd elements in the array together
     * @param num
     * @return
     */
    static int oddPosition(int [] num){
        int total = 0; 

        for(int i = 0; i < num.length; i++){
            total = (num[1] + num[3] + num[5] + num[7] + num[9]);
            //System.out.println(sum[i]);
        }
        return total;
    }
    /**
     * This will add the even elements together and multiply the sum of all of them by 3
     * @param num
     * @return
     */
    static int evenPosition(int [] num){
        int sum = 0; 
        
        for(int i = 0; i < num.length; i++){
            sum = (num[0] + num[2] + num[4] + num[6] + num[8] + num[10])*3;
            //System.out.println(sum[i]);
        }
       
        return sum;
    }
    // static public void yes(){
    //     int [] barcode = new int[12];
    //     Scanner bar = new Scanner(System.in);
        
    //     System.out.println("Enter the 12 digits of a barcode separated by spaces\n");
    //     for(int i = 0; i < barcode.length; i++){
    //         barcode[i] = bar.nextInt();
    //     }
        

    //     int v1 = evenPosition(barcode);
    //     System.out.println("This is odd " + v1);
    //     int v2 = oddPosition(barcode);
    //     System.out.println("This is even " + v2);
    //     int v3 = v1 + v2; 
    //     check(v3, barcode);

    //     bar.close();
    // }
    // Driver code 
    public static void main (String[] args){
        int [] barcode = new int[12];   //sets a range of only 12 elements allowed
        Scanner bar = new Scanner(System.in);
        
        //asks the user for the 12 digits and takes it in the barcode array
        System.out.println("Enter the 12 digits of a barcode separated by spaces\n");
        for(int i = 0; i < barcode.length; i++){
            barcode[i] = bar.nextInt();
        }
        

        int v1 = evenPosition(barcode); //takes the even sum to v1 
        System.out.println("This is odd " + v1);
        int v2 = oddPosition(barcode);//takes the odd sum to v1 
        System.out.println("This is even " + v2);
        int v3 = v1 + v2; //adds the odd and even together
        System.out.println("Values added together: " + v3); 
        check(v3, barcode); //checks if the barcode is valid finally


       
    }
    
}