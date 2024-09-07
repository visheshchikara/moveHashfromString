import java.util.*;

class hashExtract {
    public static void movehash(String str, int l){
        // Using StringBuilder for efficient string manipulation
        StringBuilder str1 = new StringBuilder(); // To store '#'
        StringBuilder str2 = new StringBuilder(); // To store other characters
        
        for(int i = 0; i < l; i++){
            if(str.charAt(i) == '#'){
                str1.append('#'); // Append '#' to str1
            } else {
                str2.append(str.charAt(i)); // Append other characters to str2
            }
        }
        
        // Combine str1 and str2
        System.out.println(str1.toString() + str2.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        movehash(str, str.length());
    }
}
