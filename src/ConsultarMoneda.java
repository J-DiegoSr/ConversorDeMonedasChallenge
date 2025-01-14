import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//consultar mondeda -> consultar pelicula
//converitr moneda-pelicula

public class ConsultarMoneda {

    public Monedita buscarMoneda(String monedaBase,  String monedaTaget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3ee1801674f522a5800bcaa6/pair/"+monedaBase+"/"+monedaTaget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedita.class);
        } catch (Exception  e) {
            throw new RuntimeException("No se encontro esta divisa. ");
        }

    }
}
