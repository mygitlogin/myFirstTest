package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Документы")
public class FilesPage extends AkitaPage {
   @FindBy(css = "body > input[type=\"file\"]:nth-of-type(1)")
    @Name("Паспорт")
    private SelenideElement passButton;

   @FindBy(css="body > input[type=\"file\"]:nth-of-type(2)")
    @Name("Устав")
    private SelenideElement ustButton;

    @FindBy(css="body > input[type=\"file\"]:nth-of-type(3)")
    @Name("Протокол")
    private SelenideElement prtButton;

    @Optional
    @FindBy(css="body > input[type=\"file\"]:nth-of-type(4)")
    @Name("Прескоринг")
    private SelenideElement scoreButton;
}
