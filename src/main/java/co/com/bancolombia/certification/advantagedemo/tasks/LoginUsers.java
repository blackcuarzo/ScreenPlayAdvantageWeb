package co.com.bancolombia.certification.advantagedemo.tasks;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;

import static co.com.bancolombia.certification.advantagedemo.utils.Constants.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUsers implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(ICN_MENU_USER, isClickable()).forNoMoreThan(10).seconds(),
            Click.on(ICN_MENU_USER),
            Enter.theValue(USER_NAME).into(TXT_USER_NAME_HOME),
            Enter.theValue(USER_PASSWORD).into(TXT_USER_PASS),
            Evaluate.javascript("arguments[0].click();",BTN_LOGIN.resolveFor(actor))
            );
  }

  public static LoginUsers loginUsers() {
    return instrumented(LoginUsers.class);
  }
}
