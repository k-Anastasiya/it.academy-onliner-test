import org.openqa.selenium.WebDriver;

public class OnlinerStep extends OnlinerObject {

  public OnlinerStep(WebDriver driver) {
    super(driver);
  }

  public void selectProducer() {
    findButtonCatolog().click();
    findButtonElectronical().click();
    findButtonTvAndVideo().click();
    findButtonTelevision().click();
    findSelectLGLocator().click();
  }
}
