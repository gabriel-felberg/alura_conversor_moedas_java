package api;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Server {
    HttpClient client = HttpClient.newHttpClient();
    Gson gson = new Gson();

    public Coin getCoin(String key, String baseURL, String from, String to) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseURL + key + "/pair/" + from + "/" + to))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        var data = response.body();

        return gson.fromJson(data, Coin.class);

    }
}
// 436dd95f75eb678d7a31e70a
// https://v6.exchangerate-api.com/v6/