package io.github.yeffycodegit.pastemyst4j.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * This class implements functionality for performing different requests on the API, and is used by the rest of the library to implement its functionality.
 *
 * @author YeffyCodeGit
 * @version 1.0.0
 **/
public class Client {
    private static HttpURLConnection connection;

    /**
    * Performs a GET request on a given endpoint.
    *
    * @param endpoint The endpoint to send the request to.
    * @return {@code String} containing the result of the performed request.
    * @throws IOException
    **/
    public String get(String endpoint) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContents = new StringBuffer();

        URL url = new URL(endpoint);

        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

       int status = connection.getResponseCode();

       if (status > 299) {
           reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
       } else {
           reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
       }

       while((line = reader.readLine()) != null) {
            responseContents.append(line);
       }

        reader.close();

        return responseContents.toString();
    }

    /**
     * Performs a POST request on a given endpoint, and posts the given data.
     *
     * @param endpoint The endpoint to send the request to.
     * @param data The data to post to the endpoint.
     * @throws IOException
     **/
    public void post(String endpoint, String data) throws Exception {
        BufferedReader reader;
        String line;
        StringBuffer responseContents = new StringBuffer();

        URL url = new URL(endpoint);

        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");

        connection.setDoOutput(true);

        String body = data;

        try(OutputStream outStream = connection.getOutputStream()) {
            byte[] input = body.getBytes("utf-8");
            outStream.write(input, 0, input.length);
        } catch(Exception e) {
            System.out.println(e);
        }

        int status = connection.getResponseCode();

        if (status > 299) {
            throw new Exception(String.valueOf(connection.getErrorStream()));
        }
    }
}