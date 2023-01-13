import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerObject {

  WebDriver driver;
  private By catalogButton = By.xpath("//ul[@class='b-main-navigation']/child::li/descendant::span[contains(text(),'Каталог')]");
  private By electronicButton = By.xpath("//li/descendant::span[contains(text(),'Электроника')]");
  private By tvAndVideoButton = By.xpath("//div[contains(text(),'Телевидение')]");
  private By TVButton = By.xpath("//div[contains(text(),'Телевидение')]/..//span[contains(text(),'Телевизоры')]");
  private By filterProducerlLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul");
   By lgInput = By.xpath("//ul[@class='schema-filter__list']//input[@value='lg']");
   By samsungInput = By.xpath("//ul[@class='schema-filter__list']//input[@value='samsung']");

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

  public WebElement findButtonElectronical() {
    WebElement buttonElectronic = driver.findElement(electronicButton);
    return buttonElectronic;
  }

  public WebElement findButtonTelevision() {
    WebElement buttonTelevision = driver.findElement(TVButton);
    return buttonTelevision;
  }

  public WebElement findFilterProducer() {
    WebElement filterProducer = driver.findElement(filterProducerlLocator);
    return filterProducer;
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