package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By header = By.cssSelector("h1.post-title");
    private By logoutButton = By.linkText("Log out");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}
