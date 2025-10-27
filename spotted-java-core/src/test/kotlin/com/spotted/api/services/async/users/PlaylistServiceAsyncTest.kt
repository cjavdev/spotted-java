// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.users

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.users.playlists.PlaylistCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaylistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val playlistServiceAsync = client.users().playlists()

        val playlistFuture =
            playlistServiceAsync.create(
                PlaylistCreateParams.builder()
                    .userId("smedjan")
                    .name("New Playlist")
                    .collaborative(true)
                    .description("New playlist description")
                    .public_(false)
                    .build()
            )

        val playlist = playlistFuture.get()
        playlist.validate()
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
        val playlistServiceAsync = client.users().playlists()

        val pageFuture = playlistServiceAsync.list("smedjan")

        val page = pageFuture.get()
        page.response().validate()
    }
}
