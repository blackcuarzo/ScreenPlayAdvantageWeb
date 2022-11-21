package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderPaymentPage {
  public static Target BTN_NEXT = Target.the("Next label").located(By.id("next_btn"));
  public static Target RTB_MASTER_CARD = Target.the("Master Card").located(By.name("masterCredit"));
  public static Target TXT_CREDIT_CARD_NUMBER = Target.the("Credit card number").located(By.id("creditCard"));
  public static Target TXT_CVV_NUMBER = Target.the("CVV number").located(By.name("cvv_number"));
  public static Target LST_MONTH = Target.the("Expire month date").located(By.name("mmListbox"));
  public static Target LST_YEAR = Target.the("Expire month year").located(By.name("yyyyListbox"));
  public static Target TXT_CARD_HOLDER_NAME = Target.the("Card holder name").located(By.name("cardholder_name"));
  public static Target BTN_PAY = Target.the("Pay button").located(By.id("pay_now_btn_ManualPayment"));


}
