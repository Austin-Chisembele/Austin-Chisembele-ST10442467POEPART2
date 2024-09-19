/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package activtity.registrations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    private final Login login;
   
    
    public LoginTest() {
        this.login = new Login( "Austin ", "Chisembele", "kyl_1", "Ch&&sec@ke99!");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");

        
        String user = "kyl_1";  
        Login instance = new Login("Austin ", "Chisembele", "kyl_1", "Ch&&sec@ke99!");  
        boolean expResult = true;  

        
        boolean result = instance.checkUserName(user);

        
        assertEquals(expResult, result);
        
  
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");

        
        String password = "Ch&&sec@ke99!";  
        Login instance = new Login("Austin ", "Chisembele", "kyl_1", "Ch&&sec@ke99!"); 
        boolean expResult = true;  

      
        boolean result = instance.checkPasswordComplexity(password);

        
        assertEquals(expResult, result);
        
        
    }
    
     /**
     * Test:(assertEquals) and Test(assertTrue/false).
     */
    @Test
    public void testCheckUserNameCorrectFormat() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testCheckUserNameIncorrectFormat() {
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testCheckPasswordComplexityCorrect() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testCheckPasswordComplexityIncorrect() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testRegisterUserCorrect() {
        System.out.println("testRegisterUserCorrect");
        
        String user = "kyl_1"; 
        System.out.println(user);
        
         System.out.println("Welcome Austin, Chisembele it is great to see you." );
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expResult = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testRegisterUserIncorrectUsername() {
        
      
           String user = "kyl!!!!!";  
         String password = "Ch&&sec@ke99!";
         System.out.println(user);
         System.out.println(password);
       
         System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length." );
       
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expectedMessage, result);
    }

    @Test
public void testRegisterUserIncorrectPassword() {
      
         String user = "kyl_1";  
         String password = "wrongPassword";
         
       System.out.println(user);
         System.out.println(password);
         System.out.println("Please ensure that the password is at least 8 characters long, contains a capital letter, a number, and a special character. The password is not formatted correctly." );
       
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expectedMessage, result);
}

    @Test
    public void testLoginUserSuccess() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginUserFailure() {
        login.registerUser("kyl_1", "wrongPassword", "Austin", "Chisembele");
        assertFalse(login.loginUser("kyl_1", "wrongPassword"));
    }
    
    
    @Test
    public void testReturnLoginStatusSuccess() {
        
        String user = "kyl_1";  
         String password = "Ch&&sec@ke99!";
         
         System.out.println(user);
         System.out.println(password);
         
         System.out.println("Welcome Austin, Chisembele it is great to see you again." );
         System.out.println("Login successful");
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expectedMessage, result);
    }

    @Test
    public void testReturnLoginStatusFailure() {
      
        String user = "kyl_1";  
         String password = "wrongPassword";
       
         System.out.println(user);
         System.out.println(password);
         System.out.println("Username or password incorrect, please try again" );
         System.out.println("Login Failed");
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expectedMessage, result);
    }

    /**
     * Test of loginUser method, of class Login.
     */
     @Test
    public void testLoginUser() {
    

   
        String user = "kyl_1";  
        String password = "Ch&&sec@ke99!"; 
        Login instance = new Login("Austin ", "Chisembele", "kyl_1", "Ch&&sec@ke99!"); 
        
        
        instance.registerUser(user, password, "Austin", "Chisembele");

        
        boolean expResult = true;  

       
        boolean result = instance.loginUser(user, password);

        
        assertEquals(expResult, result);

        
    }
    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        
         String user = "kyl_1";  
         String password = "Ch&&sec@ke99!";
         
         System.out.println(user);
         System.out.println(password);
       System.out.println("Username has been successfully recorded. ");
       System.out.println("Password was successfully obtained. ");
         System.out.println("Welcome Austin, Chisembele it is great to see you again." );
         System.out.println("Login Successful");
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expectedMessage, result);
       
    }

   

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUserSuccess() {
          String user = "kyl_1";  
         String password = "Ch&&sec@ke99!";
         
         System.out.println(user);
         System.out.println(password);
       System.out.println("Username has been successfully recorded. ");
       System.out.println("Password was successfully obtained. ");
         System.out.println("Welcome Austin, Chisembele it is great to see you again." );
          System.out.println("==========================================================");
         System.out.println("Login Successful");
        Login instance = new Login("kyl_1", "Ch&&sec@ke99!", "Austin", "Chisembele"); 
        boolean expectedMessage = true;  
        
        boolean result = instance.checkUserName(user);
        assertEquals(expectedMessage, result);
    }

  
       
    }

   