/*
 * PragmaticKey 
 * @author Alex Tumiri
 */
package app;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class KeyCaster{
    
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
    public static String keySymbol(KeyEvent event){
        System.out.println(event.getKeyCode());
        switch(event.getKeyCode()){
            case 8:
                show_text += "[<=]";
                break;
            case 10:
                show_text += "[«-I]";
                break;
            case 12:
                show_text += "[npgn]";
                break;
            case 16:
                show_text += "[î]";
                break;
            case 17:
                show_text += "[ctrl]";
                break;
            case 18:
                show_text += "[alt]";
                break;
            case 19:
                show_text += "[pau]";
                break;
            case 20:
                show_text += "[caps]";
                break;
            case 27:
                show_text += "[esc]";
                break;
            case 32:
                show_text += "[-]";
                break;
            case 33:
                show_text += "[up]";
                break;
            case 34:
                show_text += "[down]";
                break;                                                               
            case 35:
                show_text += "[end]";
                break;    
            case 36:
                show_text += "[home]";
                break;
            case 37:
                show_text += "[<]";
                break;
            case 38:
                show_text += "[^]";
                break;                                                               
            case 39:
                show_text += "[>]";
                break;    
            case 40:
                show_text += "[v]";
                break;
            case 127:
                show_text += "[del]";
                break;
            case 112:
                show_text += "[F1]";
                break;
            case 113:
                show_text += "[F2]";
                break;
            case 114:
                show_text += "[F3]";
                break;
            case 115:
                show_text += "[F4]";
                break;                
            case 116:
                show_text += "[F5]";
                break;
            case 117:
                show_text += "[F6]";
                break;
            case 118:
                show_text += "[F7]";
                break;
            case 119:
                show_text += "[F8]";
                break;                                
            case 120:
                show_text += "[F9]";
                break;
            case 121:
                show_text += "[F10]";
                break;
            case 122:
                show_text += "[F11]";
                break;
            case 123:
                show_text += "[F12]";
                break;
            case 144:
                show_text += "[bnum]";
                break;
            case 145:
                show_text += "[bloq]";
                break;
            case 155:
                show_text += "[ins]";
                break;
            case 524:
                show_text += "[win]";
                break;
            default:
                show_text += event.getKeyChar();
        }
        return show_text;
    }
    
    
}
