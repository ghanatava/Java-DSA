public class plainindromes {
    public static void main(String[] args) {
        String str1 = "ashura";
        System.out.println(plainindrome(str1));
    }
    static boolean plainindrome(String str){
        str=str.toLowerCase();
        if(str==null || str.length()==0){
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
