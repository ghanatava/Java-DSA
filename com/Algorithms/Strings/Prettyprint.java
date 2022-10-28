public class Prettyprint {
    public static void main(String[] args) {
        float a= 453.1234f;
        System.out.printf("formatted number id %.2f",a);
        System.out.println();
        System.out.printf("PI :%.3f",Math.PI);
        System.out.println();
        System.out.printf("my name is chikka chikka %s %s", "Slim" , "Shady");
    }
}
/*
 %c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number       #placeholders for string formating
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */