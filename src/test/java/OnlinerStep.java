import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class OnlinerStep extends OnlinerObject {

  public OnlinerStep(WebDriver driver) {
    super(driver);
  }

  public List <String> selectProducer() {
    findButtonCatolog().click();
    findButtonElectronical().click();
    findButtonTvAndVideo().click();
    findButtonTelevision().click();
    findPopUpButton().click();
    findSelectLGLocator().click();
   return Collections.singletonList(findElementOfFilter().getText());
  }
}
