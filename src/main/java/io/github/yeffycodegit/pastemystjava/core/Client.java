package io.github.yeffycodegit.pastemystjava.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse;
import java.util.HashMap;

/**
 * Implements functionality for performing different requests on the API, and is used by the rest of the library to implement its functionality.
 *
 * @author YeffyCodeGit
 * @version 1.0.0
 **/
public class Client {
    private static HttpClient client;

    public int status;

    public Client() {
        client = HttpClient.newHttpClient();
    }

    /**
    * Performs a GET request on a given endpoint.
    *
    * @param endpoint The endpoint to send the request to.
    * @return {@code String} containing the result of the performed request.
    * @throws IOException
    * @throws InterruptedException
    **/
    public String get(String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        status = response.statusCode();

        return response.body();
    }

    /**
     * Performs a POST request on a given endpoint, and posts the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param body The data to post to the endpoint.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void post(String endpoint, String body) throws InterruptedException, IOException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        client.send(request, BodyHandlers.discarding());
    }

    /**
     * Performs a DELETE request on a given endpoint.
     *
     * @param endpoint The endpoint to send the request to.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void delete(String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .DELETE()
                .build();

        client.send(request, BodyHandlers.ofString());
    }

    /**
     * Performs a PATCH request on a given endpoint and sends the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param data The data to send.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void patch(String endpoint, String data) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(data))
                .header("Content-Type", "application/json")
                .build();

        client.send(request, BodyHandlers.ofString());
    }
}