/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author neliloghmani
 */
public class Quiz2 {

    /**
     */
    public static String username = "nl2027";
    public static String password = "hello";
    public static String incorrectUsername;
    public static String incorrectPassword;
           
    

    
    public static boolean login()
    {
        boolean login = false;
        if (incorrectUsername.equalsIgnoreCase(username)){
            incorrectPassword = JOptionPane.showInputDialog("Please Enter Your Password"); // allows user input
        
            if (incorrectPassword.equals(password)) // if the password enters the string password
               {
                  JOptionPane.showMessageDialog(null, "Welcome  : " + username); // displays a message
                  login = true; // then the Option Pane should welcome you              
               }
                 else 
                     {
                       JOptionPane.showMessageDialog(null, "Wrong Password");
                     }
          }
           else
        {
            login = false; // Password = incorrectPassword
            JOptionPane.showMessageDialog(null, "Wrong Username"); /// displays message
        }
        
        return login; // if its false the option pane will say wrong username 
                       // if its right the option pane will say Welcome..
    }
    public static void main(String[] args) {
       
      incorrectUsername = JOptionPane.showInputDialog("Please enter username");
       login(); // inserts method
    } 
}
