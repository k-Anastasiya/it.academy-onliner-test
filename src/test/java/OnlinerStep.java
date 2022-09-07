import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerStep extends OnlinerObject{

    public OnlinerStep( WebDriver driver) {
        super(driver);
    }



    public void selectProducer(){
        findButtonCatolog().click();
        findBurronElectronical().click();
        findButtonTvAndVideo().click();
        findButtonTelevision().click();
        findFilterProducer();
        findSelectLGLocator().click();


}



}
