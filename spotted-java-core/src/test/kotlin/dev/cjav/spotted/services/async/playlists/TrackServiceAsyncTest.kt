// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.playlists.tracks.TrackAddParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveParams
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TrackServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val trackServiceAsync = client.playlists().tracks()

        val trackFuture =
            trackServiceAsync.update(
                TrackUpdateParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .insertBefore(3L)
                    .rangeLength(2L)
                    .rangeStart(1L)
                    .snapshotId("snapshot_id")
                    .addUris("string")
                    .build()
            )

        val track = trackFuture.get()
        track.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val trackServiceAsync = client.playlists().tracks()

        val pageFuture = trackServiceAsync.list("3cEYpjA9oz9GiPac4AsH4n")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val trackServiceAsync = client.playlists().tracks()

        val responseFuture =
            trackServiceAsync.add(
                TrackAddParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .position(0L)
                    .addUris("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val trackServiceAsync = client.playlists().tracks()

        val trackFuture =
            trackServiceAsync.remove(
                TrackRemoveParams.builder()
                    .playlistId("3cEYpjA9oz9GiPac4AsH4n")
                    .addTrack(TrackRemoveParams.Track.builder().uri("uri").build())
                    .snapshotId("snapshot_id")
                    .build()
            )

        val track = trackFuture.get()
        track.validate()
    }
}
