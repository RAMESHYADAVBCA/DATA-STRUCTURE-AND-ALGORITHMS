public class OverloadingDataType{
    // func to cal int sum
    public static int sum(int a, int b){
        return a + b;
    }

    //fun to cal float sum
    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 1.4f));
    }
}