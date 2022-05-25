/*
 * PragmaticKey 
 * @author Alex Tumiri
 */
package app;

import views.View;

public class App {
    
    public static void main(String[] args) {
        App.openView();
    }
    
    public static void openView(){
        View window = new View();
        window.setVisible(true);
    }

   
}
