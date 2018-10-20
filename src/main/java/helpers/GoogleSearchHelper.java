package helpers;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

public class GoogleSearchHelper {

    AkitaScenario akitaScenario = AkitaScenario.getInstance();

  public boolean isNotEmpty()
  {
      FoundResultsPage foundPage = akitaScenario.getPage(FoundResultsPage.class);
     return foundPage.getPageNames().isEmpty();
    }
}
