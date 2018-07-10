package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Добавление компании")
public class CompAddingPage extends AkitaPage{

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div/button[1]/span")
    @Name("Открытие счета")
    private SelenideElement onaButton;
}
