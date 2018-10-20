package pages.AlfaBank;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Альфа Банк")
public class AlfaStartPage extends AkitaPage {

    @Optional
    @FindBy(css = "a[title=\"Вакансии\"]")
    @Name("Вакансии")
    public SelenideElement vacancyLink;
}
