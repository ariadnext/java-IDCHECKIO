import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;
import com.ariadnext.idcheckio.model.UserResponse;
import com.ariadnext.idcheckio.api.AdministrationApi;

public class GetUser {
  private static final String acceptLanguage = "en";
  private static final String login = "example@example.com";
  private static final String password = "example";
  private static final String basePath = "https://api.idcheck.io/rest";
  private static ApiClient apiClient = new ApiClient();
  private AdministrationApi administrationApi;

  public void init() {
    apiClient.setBasePath(basePath);
    apiClient.setUsername(login);
    apiClient.setPassword(password);
    administrationApi = new AdministrationApi(apiClient);
  }

  public void run(){
    UserResponse userResponse = null;
    try {
      userResponse = administrationApi.getUser(acceptLanguage);
    } catch (ApiException ae) {
      System.out.println("ERROR: Server returns code = " + ae.getCode());
    }
    if (userResponse != null) {
      System.out.println("Remaining credits = " + userResponse.getRemainingCredits());
    }
  }
}
