// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.shows.ShowCheckParams
import dev.cjav.spotted.models.me.shows.ShowRemoveParams
import dev.cjav.spotted.models.me.shows.ShowSaveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShowServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.me().shows()

        val pageFuture = showServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.me().shows()

        val responseFuture =
            showServiceAsync.check(
                ShowCheckParams.builder()
                    .ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.me().shows()

        val future =
            showServiceAsync.remove(
                ShowRemoveParams.builder().addId("string").published(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun save() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.me().shows()

        val future =
            showServiceAsync.save(ShowSaveParams.builder().addId("string").published(true).build())

        val response = future.get()
    }
}
