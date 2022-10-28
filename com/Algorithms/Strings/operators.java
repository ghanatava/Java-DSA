import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');   //converts to ascii value
        System.out.println("a" + "b");   // concatenates
        System.out.println((char)('a'+3)); //print character with resultant ascii value here "d"
        System.out.println("a"+1); //int will be converted to <Integer> that will call toString() and return concatenated string

        System.out.println("Kunal"+new ArrayList<>()); //same as above case
        System.out.println("Kunal"+new int[3]);
       // System.out.println(new Integer(5) + new ArrayList<>()); # +is used for primitives only and atleastone object should be string
       
    }
}
