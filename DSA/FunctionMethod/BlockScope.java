public class BlockScope{
    public static void main(String args[]){
        int p = 10;
        {
            int s = 45;
            System.out.println(s);
        }
        System.out.println(p);
    }
}