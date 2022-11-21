package co.com.bancolombia.certification.advantagedemo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target ICN_MENU_USER = Target.the("Get user menu").located(By.id("menuUserLink"));
    public static final Target LBL_CREATE_NEW_ACCOUNT =Target.the("Create new account").located(By.cssSelector("a.create-new-account.ng-scope"));

    public static final Target TXT_USER_NAME_HOME = Target.the("User Name").located(By.name("username"));
    public static final Target TXT_USER_PASS = Target.the("User Password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.id("sign_in_btnundefined"));
}
