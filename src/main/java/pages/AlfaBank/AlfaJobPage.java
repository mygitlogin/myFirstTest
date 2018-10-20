package pages.AlfaBank;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Вакансии")
public class AlfaJobPage extends AkitaPage {

    @FindBy(css = "a[href*=\"about\"]")
    @Name("О работе в банке")
    public SelenideElement aboutJob;
}
