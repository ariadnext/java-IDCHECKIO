import com.ariadnext.idcheckio.api.AnalysisApi;
import com.ariadnext.idcheckio.invoker.ApiClient;
import com.ariadnext.idcheckio.invoker.ApiException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import javax.xml.bind.DatatypeConverter;

import com.ariadnext.idcheckio.model.ImageRequest;
import com.ariadnext.idcheckio.model.ResultResponse;

public class PostImage {

    private static final String acceptLanguage = "en";
    private static final String login = "example@example.com";
    private static final String password = "example";
    private static final String basePath = "https://api.idcheck.io/rest";
    private static final String imagePath = "/tmp/";
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
        ImageRequest body = new ImageRequest();
        try {
            body.setFrontImage(encodeFileToBase64Binary(imagePath + "berthier_recto.jpg"));
            body.setBackImage(encodeFileToBase64Binary(imagePath + "berthier_verso.jpg"));
        } catch (IOException ioe) {
            System.out.println("Unable to encode file(s) => " + ioe.getMessage());
        }

        final long startTime = System.nanoTime();
        ResultResponse resultResponse = null;
        try {
            resultResponse = analysisApi.postImage(body, false, acceptLanguage);
        } catch (ApiException ae) {
            System.out.println("ERROR: Server returns code = " + ae.getCode());
        }
        final long endTime = System.nanoTime();
        System.out.println("Response in " + (endTime - startTime) / 1000000 + "ms ");
        if (resultResponse != null) {
            System.out.println("MRZ from the document : " + resultResponse.getMrz().getLine1() + "/" + resultResponse.getMrz().getLine2());
        }
    }

    private String encodeFileToBase64Binary(String fileName) throws IOException {
        File file = new File(fileName);
        byte[] bytes = loadFile(file);
        String encodedString = DatatypeConverter.printBase64Binary(bytes);
        return encodedString;
    }

    private static byte[] loadFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        long length = file.length();
        if (length > Integer.MAX_VALUE) {
            // File is too large
        }
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+file.getName());
        }

        is.close();
        return bytes;
    }
}
