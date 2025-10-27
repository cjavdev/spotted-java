// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.TestServerExtension
import com.spotted.api.client.okhttp.SpottedOkHttpClientAsync
import com.spotted.api.models.shows.ShowListParams
import com.spotted.api.models.shows.ShowRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShowServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showServiceAsync = client.shows()

        val showFuture =
            showServiceAsync.retrieve(
                ShowRetrieveParams.builder().id("38bS44xjbVVZ3No3ByF1dJ").market("ES").build()
            )

        val show = showFuture.get()
        show.validate()
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
        val showServiceAsync = client.shows()

        val showsFuture =
            showServiceAsync.list(
                ShowListParams.builder()
                    .ids("5CfCWKI5pZ28U0uOzXkDHe,5as3aKmN2k11yfDDDSrvaZ")
                    .market("ES")
                    .build()
            )

        val shows = showsFuture.get()
        shows.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEpisodes() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val showServiceAsync = client.shows()

        val pageFuture = showServiceAsync.listEpisodes("38bS44xjbVVZ3No3ByF1dJ")

        val page = pageFuture.get()
        page.response().validate()
    }
}
