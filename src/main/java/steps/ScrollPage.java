package steps;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

@Slf4j
public class ScrollPage {
    private AkitaScenario akitaScenario = AkitaScenario.getInstance();
    /**
     *  Скроллит экран до нужного элемента, имеющегося на странице, но видимого только в нижней/верхней части страницы.
     */
    @Тогда("^страница прокручена до элемента \"([^\"]*)\"")
    public void scrollPageToElement(String elementName) {
        akitaScenario.getCurrentPage().getElement(elementName).scrollTo();
    }
}
