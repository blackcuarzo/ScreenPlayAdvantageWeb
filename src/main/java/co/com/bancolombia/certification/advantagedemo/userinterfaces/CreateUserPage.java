package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {
    public static final Target TXT_USER_NAME = Target.the("Name of the user").located(By.name("usernameRegisterPage"));
    public static final Target TXT_USER_MAIL = Target.the("Email of the user").located(By.name("emailRegisterPage"));
    public static final Target TXT_USER_PASSWORD = Target.the("Password of the user").located(By.name("passwordRegisterPage"));
    public static final Target TXT_USER_CONFIRMATION_PASSWORD = Target.the("Password confirmation of the user").located(By.name("confirm_passwordRegisterPage"));
    public static final Target TXT_FIRST_NAME = Target.the("First name of the user").located(By.name("first_nameRegisterPage"));
    public static final Target TXT_LAST_NAME = Target.the("Last name of the user").located(By.name("last_nameRegisterPage"));
    public static final Target TXT_PHONE_NUMBER = Target.the("User phone number").located(By.name("phone_numberRegister"));
    public static final Target LST_COUNTRY = Target.the("Country of recidence").located(By.name("country_ListboxRegisterPage"));
    public static final Target TXT_CITY= Target.the("City of residence").located(By.name("cityRegisterPage"));
    public static final Target TXT_ADDRESS= Target.the("Home Address").located(By.name("addressRegisterPage"));
    public static final Target TXT_STATE= Target.the("State of residence").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target TXT_POSTAL_CODE= Target.the("Home postal code").located(By.name("postal_codeRegisterPage"));
    public static final Target CHK_AGREE = Target.the("Agree terms and conditions").located(By.name("i_agree"));
    public static final Target BTN_REGISTER = Target.the("Registers user").located(By.id("register_btnundefined"));
}
