
public class Task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;
        String c = "Wow!";
        String d = "Wow!";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        // This is to check the values of b1, b2, and b3 --start
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        // --end
        
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
        
    }
}