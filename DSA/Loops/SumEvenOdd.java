import java.util.*;

public class SumEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(number % 2 == 0){
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("Doyou want to Conlinue?press 1 for yes or 0 for number");
            choice = sc.nextInt();
        } while(choice == 1);
        System.out.println("sum of even number:" +evenSum);
        System.out.println("sum of odd number:" +oddSum);
        
    }
}