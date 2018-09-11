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
            List<Integer> elementsText = new ArrayList<>();
            for (SelenideElement selenideElement: listOfElementsFromPage){
                elementsText.add(Integer.parseInt(selenideElement.getText().substring(1)));
            }
            Integer minValue = Collections.min(elementsText);
            akitaScenario.write("Минимальная температура за месяц" + minValue);
        }


    }

