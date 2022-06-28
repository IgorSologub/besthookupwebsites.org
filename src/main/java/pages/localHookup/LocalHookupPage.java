package pages.localHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LocalHookupPage extends BasePage {

    public LocalHookupPage (WebDriver driver) {super(driver);}

    private final By learnMoreButton = By.xpath("//a[@class='Ktie8 wa5']");
    private final By loadMoreButton = By.xpath("//button[@class='q_qp3Q bpeU-bUX-- js-showner-more js-showner-sortgroups']");
    private final By cityBlock = By.xpath("//div[normalize-space()='Chicago']");
    private final By loadMoreReviewButton = By.xpath("//button[@class='q_qp3Q bpeU-bUX-- CuYjr8 js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='Z4ZzwHWy'])[2]");
    private final By faqCollapseButton = By.xpath("(//div[@class='f26MZPO8'])[1]");
    private final By faqCollapseText = By.xpath("(//div[@class='qHDg3xKZXJf_'])[1]");
    private final By authorButton = By.xpath("//a[@class='gf0l9']");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='uIzmiNJZHJ'])[6]");
    private final By scrollToBlogSlider = By.xpath("(//h2[@class='IWt9P5ijp'])[9]");

    public LocalHookupPage learnMoreButtonClick () {
        driver.findElement(learnMoreButton).click();
        return this;
    }

    public LocalHookupPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityBlockCheck () {
        return elementVisibleCheck(cityBlock);
    }

    public LocalHookupPage visitSiteButtonClick (int numButton) {
        By visitSiteButton = By.xpath("(//a[@class[contains(.,'Ktie8 tv7rmz6-pXCu')]])[" + numButton + "]");
        driver.findElement(visitSiteButton).click();
        return this;
    }

    public LocalHookupPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class[contains(.,'BuKehZjDJB9')]])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public LocalHookupPage latestNewsButtonClick (int numButton) {
        By latestNewsButton = By.xpath("(//a[@class='uxyHrFu1se5r'])[" + numButton + "]");
        driver.findElement(latestNewsButton).click();
        return this;
    }

    public LocalHookupPage loadMoreReviewButtonClick () {
        driver.findElement(loadMoreReviewButton).click();
        return this;
    }

    public Boolean reviewBlockCheck () {
        return elementVisibleCheck(reviewBlock);
    }

    public LocalHookupPage faqCollapseButtonClick () {
        driver.findElement(faqCollapseButton).click();
        return this;
    }

    public Boolean faqCollapseTextCheck () {
        return elementVisibleCheck(faqCollapseText);
    }

    public LocalHookupPage articlesButtonClick (int numButton) {
        By articlesButton = By.xpath("(//a[@class='uWpTg6XYW'])[" + numButton + "]");
        driver.findElement(articlesButton).click();
        return this;
    }

    public LocalHookupPage authorButtonClick () {
        driver.findElement(authorButton).click();
        return this;
    }

    public Boolean authorCheck () {
        return driver.getTitle().contains("Erik");
    }

    public LocalHookupPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public LocalHookupPage nextBlogSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

}
