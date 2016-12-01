import com.ariadnext.idcheckio.api.SandboxApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;

import com.ariadnext.idcheckio.model.MrzListResponse;

public class GetMrzListTest {

    private static final String acceptLanguage = "en";
    private static final String login = "example@example.com";
    private static final String password = "example";
    private static final String basePath = "https://api.idcheck.io/rest";
    private static ApiClient apiClient = new ApiClient();
    private SandboxApi sandboxApi;

    public void init() {
        apiClient.setBasePath(basePath);
        apiClient.setUsername(login);
        apiClient.setPassword(password);
        sandboxApi = new SandboxApi(apiClient);
    }

    public void run() {
        MrzListResponse mrzListResponse = null;
        try {
            mrzListResponse = sandboxApi.getMrzList();
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
    }
}
