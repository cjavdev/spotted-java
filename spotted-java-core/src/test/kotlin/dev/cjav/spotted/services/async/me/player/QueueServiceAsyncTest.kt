// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me.player

import dev.cjav.spotted.client.okhttp.SpottedOkHttpClientAsync
import dev.cjav.spotted.models.me.player.queue.QueueAddParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val queueServiceAsync = client.me().player().queue()

        val future =
            queueServiceAsync.add(
                QueueAddParams.builder()
                    .uri("spotify:track:4iV5W9uYEdYUVa79Axb7Rh")
                    .deviceId("0d1841b0976bae2a3a310dd74c0f3df354899bc8")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = SpottedOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val queueServiceAsync = client.me().player().queue()

        val queueFuture = queueServiceAsync.get()

        val queue = queueFuture.get()
        queue.validate()
    }
}
