package co.com.bancolombia.certification.advantagedemo.tasks;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.ProductPage.*;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.OrderPaymentPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.advantagedemo.userinterfaces.HomePage.IMG_LAPTOP;
import static co.com.bancolombia.certification.advantagedemo.userinterfaces.LaptopsPage.IMG_ACER_LAPTOP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BuyLaptop implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(IMG_LAPTOP,isClickable()).forNoMoreThan(10).seconds(),
            Click.on(IMG_LAPTOP),
            WaitUntil.the(IMG_ACER_LAPTOP,isClickable()).forNoMoreThan(10).seconds(),
            Click.on(IMG_ACER_LAPTOP),
            WaitUntil.the(RBT_COLOR,isClickable()).forNoMoreThan(10).seconds(),
            Click.on(RBT_COLOR),
            Enter.theValue("4").into(TXT_QUANTITY),
            Click.on(BTN_ADD_CART),
            WaitUntil.the(BTN_CHECK_OUT,isClickable()).forNoMoreThan(10).seconds(),
            Click.on(BTN_CHECK_OUT),
            WaitUntil.the(BTN_NEXT,isClickable()).forNoMoreThan(10).seconds(),
            Click.on(BTN_NEXT),
            Click.on(RTB_MASTER_CARD),
            Enter.theValue("726900838974").into(TXT_CREDIT_CARD_NUMBER),
            Enter.theValue("1431").into(TXT_CVV_NUMBER),
            SelectFromOptions.byVisibleText("05").from(LST_MONTH),
            SelectFromOptions.byVisibleText("2024").from(LST_YEAR),
            Enter.theValue("Dante").into(TXT_CARD_HOLDER_NAME),
            Click.on(BTN_PAY)
            );
  }

  public static BuyLaptop buyLaptop() {
    return instrumented(BuyLaptop.class);
  }
}
