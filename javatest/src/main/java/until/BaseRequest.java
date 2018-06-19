package until;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.BaseEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class BaseRequest<T> implements Initializable {
    private String urlRequest;
    private T item ;

    public BaseRequest(String urlRequest,Class<T> type) {
        this.urlRequest = urlRequest;
        item = (T) type;
    }

    public T getItem() {
        return item;
    }


    public void Initialize() throws IOException {
        HttpUriRequest request = new HttpGet(urlRequest);
        HttpResponse response = HttpClientBuilder.create().build().execute(request);
        item = retrieveResourceFromResponse(response, (Class<T>) item);
    }

    private T retrieveResourceFromResponse(HttpResponse response, Class<T> clazz) throws IOException {
        String jsonFromResponse = EntityUtils.toString(response.getEntity());
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonFromResponse, clazz);
    }
}
