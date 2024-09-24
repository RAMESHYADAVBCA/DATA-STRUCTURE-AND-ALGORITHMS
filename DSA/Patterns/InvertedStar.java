public class InvertedStar{
    public static void main(String[] args){
        for(int line = 1; line <= 7; line++){
            for(int star = 7; star>= line; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}