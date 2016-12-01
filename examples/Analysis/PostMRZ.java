import com.ariadnext.idcheckio.api.AnalysisApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;
import com.ariadnext.idcheckio.model.MrzRequest;
import com.ariadnext.idcheckio.model.ResultResponse;

public class PostMRZ {

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

    public void run() {
      System.out.println("postMRZ");
        ResultResponse resultResponse = postMrz(analysisApi, false, "IDFRABERTHIER<<<<<<<<<<<<<<<<<<<<<<<", "9409923102854CORINNE<<<<<<<6512068F4");

        if (resultResponse != null) {
            System.out.println("Name from this MRZ : " + resultResponse.getHolderDetail().getLastName() + " " + resultResponse.getHolderDetail().getFirstName());
        }
    }

    private ResultResponse postMrz(AnalysisApi api, Boolean aSync, String... lines) {
        MrzRequest body = new MrzRequest();
        int i = 1;
        for (String line : lines) {
            switch (i) {
                case 1:
                    body.setLine1(line);
                    break;
                case 2:
                    body.setLine2(line);
                    break;
                case 3:
                    body.setLine3(line);
                    break;
                default:
            }
            i++;
        }

        final long startTime = System.nanoTime();
        ResultResponse resultResponse = null;
        try {
            resultResponse = api.postMrz(body, aSync, acceptLanguage);
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
        final long endTime = System.nanoTime();
        System.out.println("Response in " + (endTime - startTime) / 1000000 + "ms ");

        return resultResponse;
    }
}
