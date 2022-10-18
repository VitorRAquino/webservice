package br.com.cliente;

import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class ClienteWebService {

    public static void main(String[] args) throws IOException {
        String conteudos = Request.Post("http://localhost:8080/alura-servlets-fundamentos-programacao-web-java/empresas")
                .addHeader("Accept", "application/json").execute().returnContent().asString();

        System.out.println(conteudos);
    }
}
