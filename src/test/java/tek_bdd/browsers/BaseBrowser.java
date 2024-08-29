package tek_bdd.browsers;


import org.openqa.selenium.WebDriver;

public  interface  BaseBrowser {

   WebDriver openBrowser(boolean isHeadless);
}
