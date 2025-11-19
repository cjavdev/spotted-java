// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudiobookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val audiobookFuture =
            audiobookServiceAsync.retrieve(
                AudiobookRetrieveParams.builder().id("7iHfbu1YPACw6oZPAFJtqe").market("ES").build()
            )

        val audiobook = audiobookFuture.get()
        audiobook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val responseFuture =
            audiobookServiceAsync.bulkRetrieve(
                AudiobookBulkRetrieveParams.builder()
                    .ids("18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listChapters() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val audiobookServiceAsync = client.audiobooks()

        val pageFuture = audiobookServiceAsync.listChapters("7iHfbu1YPACw6oZPAFJtqe")

        val page = pageFuture.get()
        page.response().validate()
    }
}
