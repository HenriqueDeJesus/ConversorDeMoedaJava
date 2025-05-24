package br.com.conversordemoeda.conexao;

import br.com.conversordemoeda.conversao.Moeda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequisicaoMoeda {

    public Moeda requisicaoMoeda() {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/0d55aa91d0a9f07536f04320/latest/USD");

        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            System.out.println("Erro");
            throw new RuntimeException(e);
        }
    }
}
