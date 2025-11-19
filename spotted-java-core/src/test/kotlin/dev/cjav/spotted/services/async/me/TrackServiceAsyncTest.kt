// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.tracks.TrackCheckParams
import dev.cjav.spotted.models.me.tracks.TrackRemoveParams
import dev.cjav.spotted.models.me.tracks.TrackSaveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TrackServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackServiceAsync = client.me().tracks()

        val pageFuture = trackServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackServiceAsync = client.me().tracks()

        val responseFuture =
            trackServiceAsync.check(
                TrackCheckParams.builder()
                    .ids("7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B")
                    .build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackServiceAsync = client.me().tracks()

        val future = trackServiceAsync.remove(TrackRemoveParams.builder().addId("string").build())

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun save() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val trackServiceAsync = client.me().tracks()

        val future =
            trackServiceAsync.save(
                TrackSaveParams.builder()
                    .addId("string")
                    .addTimestampedId(
                        TrackSaveParams.TimestampedId.builder()
                            .id("id")
                            .addedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
