import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerObject {

  WebDriver driver;
  private By catalogButton = By.xpath("//ul[@class='b-main-navigation']/child::li/descendant::span[contains(text(),'Каталог')]");
  private By electronicButton = By.xpath("//li/descendant::span[contains(text(),'Электроника')]");
  private By tvAndVideoButton = By.xpath("//div[contains(text(),'Телевидение')]");
  private By TVButton = By.xpath("//div[contains(text(),'Телевидение')]/..//span[contains(text(),'Телевизоры')]");
   By lgInput = By.xpath("//ul[@class='schema-filter__list']//input[@value='lg']");
   By samsungInput = By.xpath("//ul[@class='schema-filter__list']//input[@value='samsung']");
   By titleOfGoodContainer = By.xpath("//div[@class='schema-product__title']//span");
   By popUpButton = By.xpath("//span[contains(@class,'button-style_another') and contains(text(),'Да, верно')]");

  public OnlinerObject(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement findButtonTvAndVideo() {
    WebElement buttonTvAndVideo = driver.findElement(tvAndVideoButton);
    return buttonTvAndVideo;
  }

  public WebElement findButtonCatolog() {
    WebElement buttonCatolog = driver.findElement(catalogButton);
    return buttonCatolog;
  }

  public WebElement findPopUpButton() {
    WebElement popUpButtont = driver.findElement(popUpButton);
    return popUpButtont;
  }

  public WebElement findButtonElectronical() {
    WebElement buttonElectronic = driver.findElement(electronicButton);
    return buttonElectronic;
  }

  public WebElement findButtonTelevision() {
    WebElement buttonTelevision = driver.findElement(TVButton);
    return buttonTelevision;
  }

  public WebElement findElementOfFilter() {
    WebElement findElementOfFilter = driver.findElement(titleOfGoodContainer);
    return findElementOfFilter;
  }

  public WebElement findSelectLGLocator() {
    WebElement selectLG = driver.findElement(lgInput);
    return selectLG;
  }

  public WebElement findSelectSamsungLocator() {
    WebElement selectSamsung = driver.findElement(samsungInput);
    return selectSamsung;
  }
}