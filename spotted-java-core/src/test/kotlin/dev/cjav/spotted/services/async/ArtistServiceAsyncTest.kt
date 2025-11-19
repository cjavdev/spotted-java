// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveParams
import dev.cjav.spotted.models.artists.ArtistTopTracksParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ArtistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val artistServiceAsync = client.artists()

        val artistObjectFuture = artistServiceAsync.retrieve("0TnOYISbd1XYRBk9myaseg")

        val artistObject = artistObjectFuture.get()
        artistObject.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val artistServiceAsync = client.artists()

        val responseFuture =
            artistServiceAsync.bulkRetrieve(
                ArtistBulkRetrieveParams.builder()
                    .ids("2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listAlbums() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val artistServiceAsync = client.artists()

        val pageFuture = artistServiceAsync.listAlbums("0TnOYISbd1XYRBk9myaseg")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRelatedArtists() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val artistServiceAsync = client.artists()

        val responseFuture = artistServiceAsync.listRelatedArtists("0TnOYISbd1XYRBk9myaseg")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun topTracks() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val artistServiceAsync = client.artists()

        val responseFuture =
            artistServiceAsync.topTracks(
                ArtistTopTracksParams.builder().id("0TnOYISbd1XYRBk9myaseg").market("ES").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
