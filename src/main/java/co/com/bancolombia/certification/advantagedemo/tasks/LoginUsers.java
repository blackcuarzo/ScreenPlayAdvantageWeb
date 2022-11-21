package co.com.bancolombia.certification.advantagedemo.tasks;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUsers implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
//            WaitUntil.the(ICN_MENU_USER, isVisible()).forNoMoreThan(10).seconds(),
//            Click.on(ICN_MENU_USER),


            );
  }

  public LoginUsers loginUsers() {
    return instrumented(LoginUsers.class);
  }
}
