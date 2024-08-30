package tek_bdd.pages;

import org.openqa.selenium.By;
import tek_bdd.utilities.SeleniumUtility;

public class PlansPageObject extends SeleniumUtility {
    public static final By LOGIN_BUTTON = By.linkText("Login");
    public static final By PLANE_BUTTON = By.linkText("Plans");
    public static final By PLANE_TYPE = By.xpath("//table/thead/tr/th[text() = 'Plan Type']");
    public static final By DATE_CREATED = By.xpath("//table/thead/tr/th[text() = 'Date Created']");
    public static final By DATE_EXPIRE = By.xpath("//table/thead/tr/th[text() = 'Date Expire']");
    public static final By CREATE_DATE = By.xpath("//table/tbody/tr/td[4]");
    public static final By EXPIRE_DATE = By.xpath("//table/tbody/tr/td[5]");




    //


    public static final By TEK_INSURANCE_UI_TEXT = By.xpath("//h2[normalize-space()='TEK Insurance App']");
    public static final By CREATE_PRIMARY_ACCOUNT_BUTTON = By.linkText("Create Primary Account");
    public static final By COLOR_MOOD_BUTTON = By.xpath("//button[@aria-label='color-mode']//*[name()='svg']");

}
