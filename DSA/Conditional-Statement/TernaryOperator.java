public class TernaryOperator{
    public static void main(String[] args){
        int  number = 20;
        String type = ((number % 2)== 0)?"even" : "Odd";
        System.out.println(type);                       
    }
}