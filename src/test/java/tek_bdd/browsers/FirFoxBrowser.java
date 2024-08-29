package tek_bdd.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirFoxBrowser implements BaseBrowser {
    @Override
    public WebDriver openBrowser(boolean isHeadless) {
        FirefoxOptions options = new FirefoxOptions();
        if (isHeadless) options.addArguments("--headless");
        return new FirefoxDriver(options);
    }
}