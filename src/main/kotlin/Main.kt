import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers


fun main(args: Array<String>) {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=15"))
        .build()
    val response = client
        .send(request, BodyHandlers.ofString())
    val json = response.body()

    println(json)

}