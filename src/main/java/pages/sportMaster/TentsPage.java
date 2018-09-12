package pages.sportMaster;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Палатки")
public class TentsPage extends AkitaPage {

    @FindBy(css = ".sm-category__facet-brand [onclick*=\"Палатки\"]")
    @Name("Палатки")
    private SelenideElement showMore;

    @Optional
    @FindBy(css = ".sm-category__facet-brand [onclick*=\"Туристические\"]")
    @Name("Туристические")
    private SelenideElement touristOption;

    @Optional
    @FindBy(css = ".sm-category__facet-brand [onclick*=\"\\'2\\'\"]")
    @Name("Количество мест 2")
    private SelenideElement amount2;

    @Optional
    @FindBy(css = ".sm-category__facet-brand [onclick*=\"\\'3\\'\"]")
    @Name("Количество мест 3")
    private SelenideElement amount3;

    @Optional
    @FindBy(css = ".sm-category__facet-brand [onclick*=\"\\'4\\'\"]")
    @Name("Количество мест 4")
    private SelenideElement amount4;

    @Optional
    @FindBy(css = "body > div.sm-wrap.width-990 > div.sm-category.clearfix > div.sm-category__left > div:nth-child(11) > div > a:nth-child(1)")
    @Name("Высокая ветроустойчивость")
    private SelenideElement windResist;

    @Optional
    @FindBy(css = "body > div.sm-wrap.width-990 > div.sm-category.clearfix > div.sm-category__left > div:nth-child(10) > div > a:nth-child(1)")
    @Name("Высокая водонепроницаемость")
    private SelenideElement waterResist;


    @Optional
    @FindBy(xpath = "(//div[@class='sm-category__main-sorting_pseudoselect'])[1]")
    @Name("Фильтр")
    private SelenideElement filtr;

    @Optional
    @FindBy(xpath = "//a[text()=\"По цене \"]/span[text()=\"(по возрастанию)\"]")
    @Name("Сортировка по цене")
    private SelenideElement sortprice;


    @Optional
    //@FindBy(xpath = "(//div[@class='sm-category__item'])[0]")
    @FindBy(xpath = "(//div[@class='sm-category__items-wrap clearfix']//div[@class='sm-category__item '])[1]")
    @Name("Самая дешевая палатка")
    private SelenideElement cheapestTent;
}
