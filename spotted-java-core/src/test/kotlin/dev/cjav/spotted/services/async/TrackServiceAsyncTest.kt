// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val trackServiceAsync = client.tracks()

        val trackObjectFuture =
            trackServiceAsync.retrieve(
                TrackRetrieveParams.builder().id("11dFghVXANMlKmJXsNCbNl").market("ES").build()
            )

        val trackObject = trackObjectFuture.get()
        trackObject.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkRetrieve() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val trackServiceAsync = client.tracks()

        val responseFuture =
            trackServiceAsync.bulkRetrieve(
                TrackBulkRetrieveParams.builder()
                    .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
