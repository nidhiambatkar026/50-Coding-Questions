public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        String reversed = sb.toString();

        if(str.equals(reversed)){
            System.out.println(str+ " is a Palindrome String");
        }
        else{
            System.out.println(str+ " is a Palindrome String");
        }
    }
}
