package pages.AO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Тарифы")
public class TarifPage extends AkitaPage {

    @FindBy(xpath="//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/form/div/div[1]/div/div/div[1]/div/button")
    @Name("Выбрать тариф")
    private SelenideElement tarifButton;

    @FindBy(css = ".spin-button__span-text")
    @Name("Далее")
    private SelenideElement buttonNext;
}