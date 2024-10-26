public class Pattern{
 public static void hollow_rectangle(int toRows, int toCols){
    //outer loop
    for(int i = 1; i <= toRows; i++){
        //inner  - columns
        for(int  j=1; j<= toCols; j++) {
            //cell -(i, j)
          if(i == 1 || i == toRows || j == 1 || j == toCols) {
            //boundary cells
            System.out.print("*");
          } else{
            System.out.print(" ");
          }
        }
        System.out.println();
    }

 }

    public static void main(String args[]){
        hollow_rectangle(4, 5);

    }
}