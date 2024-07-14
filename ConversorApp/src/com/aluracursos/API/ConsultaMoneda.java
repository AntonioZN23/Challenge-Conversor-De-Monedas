package com.aluracursos.API;

import com.aluracursos.Moneda.Moneda;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscaMoneda(String abreviatura) {

        String url = "https://v6.exchangerate-api.com/v6/d82385fd060dcc108390f184/latest/" + abreviatura;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda, por favor intenta de nuevo. D=");
        } catch (Error e){
            throw new Error("Algo salió mal, vuelve a intentarlo. =[");
        }

    }
}
