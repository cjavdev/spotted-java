// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaylistServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val playlistServiceAsync = client.me().playlists()

        val pageFuture = playlistServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
