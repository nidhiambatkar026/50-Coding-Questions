public class VowelsConstant {
    public static void main(String[] args) {
        String str = "Nidhi Ambatkar";
        int vowels =0, constants = 0;
        for(int i=0; i<str.length(); ++i){
            int ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ++vowels;
            }else if(ch >='a' && ch <='z'){
                ++constants;
            }
        }
        System.out.println("No of Vowels = "+ vowels);
        System.out.println("No of Constants: "+constants);
    }
}

