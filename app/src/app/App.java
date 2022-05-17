/*
 * PragmaticKey 
 * @author Alex Tumiri
 */
package app;

import views.view;

public class App {
    
    public static void main(String[] args) {
        App.openView();
    }
    
    public static void openView(){
        view window = new view();
        window.setVisible(true);
    }
    
    
}
