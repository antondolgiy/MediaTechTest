package ru.dolgiy;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Anton on 15.04.2016.
 */
public class mediatechSteps {

    StartPage startPage =page(StartPage.class);




    @Given("^Open page by url \"([^\"]*)\" in browser$")
    public void open_page_by_url_in_browser(String arg1) throws Throwable {

        open(arg1,StartPage.class);


    }

    @Given("^Type to search input \"([^\"]*)\"$")
    public void type_to_serch_input(String arg1) throws Throwable {
        startPage.search_input(arg1);

    }

    @When("^Press button search$")
    public void press_button_search() throws Throwable {
        SelenideElement loupe_button=$(By.xpath(".//*[@id='sblsbb']/button"));
        loupe_button.click();

    }

    @Then("^Header search snippet \"([^\"]*)\" text equals \"([^\"]*)\"$")
    public void header_search_snippet_text_equals(String arg1, String arg2) throws Throwable {

        List<SelenideElement> result = $$(By.xpath(".//*[@id='rso']/*/*/div/h3/a"));

        SelenideElement element =result.get(Integer.parseInt(arg1)-1);
        System.out.println(element.getText());

        //Я не уыерен требуется-ли именно проверка эквивалентности,поэтому два варианта проверки:

        //1) если проверка именнно на жёсткое соответствие заданного и фактического текстов заголовков,то закоменченная строка:
        // assertTrue("doesn't match",arg2.equals(element.getText()));

        // 2)если проверка на наличие заданного текста в фактическом,то:
        element.shouldHave(text(arg2));







    }
}
