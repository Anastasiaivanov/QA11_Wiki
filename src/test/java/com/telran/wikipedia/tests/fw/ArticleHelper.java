package com.telran.wikipedia.tests.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticleHelper extends HelperBase {

    public ArticleHelper(AppiumDriver driver) {
        super(driver);
    }

    public void search() {
        tap(By.id("search_container"));
        type(By.id("search_src_text"), "tcp/ip");
        waitForElementAndTap(By.id("page_list_item_container"), 15);
        String title = driver.findElement(By.id("view_page_title_text")).getText();
        System.out.println(title);
    }

    public void addToFavourite() {
        tap(By.xpath("//android.widget.ImageView[@content-desc=\"Add this article to a reading list\"]"));
    }

    public void createReadingList() {
        tap(By.id("onboarding_button"));
        tap(By.id("text_input"));
        driver.findElement(By.id("text_input")).clear();
        type(By.id("text_input"), "My Favourite");
        tap(By.xpath("//*[@text='OK']"));

    }
    public void close(){
        tap(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    }

    public void removeFromFavourites() {
        tap(By.xpath("//android.widget.FrameLayout[@content-desc=\"My lists\"]/android.widget.ImageView"));
        tap(By.id("item_title"));
        tap(By.id("page_list_item_action_primary"));
        tap(By.id("reading_list_item_remove_text"));
    }
}
