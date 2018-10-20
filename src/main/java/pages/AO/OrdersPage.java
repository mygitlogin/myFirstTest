package pages.AO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Страница списка заявок")
public class OrdersPage extends AkitaPage {
    @FindBy(css = ".app__username-header")
    @Name("Заголовок с именем пользователя")
    private SelenideElement headerUserName;

    @FindBy(css = ".button__text")
    @Name("Добавить новую")
    public SelenideElement addButton;
}