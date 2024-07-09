package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTestClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\SIDHARTH\\New folder\\Google Chrome\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Chrome Driver Located");

        ChromeOptions cops = new ChromeOptions();
        cops.setBinary("\\SIDHARTH\\New folder\\Google Chrome\\Chrome Browser\\Test Browser\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver(cops);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Chrome opened");

        driver.get("https://www.washingtonpost.com/");
        System.out.println("Washington Post Page opened");

        // Maximize Window to prevent test failure.

//        WebElement politicsButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/ul/li[1]/a/p"))));
//        System.out.println("Politics Button Found");
//
//        politicsButton.click();
//        System.out.println("Politics Button Clicked");
//
//        WebElement closeAd = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"cbb\"]/svg/path[2]"))));
//        System.out.println("Ad Displayed");
//
//        closeAd.click();
//        System.out.println("Ad Closed");

        driver.quit();
        System.out.println("Driver Quit");
    }
}
