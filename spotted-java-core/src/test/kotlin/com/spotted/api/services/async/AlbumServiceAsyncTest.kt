// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.albums.AlbumListParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlbumServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
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
    fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.albums()

        val albumsFuture =
            albumServiceAsync.list(
                AlbumListParams.builder()
                    .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                    .market("ES")
                    .build()
            )

        val albums = albumsFuture.get()
        albums.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTracks() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val albumServiceAsync = client.albums()

        val pageFuture = albumServiceAsync.listTracks("4aawyAB9vmqN3uQ7FjRGTy")

        val page = pageFuture.get()
        page.response().validate()
    }
}
