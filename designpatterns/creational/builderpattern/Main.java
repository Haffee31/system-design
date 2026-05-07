package designpatterns.creational.builderpattern;

public class Main {

    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder().url("https://haffee.vercel.app")
                .method("POST")
                .header("Content-Type", "application/json")
                .body("{\"key\": \"value\"}")
                .url("sdfd")
                .build();

        System.out.println("Request: " + request);
    }
}
