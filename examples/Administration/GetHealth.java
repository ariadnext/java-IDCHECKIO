import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;
import com.ariadnext.idcheckio.api.AdministrationApi;
import com.ariadnext.idcheckio.model.HealthResponse;

public class GetHealth {
  private static final String acceptLanguage = "en";
  private static final String basePath = "https://api.idcheck.io/rest";
  private static ApiClient apiClient = new ApiClient();
  private AdministrationApi administrationApi;

  public void init() {
    apiClient.setBasePath(basePath);
    administrationApi = new AdministrationApi(apiClient);
  }

  public void run(){
    HealthResponse healthResponse = null;
    try {
      healthResponse = administrationApi.getHealth();
    } catch (ApiException ae) {
      System.out.println("ERROR: Server returns code = " + ae.getCode());
    }
    if (healthResponse != null) {
      System.out.println("Server status = " + healthResponse.getStatus());
    }
  }
}
