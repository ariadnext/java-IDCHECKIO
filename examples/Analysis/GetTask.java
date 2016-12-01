import com.ariadnext.idcheckio.api.AnalysisApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;
import com.ariadnext.idcheckio.model.TaskResponse;

public class GetTask {

    private static final String acceptLanguage = "en";
    private static final String login = "example@example.com";
    private static final String password = "example";
    private static final String basePath = "https://api.idcheck.io/rest";
    private static ApiClient apiClient = new ApiClient();
    private AnalysisApi analysisApi;

    public void init() {
        apiClient.setBasePath(basePath);
        apiClient.setUsername(login);
        apiClient.setPassword(password);
        apiClient.setConnectTimeout(30000);
        apiClient.setReadTimeout(30000);
        apiClient.setFollowRedirects(false);
        analysisApi = new AnalysisApi(apiClient);
    }

    // uid => getUid from a ResultResponse object
    public void run(String uid) {
      TaskResponse taskResponse = null;
      final long startTime = System.nanoTime();
      try {
          taskResponse = analysisApi.getTask(uid, acceptLanguage, 30000L);
      } catch (ApiException ae) {
          System.out.println("ERROR: Server returns code = " + ae.getCode());
      }
      final long endTime = System.nanoTime();
      System.out.println("Response in " + (endTime - startTime) / 1000000 + "ms ");
    }
}
