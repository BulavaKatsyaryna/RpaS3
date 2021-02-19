package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LoginServiceTest {

    LoginService loginService;
    User user;

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempt());
    }

    @Test
    public void checkUserPassword_positive() {
        String userImput = "password";

        boolean actualResult = LoginService.checkUserPassword(user, userImput);
        Assert.assertTrue(actualResult);

    }

    @Test
    public void checkUserPassword_negative() {
        String userImput = "wrong";

        boolean actualResult = LoginService.checkUserPassword(user, userImput);
        Assert.assertFalse(actualResult);

    }
    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }


}