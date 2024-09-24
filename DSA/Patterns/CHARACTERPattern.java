public class CHARACTERPattern{
    public static void main(String[] args){
        int num = 4;
        char ch = 'A';

        //outer loop
        for(int line = 1; line <= num; line++){
            //inner loop
            for(int chars = 1; chars<= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } 
    }
}