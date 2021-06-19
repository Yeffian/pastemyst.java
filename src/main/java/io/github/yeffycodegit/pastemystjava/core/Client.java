package io.github.yeffycodegit.pastemystjava.core;

import lombok.NonNull;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse;

/**
 * Implements functionality for performing different requests on the API, and is used by the rest of the library to implement its functionality.
 *
 * @author YeffyCodeGit
 * @version 1.0.0
 **/
public class Client {
    private HttpClient client;

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
    public String get(@NonNull String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        status = response.statusCode();

        return response.body();
    }

    /**
     * Performs a GET request on a given endpoint.
     *
     * @param endpoint The endpoint to send the request to.
     * @param authToken The token to add on the Authorization header.
     * @return {@code String} containing the result of the performed request.
     * @throws IOException
     * @throws InterruptedException
     **/
    public String get(@NonNull String endpoint, @NonNull String authToken) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .setHeader("Authorization", authToken)
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
    public void post(@NonNull String endpoint, @NonNull String body) throws InterruptedException, IOException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Performs a POST request on a given endpoint, and posts the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param body The data to post to the endpoint.
     * @param authToken The token to add on the Authorization header.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void post(@NonNull String endpoint, @NonNull String body, @NonNull String authToken) throws InterruptedException, IOException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .setHeader("Authorization", authToken)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Performs a DELETE request on a given endpoint.
     *
     * @param endpoint The endpoint to send the request to.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void delete(@NonNull String endpoint) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .DELETE()
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Performs a DELETE request on a given endpoint.
     *
     * @param endpoint The endpoint to send the request to.
     * @param authToken The token to add on the Authorization header.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void delete(@NonNull String endpoint, @NonNull String authToken) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .setHeader("Authorization", authToken)
                .DELETE()
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Performs a PATCH request on a given endpoint and sends the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param data The data to send.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void patch(@NonNull String endpoint, @NonNull String data) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(data))
                .header("Content-Type", "application/json")
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Performs a PATCH request on a given endpoint and sends the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param data The data to send.
     * @param authToken The token to add on the Authorization header.
     * @throws IOException
     * @throws InterruptedException
     **/
    public void patch(@NonNull String endpoint, @NonNull String data, @NonNull String authToken) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(data))
                .setHeader("Authorization", authToken)
                .header("Content-Type", "application/json")
                .build();

        client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}