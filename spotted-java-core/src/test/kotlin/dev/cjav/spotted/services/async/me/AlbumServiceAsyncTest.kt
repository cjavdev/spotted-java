// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.albums.AlbumCheckParams
import dev.cjav.spotted.models.me.albums.AlbumRemoveParams
import dev.cjav.spotted.models.me.albums.AlbumSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AlbumServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.me().albums()

        val pageFuture = albumServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.me().albums()

        val responseFuture =
            albumServiceAsync.check(
                AlbumCheckParams.builder()
                    .ids("382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc")
                    .build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.me().albums()

        val future =
            albumServiceAsync.remove(
                AlbumRemoveParams.builder().addId("string").published(true).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun save() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val albumServiceAsync = client.me().albums()

        val future =
            albumServiceAsync.save(
                AlbumSaveParams.builder().addId("string").published(true).build()
            )

        val response = future.get()
    }
}
