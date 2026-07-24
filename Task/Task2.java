package Task;

public class Task2 {
    public static void main(String[] args) {
        //primitive data types
        String task2 = "H3110 w0r1d 2.0 true";
        
        char c = 'H';
        short s = 31;
        byte b = 10;
        //insert w in sout
        int i = 0;
        //insert r in sout
        //get short s - 30 = 1
        //insert d in sout
        float f = 2.0f;
        boolean bol = true;

        //This is not included as mentioned in the task2, but I added it to show the other primitive data types
        long l = 10000L; //gc
        double d = 2.0d; //gc

        //The output of the program should be: H3110 w0r1d 2.0 true
        //to use char c = 'H', insert string in front; 
         
        System.out.println("" + c + s + b + " " + "w" + i + "r" + (s-30) + "d" + " " + f + " " + bol);
        System.out.println("Check output based on requirements: " + task2);


    }
}
