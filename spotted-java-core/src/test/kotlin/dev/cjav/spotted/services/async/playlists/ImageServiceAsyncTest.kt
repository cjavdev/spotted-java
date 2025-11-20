// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ImageServiceAsyncTest {

    @Test
    fun update(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val imageServiceAsync = client.playlists().images()
        stubFor(put(anyUrl()).willReturn(ok().withBody("abc")))

        val imageFuture = imageServiceAsync.update("3cEYpjA9oz9GiPac4AsH4n", "some content")

        val image = imageFuture.get()
        assertThat(image.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val imageServiceAsync = client.playlists().images()

        val imageObjectsFuture = imageServiceAsync.list("3cEYpjA9oz9GiPac4AsH4n")

        val imageObjects = imageObjectsFuture.get()
        imageObjects.forEach { it.validate() }
    }
}
