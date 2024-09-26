public class PRange{
    public static void primesInRange(int n){
        for(int i = 2; i<= 20; i++){
            if(isprime(i) == 1){
           System.out.print(i + " ");  

            }
        }
        System.out.println();
       
    }
    public static void main(String[] args){
     primesInRange(20);// 2 to 20
    }
}