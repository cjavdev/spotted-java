// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.playlists.PlaylistRetrieveParams
import com.spotted.api.models.playlists.PlaylistRetrieveResponse
import com.spotted.api.models.playlists.PlaylistUpdateParams
import com.spotted.api.services.async.playlists.FollowerServiceAsync
import com.spotted.api.services.async.playlists.ImageServiceAsync
import com.spotted.api.services.async.playlists.TrackServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlaylistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaylistServiceAsync

    fun tracks(): TrackServiceAsync

    fun followers(): FollowerServiceAsync

    fun images(): ImageServiceAsync

    /** Get a playlist owned by a Spotify user. */
    fun retrieve(playlistId: String): CompletableFuture<PlaylistRetrieveResponse> =
        retrieve(playlistId, PlaylistRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        playlistId: String,
        params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistRetrieveResponse> =
        retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        playlistId: String,
        params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
    ): CompletableFuture<PlaylistRetrieveResponse> =
        retrieve(playlistId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlaylistRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PlaylistRetrieveParams): CompletableFuture<PlaylistRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaylistRetrieveResponse> =
        retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

    /**
     * Change a playlist's name and public/private state. (The user must, of course, own the
     * playlist.)
     */
    fun update(playlistId: String): CompletableFuture<Void?> =
        update(playlistId, PlaylistUpdateParams.none())

    /** @see update */
    fun update(
        playlistId: String,
        params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    fun update(
        playlistId: String,
        params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
    ): CompletableFuture<Void?> = update(playlistId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlaylistUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: PlaylistUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(playlistId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(playlistId, PlaylistUpdateParams.none(), requestOptions)

    /**
     * A view of [PlaylistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaylistServiceAsync.WithRawResponse

        fun tracks(): TrackServiceAsync.WithRawResponse

        fun followers(): FollowerServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistServiceAsync.retrieve].
         */
        fun retrieve(
            playlistId: String
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>> =
            retrieve(playlistId, PlaylistRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            playlistId: String,
            params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>> =
            retrieve(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            playlistId: String,
            params: PlaylistRetrieveParams = PlaylistRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>> =
            retrieve(playlistId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlaylistRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PlaylistRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaylistRetrieveResponse>> =
            retrieve(playlistId, PlaylistRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}`, but is otherwise the same
         * as [PlaylistServiceAsync.update].
         */
        fun update(playlistId: String): CompletableFuture<HttpResponse> =
            update(playlistId, PlaylistUpdateParams.none())

        /** @see update */
        fun update(
            playlistId: String,
            params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        fun update(
            playlistId: String,
            params: PlaylistUpdateParams = PlaylistUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(playlistId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlaylistUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: PlaylistUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(playlistId, PlaylistUpdateParams.none(), requestOptions)
    }
}
