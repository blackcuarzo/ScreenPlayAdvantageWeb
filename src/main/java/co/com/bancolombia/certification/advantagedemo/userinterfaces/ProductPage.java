package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
  public static Target TXT_QUANTITY= Target.the("Quantity of products").located(By.name("quantity"));
  public static Target RBT_COLOR= Target.the("Color of products").located(By.id("rabbit")).called("GRAY");
  public static Target BTN_ADD_CART = Target.the("Add product label").located(By.name("save_to_cart"));
  public static Target BTN_CHECK_OUT = Target.the("Checkout label").located(By.id("checkOutPopUp"));
}
