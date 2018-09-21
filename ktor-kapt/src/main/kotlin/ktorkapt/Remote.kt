package ktorkapt

import io.ktor.client.HttpClient
import io.ktor.client.request.request

class Remote {

  suspend inline fun <reified T> request(): T {
    return HttpClient().request()
  }

  suspend inline fun <reified T> get(): T =
    request()

  suspend fun get2() {
    return get()
  }
}