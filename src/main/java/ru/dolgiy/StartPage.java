package ru.dolgiy;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
/**
 * Created by Anton on 15.04.2016.
 */
public class StartPage {
    public void search_input(String daString)
    {
        Selenide.$(By.id("lst-ib")).setValue(daString);
    }

}
