package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application
// new comment added comment IntelliJ comment number 2
public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c2 = new Controller2(model); // Create second controller
        
    } // main
  
} // Main
