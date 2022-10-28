public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            char ch = (char)('a'+1);
            builder.append(ch); 
        }
        System.out.println(builder.toString());   //mutable This stringbuilder can be modified;
                                                 // builder offers many inbuilt functions
        builder.reverse();
    }
}
