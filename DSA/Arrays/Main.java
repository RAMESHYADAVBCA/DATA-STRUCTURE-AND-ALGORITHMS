public class Main{
    public static void main(String[] args){
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Ramesh Yadav";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 25;
        int rno3 = 55;
        int rno4 = 78;
        int rno5 = 80;

        //syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        // int[] rnos = new int[5];
        // //or directly
        // int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialisation: actually here object is being created in the memory(heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);



    }
}