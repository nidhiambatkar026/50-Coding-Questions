import java.util.Arrays; // Import required for Arrays.sort() and Arrays.equals()

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length() == str2.length()){
            char charaArray1[] = str1.toCharArray();
            char charaArray2[] = str2.toCharArray();

            Arrays.sort(charaArray1);
            Arrays.sort(charaArray2);

            boolean result = Arrays.equals(charaArray1, charaArray2);
            if(result){
                 System.out.println(str1+ " and " +str2+ " are Anagrams");
            }
            else{
                System.out.println(str1+ " and " +str2+ " are not Anagrams");
            }
        }
        else{
            System.out.println(str1+ " and " +str2+ " are not Anagrams");
        }
    }
}
