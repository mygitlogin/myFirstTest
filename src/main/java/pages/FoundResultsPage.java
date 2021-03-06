package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;
    @Name("Результаты поиска")
    public class FoundResultsPage  extends AkitaPage {

        @FindBy(css = ".repo-list-item h3")
        @Name("Заголовки страниц")
    public List<SelenideElement> pageNames;

    public List<SelenideElement> getPageNames() {
        return pageNames;
    }

}
