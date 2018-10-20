package pages.AO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Добавление компании")
public class CompAddingPage extends AkitaPage{



    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div:nth-child(2) > button")
    @Name("Добавить новую")
    private SelenideElement addButton;
}
