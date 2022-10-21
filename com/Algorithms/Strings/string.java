

public class string {
    public static void main(String[] args) {
        String s = "Kunal";
        System.out.println(s);
        s="kushwaha"; //new object created;
        System.out.println(s);
        //comparison of strings == and .equals
        String a = "Vashu";
        String b= "Vashu";
        System.out.println(a==b);//a==b checks if the ref. variable points to the same object
        String c = new String("Ashura");
        String d = new String("Ashura"); //two different objects are created
        System.out.println(c==d);
        //to compare only by the value use .= method
        System.out.println(c.equals(d));

    }
}
