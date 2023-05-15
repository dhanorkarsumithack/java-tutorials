package Testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LoginTest {
    
    @Test
    public void testBothCorrect() {
        String username = "user";
        String password = "password";
        
        Login login = new Login();
        boolean isLoggedIn = login.authenticate(username, password);
        
        Assert.assertTrue("Login successful", isLoggedIn);
    }
    
    @Test
    public void testBothWrong() {
        String username = "wrong_user";
        String password = "wrong_password";
        
        Login login = new Login();
        boolean isLoggedIn = login.authenticate(username, password);
        
        Assert.assertFalse("Login failed", isLoggedIn);
    }
    
    @Test
    public void testUsernameCorrectPasswordWrong() {
        String username = "user";
        String password = "wrong_password";
        
        Login login = new Login();
        boolean isLoggedIn = login.authenticate(username, password);
        
        Assert.assertFalse("Login failed", isLoggedIn);
    }
    
    @Test
    public void testUsernameWrongPasswordCorrect() {
        String username = "wrong_user";
        String password = "password";
        
        Login login = new Login();
        boolean isLoggedIn = login.authenticate(username, password);
        
        Assert.assertFalse("Login failed", isLoggedIn);
    }
}
