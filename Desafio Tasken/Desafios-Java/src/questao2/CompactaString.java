package questao2;

import java.util.Scanner;

public class CompactaString {
    public static void main(String[] args) {

    	Scanner lerString = new Scanner(System.in);
    	
        String str = lerString.nextLine();
        System.out.println(compact(str));
        
        lerString.close();
    }

    public static String compact(String strObj) {
        int count = 1;
        char letter = strObj.charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < strObj.length(); i++) {
            if (strObj.charAt(i) == letter)
                count++;
            else {
                if (count > 1)
                    result.append(letter).append(count);
                else
                    result.append(letter);

                count = 1;
                letter = strObj.charAt(i);
            }
        }
        if (count > 1)
            result.append(letter).append(count);
        else
            result.append(letter);

        return result.toString();
    }

}