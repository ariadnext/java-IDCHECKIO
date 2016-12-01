import com.ariadnext.idcheckio.api.SandboxApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;
import com.ariadnext.idcheckio.model.Image;

import java.util.List;

public class GetImageTest {

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
        apiClient.setConnectTimeout(30000);
        apiClient.setReadTimeout(30000);
        apiClient.setFollowRedirects(false);
        sandboxApi = new SandboxApi(apiClient);
    }

    // imageUid => getImage().get(0) from a ImageListResponse (for example)
    public void run(String imageUid) {
        List<byte[]> imageResponse = null;
        try {
            imageResponse = sandboxApi.getImage(imageUid, RawTypeEnum.JPG, FaceEnum.RECTO, LightEnum.DL);
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
    }
}
