// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.TestServerExtension
import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.core.JsonValue
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingParams
import dev.cjav.spotted.models.me.player.PlayerGetStateParams
import dev.cjav.spotted.models.me.player.PlayerPausePlaybackParams
import dev.cjav.spotted.models.me.player.PlayerSeekToPositionParams
import dev.cjav.spotted.models.me.player.PlayerSetRepeatModeParams
import dev.cjav.spotted.models.me.player.PlayerSetVolumeParams
import dev.cjav.spotted.models.me.player.PlayerSkipNextParams
import dev.cjav.spotted.models.me.player.PlayerSkipPreviousParams
import dev.cjav.spotted.models.me.player.PlayerStartPlaybackParams
import dev.cjav.spotted.models.me.player.PlayerToggleShuffleParams
import dev.cjav.spotted.models.me.player.PlayerTransferParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlayerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getCurrentlyPlaying() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val responseFuture =
            playerServiceAsync.getCurrentlyPlaying(
                PlayerGetCurrentlyPlayingParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDevices() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val responseFuture = playerServiceAsync.getDevices()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getState() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val responseFuture =
            playerServiceAsync.getState(
                PlayerGetStateParams.builder()
                    .additionalTypes("additional_types")
                    .market("ES")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRecentlyPlayed() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val pageFuture = playerServiceAsync.listRecentlyPlayed()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pausePlayback() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.pausePlayback(
                PlayerPausePlaybackParams.builder()
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun seekToPosition() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.seekToPosition(
                PlayerSeekToPositionParams.builder()
                    .positionMs(25000L)
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setRepeatMode() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.setRepeatMode(
                PlayerSetRepeatModeParams.builder()
                    .state("context")
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setVolume() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.setVolume(
                PlayerSetVolumeParams.builder()
                    .volumePercent(50L)
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun skipNext() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.skipNext(
                PlayerSkipNextParams.builder()
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun skipPrevious() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.skipPrevious(
                PlayerSkipPreviousParams.builder()
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun startPlayback() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.startPlayback(
                PlayerStartPlaybackParams.builder()
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .contextUri("spotify:album:5ht7ItJgpBH7W6vJ5BqpPr")
                    .offset(
                        PlayerStartPlaybackParams.Offset.builder()
                            .putAdditionalProperty("position", JsonValue.from("bar"))
                            .build()
                    )
                    .positionMs(0L)
                    .addUris("string")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun toggleShuffle() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.toggleShuffle(
                PlayerToggleShuffleParams.builder()
                    .state(true)
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun transfer() {
        val client =
            SpottedOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val playerServiceAsync = client.me().player()

        val future =
            playerServiceAsync.transfer(
                PlayerTransferParams.builder()
                    .addDeviceId("74ASZWbe4lXaubB36ztrGX")
                    .play(true)
                    .build()
            )

        val response = future.get()
    }
}
