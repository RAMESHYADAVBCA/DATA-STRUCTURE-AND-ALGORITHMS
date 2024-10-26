public class Floyds_triangle{
    
    public static void floyds_triangle(int n){
        //outer
        int Counter = 1;
        for(int i = 1; i<=n; i++){
          //inner - how many times will counter be printed
          for(int j=1; j<=i; j++){
            System.out.print(Counter+" ");
            Counter++;
          }
          System.out.println();          
        }
    }
    public static void main(String[] args){
     floyds_triangle(5);

    }
}