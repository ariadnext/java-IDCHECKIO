import com.ariadnext.idcheckio.api.AnalysisApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.ariadnext.idcheckio.model.ReportResponse;

public class GetReport {

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
        analysisApi = new AnalysisApi(apiClient);
    }

    // uid => getUid from a ResultResponse object
    public void run(String uid) {
        ReportResponse reportResponse = null;
        final long startTime = System.nanoTime();
        try {
            reportResponse = analysisApi.getReport(uid, acceptLanguage);
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
        final long endTime = System.nanoTime();
        System.out.println("Response in " + (endTime - startTime) / 1000000 + "ms ");
        if (reportResponse != null) {
            byte[] data = Base64.decodeBase64(reportResponse.getReport());
            try (OutputStream stream = new FileOutputStream("/tmp/report.pdf")) {
                stream.write(data);
            } catch (IOException ioe) {
                System.out.println("ERROR: Unable to write file on FS => " + ioe.getMessage());
            }
        }
    }
}
