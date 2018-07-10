package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Slf4j
public class minTemp {
    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

    @Тогда("^найти минимальную температуру в списке \"([^\"]*)\"$")
    public void selectFromList(String listName) {
        List<SelenideElement> listOfElementsFromPage = akitaScenario.getCurrentPage().getElementsList(listName);
        List<Integer> elementsText = new ArrayList<Integer>();

        SelenideElement firstElement = listOfElementsFromPage.get(0);
//        waitWhileAnimationPlay(firstElement);

        int minValue = getTempFromElement(firstElement);
        int dayNumber = 1;
        for (int i = 1; i < listOfElementsFromPage.size(); i++) {
            int temp = getTempFromElement(listOfElementsFromPage.get(i));
            if (temp < minValue) {
                minValue = temp;
                dayNumber = i + 1;
            }

        }

        akitaScenario.write("Минимальная температура за месяц " + minValue + ". Дата: " + dayNumber + " июня.");

    }

    private int getTempFromElement(SelenideElement element) {
        return Integer.parseInt(element.getText().substring(1));
    }

    private void waitWhileAnimationPlay(SelenideElement element) {
        while (true) {
            String str = element.getText();
            if (str != null && !str.isEmpty()) {
                break;
            }
        }

    }
}

