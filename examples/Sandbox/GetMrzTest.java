import com.ariadnext.idcheckio.api.SandboxApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;

import com.ariadnext.idcheckio.model.MrzResponse;

public class GetMrzTest {

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

    // mrzUid => getMrz().get(0) from a MrzListResponse (for example)
    public void run(String mrzUid) {
        MrzResponse mrzResponse = null;
        try {
            mrzResponse = sandboxApi.getMrz(mrzUid);
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
    }
}
