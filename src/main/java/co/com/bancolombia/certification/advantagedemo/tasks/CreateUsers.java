package co.com.bancolombia.certification.advantagedemo.tasks;

import co.com.bancolombia.certification.advantagedemo.interactions.Waiting;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage;
import co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.CreateUserPage.*;

public class CreateUsers implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Waiting.theSeconds(ICN_MENU_USER, 10),
            WaitUntil.the(ICN_MENU_USER, isVisible()).forNoMoreThan(15).seconds(),
            Click.on(ICN_MENU_USER),
            WaitUntil.the(LBL_CREATE_NEW_ACCOUNT, isVisible()).forNoMoreThan(15).seconds(),
            Click.on(LBL_CREATE_NEW_ACCOUNT),
            WaitUntil.the(TXT_USER_NAME, isVisible()).forNoMoreThan(15).seconds(),
            Enter.theValue("Dante91284").into(TXT_USER_NAME),
            Enter.theValue("dante91284@gmail.com").into(TXT_USER_MAIL),
            Enter.theValue("lkjasd@A21").into(TXT_USER_PASSWORD),
            Enter.theValue("lkjasd@A21").into(TXT_USER_CONFIRMATION_PASSWORD),
            Enter.theValue("Libardo").into(TXT_FIRST_NAME),
            Enter.theValue("Alvarez").into(TXT_LAST_NAME),
//                Enter.theValue("39287632").into(TXT_PHONE_NUMBER),
            Enter.theValue("Medellin").into(TXT_CITY),
            Enter.theValue("Cll 68 # 41D20").into(TXT_ADDRESS),
            Enter.theValue("Antioquia").into(TXT_STATE),
            Enter.theValue("12345").into(TXT_POSTAL_CODE),
            Click.on(CHK_AGREE),
            Click.on(BTN_REGISTER)
    );
  }

  public static CreateUsers createUsers() {

    return instrumented(CreateUsers.class);
  }
}
