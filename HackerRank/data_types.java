public class Main
{
    public static void main(String[] args)
    {
        boolean b = true;       // 1 bit

        byte by   = 5;          // 8 bit
        short sh  = 987;        // 16 bit
        int i     = 4532541;    // 32 bit
        long l    = 971564325L; // 64 bit

        char c    = 'A';        // 16 bit

        float f   = 3.6f;       // 32 bit
        double d  = 89.456;     // 64 bit

        String st = "String has no fixed size, Its a reference datatype.";

        System.out.println("Boolean: " + b);
        System.out.println("Byte:    " + by);
        System.out.println("Short:   " + sh);
        System.out.println("Int:     " + i);
        System.out.println("Long:    " + l);
        System.out.println("Char:    " + c);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("String:  " + st);
    }
}