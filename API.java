import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private final Monedas coin;

    public API(String arg1, String arg2, double amount) throws IOException, InterruptedException {
        String apiBaseUrl = "https://v6.exchangerate-api.com/v6/aeda7bff3e8ed32e374dbbdb/pair/" + arg1 + "/" + arg2 + "/" + amount;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiBaseUrl))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        this.coin = gson.fromJson(json, Monedas.class);
    }

    public Monedas getCoin() {
        return coin;
    }
}
