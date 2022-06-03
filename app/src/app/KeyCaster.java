/*
 * PragmaticKey 
 * @author Alex Tumiri
 */
package app;

import org.jnativehook.keyboard.NativeKeyEvent;

public final class KeyCaster{
    /**
     * variable estatica para generar el texto obtenido por teclado
     */
    private static String show_text = "";

    /**
     * Subrutina para limitar el numero de letras que se muestran en la pantalla.
     * @param text
     * @return el texto formado de la palabra que se muestra.
     */
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
    
    /**
     * Subrutina para dar simbolos a los caracteres que no tiene simbolos
     * @param event
     * @return el texto con los simbolos configurados
     */
    public static String keySymbol(NativeKeyEvent event){
//          System.out.println(event.getKeyCode());
        switch(event.getKeyCode()){
            case 14:
                show_text += "[<=]";
                break;
            case 15:
                show_text += "[tab]";
                break;
            case 28:
                show_text += "[«-I]";
                break;
            case 58:
                show_text += "[caps]";
                break;
            case 12:
                show_text += "-";
                break;
            case 13:
                show_text += "=";
                break;
            case 26:
                show_text += getLastSymbol(show_text, "[");
                break;
            case 27:
                show_text += getLastSymbol(show_text, "]");
                break;
            case 39:
                show_text += ";";
                break;
            case 40:
                show_text += getLastSymbol(show_text, "'");
                break;
            case 42:
                show_text += "[î]";
                break;
            case 3638:
                show_text += "[î]";
                break;
            case 3639:
                show_text += "[shot]";
                break;
            case 29:
                show_text += "[ctrl]";
                break;
            case 1: 
                show_text += "[esc]";
                break;
            case 56:
                show_text += "[alt]";
                break;
            case 57:
                show_text += "[-]";
                break;
            case 3657:
                show_text += "[up]";
                break;
            case 3665:
                show_text += "[down]";
                break;                                                               
            case 3663:
                show_text += "[end]";
                break;    
            case 3655:
                show_text += "[home]";
                break;
            case 57419:
                show_text += "[<]";
                break;
            case 57416:
              show_text += "[^]";
                break;                                                               
            case 57421:
                show_text += "[>]";
                break;    
            case 57424:
                show_text += "[v]";
                break;
            case 3667:
                show_text += "[del]";
                break;
            case 59:
                show_text += "[F1]";
                break;
            case 60:
                show_text += "[F2]";
                break;
            case 61:
                show_text += "[F3]";
                break;
            case 62:
                show_text += "[F4]";
                break;                
            case 43:
                show_text += getLastSymbol(show_text, "\\");
                break;
            case 63:
                show_text += "[F5]";
                break;
            case 64:
                show_text += "[F6]";
                break;
            case 65:
                show_text += "[F7]";
                break;
            case 66:
                show_text += "[F8]";
                break;                                
            case 67:
                show_text += "[F9]";
                break;
            case 68:
                show_text += "[F10]";
                break;
            case 87:
                show_text += "[F11]";
                break;
            case 88:
                show_text += "[F12]";
                break;
            case 69:
                show_text += "[bnum]";
                break;
            case 70:
                show_text += "[bloq]";
                break;
            case 3666:
                show_text += "[ins]";
                break;
            case 3675:
                show_text += "[win]";
                break;
            case 41:
                show_text += "`";
                break;
            default:

                
                show_text += NativeKeyEvent.getKeyText(event.getKeyCode()).toLowerCase();
//                show_text += event.getKeyCode();
                resetShowText();
        }
        return show_text;
    }
    
    /**
     * Subrutina para obtener el shift symbol y obtener el simbolos alternos
     * @param text
     * @param symbol
     * @return simbolo alterno
     */
    public static String getLastSymbol(String text, String symbol){
        if(text.length() >= 2){
            String response = String.valueOf(text.charAt(text.length() - 2));
            if(response.equals("î")){
                
                switch(symbol){
                    case "[":
                        return "{";
                    case "]":
                        return "}";
                    case "'":
                        return String.valueOf('"');
                    case "\\":
                        return String.valueOf('|');
                }
                
            }
        }
        return symbol;
    }
    
    /**
     * Subrutina para resetear el show_text y optimar la app
     */
    public static void resetShowText(){
        String response ="";
        int numberOfLetters = 10;
        if(show_text.length() > numberOfLetters){
            for (int i = (show_text.length()-numberOfLetters); i < show_text.length(); i++) {
                response += String.valueOf(show_text.charAt(i));
            }
            show_text = response;
        }
    }
    
}
