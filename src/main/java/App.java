import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String fooResourceUrl
                = "https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<String> response
                = template.getForEntity(fooResourceUrl , String.class);

        Gson gson = new Gson();
        Post[] posts = gson.fromJson(response.getBody(), Post[].class);
        System.out.println(Arrays.toString(posts));


    }
}
