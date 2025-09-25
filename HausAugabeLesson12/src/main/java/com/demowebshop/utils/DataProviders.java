package com.demowebshop.utils;

import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "validUsers")
    public Object[][] provideValidUsers() {
        return new Object[][]{
                {new User()
                        .setGender(UserData.GENDER)
                        .setFirstName(UserData.FIRSTNAME)
                        .setLastName(UserData.LASTNAME)
                        .setEmail(UserData.EMAIL)
                        .setPassword(UserData.PASSWORD)
                        .setConfirmPassword(UserData.ConfirmPassword)}
        };
    }

    @DataProvider(name = "invalidUsers")
    public Object[][] provideInvalidUsers() {
        return new Object[][]{
                {new User()
                        .setEmail("") // пустой email
                        .setPassword(UserData.PASSWORD)},
                {new User()
                        .setEmail(UserData.EMAIL)
                        .setPassword("")}, // пустой пароль
                {new User()
                        .setEmail("")
                        .setPassword("")} // и email, и пароль пустые
        };
    }
}
