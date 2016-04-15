package ru.dolgiy;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Anton on 15.04.2016.
 */
public class StartPage {
    public void search_input(String daString)
    {
        $(By.id("lst-ib")).setValue(daString);
    }
    public void press_search_btn()
    {
        SelenideElement loupe_button=$(By.xpath(".//*[@id='sblsbb']/button"));
        loupe_button.click();
    }

}
