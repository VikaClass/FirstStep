package lapina.vika;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        open("https://www.google.com/");
        SelenideElement googleSearch = $(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        googleSearch.setValue("Котики");
        googleSearch.pressEnter();

        System.out.println("Closed browser");
    }
}