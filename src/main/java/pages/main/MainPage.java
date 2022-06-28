package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {super(driver);}

    private final By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[1]");
    private final By learnMoreRegButton = By.xpath("//a[contains(@class,'Ktie8 rc5jlmxc')]");
    private final By loadMoreButton = By.xpath("//button[@class='q_qp3Q bpeU-bUX-- js-showner-more js-showner-sortgroups']");
    private final By cityNameText = By.xpath("//div[normalize-space()='Chicago']");
    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By submitButton = By.xpath("//button[@class='Ktie8']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");
    private final By nextBlogSliderButton = By.xpath("//button[@class='js-articles-next-lg slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='sad_5 mNlX9S'])[5]");
    private final By scrollToBlogSlider = By.xpath("(//h2[@class='IWt9P5ijp'])[12]");

    public MainPage moveToChangeLanguageButton () {
        moveToElement(changeLanguageButton);
        return this;
    }

    public MainPage changeLanguageButtonClick (int numButton) {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[" + numButton + "]");
        driver.findElement(changeLanguageButton).click();
        return this;
    }

    public MainPage learnMoreRegButtonClick () {
        driver.findElement(learnMoreRegButton).click();
        return this;
    }

    public MainPage downloadAppRegButtonClick (int numButton) {
        By downloadAppRegButton = By.xpath("(//a[contains(@class,'Ktie8 tv7rmz6-pXCu')])[" + numButton + "]");
        driver.findElement(downloadAppRegButton).click();
        return this;
    }

    public MainPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='BuKehZjDJB9'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public MainPage readArticleButtonClick (int numButton) {
        By readArticle = By.xpath("(//a[@class='axs3486RR'])[" + numButton + "]");
        driver.findElement(readArticle).click();
        return this;
    }

    public MainPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityNameTextVisibleCheck () {
        return elementVisibleCheck(cityNameText);
    }

    public MainPage faqCollapseButtonClick (int numButton) {
        By faqButton = By.xpath("(//div[@class='NzEl6xYsG'])[" + numButton + "]");
        driver.findElement(faqButton).click();
        return this;
    }

    public Boolean faqTextVisibleCheck (int numButton) {
        By faqText = By.xpath("(//div[@class='qHDg3xKZXJf_'])[" + numButton + "]");
        return driver.findElement(faqText).isDisplayed();
    }

    public MainPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public MainPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public MainPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public MainPage submitButtonClick () {
        driver.findElement(submitButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        boolean isVisible = driver.findElements(submitMessage).size() > 0;
        if (!isVisible) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            isVisible = driver.findElements(submitMessage).size() > 0;
        }
        return isVisible;
    }


    public Boolean inputErrorVisibleCheck () {
        boolean errorsCheck = driver.findElements(By.xpath("//*[@class='xb1m7TYKT error']")).size() == 3;
        if (!errorsCheck) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            errorsCheck = driver.findElements(submitMessage).size() == 3;
        }
        return errorsCheck;
    }

    public MainPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public MainPage nextBlogSliderButtonClick () {
        driver.findElement(nextBlogSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

}
