package pages.AlfaBank;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("О работе в банке")
public class AboutPage extends AkitaPage {

    @FindBy(css = ".info")
    @Name("Информация")
    public SelenideElement jobInfo;
}
