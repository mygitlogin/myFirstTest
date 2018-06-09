package helpers;
import com.google.gson.Gson;
import entities.Repositories;
import entities.RepositoryItem;
import pages.FoundResultsPage;
import pages.GooglePage;
import pages.RepositoriesPage;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class GoogleSearchHelper {

    AkitaScenario akitaScenario = AkitaScenario.getInstance();

  public boolean isNotEmpty()
  {
      FoundResultsPage foundPage = akitaScenario.getPage(FoundResultsPage.class);
     return foundPage.getPageNames().isEmpty();
    }
}
