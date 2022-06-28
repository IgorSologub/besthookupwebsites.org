package pages.sugarDaddies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.QUIZ_PAGE_URL;

public class SugarDaddiesPage extends BasePage {

    public SugarDaddiesPage (WebDriver driver) {super(driver);}

    private final By startButton = By.xpath("//a[@class='Ktie8 Q6ZBNOzKxcze']");

    public SugarDaddiesPage visitSiteRegButtonClick (int numButton) {
        By visitSiteRegButton = By.xpath("(//a[@class[contains(.,'Ktie8 LobzYDgU34Bz')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public SugarDaddiesPage visitSiteRegButtonInTopSitesForSugarDatingClick (int numButton) {
        By visitSiteRegButtonInTopSitesForSugarDating = By.xpath("(//a[@class[contains(.,'Ktie8 Prdl_bF5hJ')]])[" + numButton + "]");
        driver.findElement(visitSiteRegButtonInTopSitesForSugarDating).click();
        return this;
    }

    public SugarDaddiesPage sendMessageRegButtonClick (int numButton) {
        By sendMessageRegButton = By.xpath("(//a[@class[contains(.,'Ktie8 JLT95')]])[" + numButton + "]");
        driver.findElement(sendMessageRegButton).click();
        return this;
    }

    public SugarDaddiesPage loadMoreRegButtonClick () {
        By loadMoreRegButton = By.xpath("//a[@class[contains(.,'q_qp3Q rUfXiFMIS')]]");
        driver.findElement(loadMoreRegButton).click();
        return this;
    }

    public SugarDaddiesPage addProfilesRegButtonClick () {
        By addProfilesRegButton = By.xpath("//a[@class[contains(.,'WjdzUi1')]]");
        driver.findElement(addProfilesRegButton).click();
        return this;
    }

    public SugarDaddiesPage startButtonClick () {
        driver.findElement(startButton).click();
        return this;
    }

    public Boolean startButtonCheck () {
        return driver.getCurrentUrl().contains(QUIZ_PAGE_URL);
    }

    public  SugarDaddiesPage findSugarCityButtonClick (int numButton) {
        By findSugarCityButton = By.xpath("(//a[@class='vkdMGoYyM_ID UOFi3XB_8'])[" + numButton + "]");
        driver.findElement(findSugarCityButton).click();
        return this;
    }

    public  SugarDaddiesPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='gxq4uswy'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public  SugarDaddiesPage readFullReviewButtonClick (int numButton) {
        By readFullReview = By.xpath("(//a[@class='m-NsPLDxII'])[" + numButton + "]");
        driver.findElement(readFullReview).click();
        return this;
    }

}
