// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AlbumServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.albums()

        val albumFuture =
            albumServiceAsync.retrieve(
                AlbumRetrieveParams.builder().id("4aawyAB9vmqN3uQ7FjRGTy").market("ES").build()
            )

        val album = albumFuture.get()
        album.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.albums()

        val responseFuture =
            albumServiceAsync.bulkRetrieve(
                AlbumBulkRetrieveParams.builder()
                    .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTracks() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.albums()

        val pageFuture = albumServiceAsync.listTracks("4aawyAB9vmqN3uQ7FjRGTy")

        val page = pageFuture.get()
        page.response().validate()
    }
}
