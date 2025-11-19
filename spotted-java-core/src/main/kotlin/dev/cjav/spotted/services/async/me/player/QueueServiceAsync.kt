// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me.player

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.player.queue.QueueAddParams
import dev.cjav.spotted.models.me.player.queue.QueueGetParams
import dev.cjav.spotted.models.me.player.queue.QueueGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync

    /**
     * Add an item to be played next in the user's current playback queue. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    fun add(params: QueueAddParams): CompletableFuture<Void?> = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: QueueAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the list of objects that make up the user's queue. */
    fun get(): CompletableFuture<QueueGetResponse> = get(QueueGetParams.none())

    /** @see get */
    fun get(
        params: QueueGetParams = QueueGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueGetResponse>

    /** @see get */
    fun get(params: QueueGetParams = QueueGetParams.none()): CompletableFuture<QueueGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<QueueGetResponse> =
        get(QueueGetParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /me/player/queue`, but is otherwise the same as
         * [QueueServiceAsync.add].
         */
        fun add(params: QueueAddParams): CompletableFuture<HttpResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: QueueAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /me/player/queue`, but is otherwise the same as
         * [QueueServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<QueueGetResponse>> = get(QueueGetParams.none())

        /** @see get */
        fun get(
            params: QueueGetParams = QueueGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueGetResponse>>

        /** @see get */
        fun get(
            params: QueueGetParams = QueueGetParams.none()
        ): CompletableFuture<HttpResponseFor<QueueGetResponse>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QueueGetResponse>> =
            get(QueueGetParams.none(), requestOptions)
    }
}
