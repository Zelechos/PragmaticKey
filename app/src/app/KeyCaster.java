/*
 * PragmaticKey 
 * @author Alex Tumiri
 */
package app;

public final class KeyCaster{

    public static String cuttingText(String text){
        String response;
        int numberOfLetters = 6;
        if(text.length() > numberOfLetters){
            response = "";
            for (int i = (text.length()-numberOfLetters); i < text.length(); i++) {
                response += String.valueOf(text.charAt(i));
            }
            text = response;
            return text;
        } else {
            return text;
        }
    }
    
    
}
