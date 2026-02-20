// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.shows.ShowBulkRetrieveParams
import dev.cjav.spotted.models.shows.ShowRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShowServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.shows()

        val showFuture =
            showServiceAsync.retrieve(
                ShowRetrieveParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").market("ES").build()
            )

        val show = showFuture.get()
        show.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.shows()

        val responseFuture =
            showServiceAsync.bulkRetrieve(
                ShowBulkRetrieveParams.builder()
                    .ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEpisodes() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val showServiceAsync = client.shows()

        val pageFuture = showServiceAsync.listEpisodes("38bS44xjbVVZ3No3ByF1dJ")

        val page = pageFuture.get()
        page.response().validate()
    }
}
