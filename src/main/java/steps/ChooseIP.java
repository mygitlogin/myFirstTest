package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.И;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import java.util.Random;

@Slf4j
public class ChooseIP {

    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

    @И(value = "^в элемент \"([^\"]*)\" добавить значение \"([^\"]*)\" и сгенерировать (\\d+) символов$")
    public void chooseIP (String elementName, String str, int randomNum)
    {
        cleanField(elementName);
        SelenideElement valueInput = akitaScenario.getCurrentPage().getElement(elementName);
        String charSeq = getRandCharSequence(randomNum);

        String result = str + charSeq;
        valueInput.setValue(result);

    }
    private char charGenerator() {
        Random random = new Random();
        return (char) (1072 + random.nextInt(32));
    }

    private String getRandCharSequence(int length) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char symbol = charGenerator();
            builder.append(symbol);
        }
        return builder.toString();
    }
    private void cleanField(String nameOfField) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getElement(nameOfField);
        valueInput.doubleClick().sendKeys(Keys.DELETE);
    }
}
