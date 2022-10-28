import java.util.Arrays;

public class string_methods {
    public static void main(String[] args) {
        String name = "Kunal kushawaha";
        System.out.println(Arrays.toString(name.toCharArray())); //chararray
        name.getBytes();
        name.toLowerCase();
        name.toUpperCase();
        name.charAt(0);
        name.indexOf("a");
        //etc
    }
}
