// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.users

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.users.playlists.PlaylistCreateParams
import com.spotted.api.models.users.playlists.PlaylistCreateResponse
import com.spotted.api.models.users.playlists.PlaylistListPageAsync
import com.spotted.api.models.users.playlists.PlaylistListParams
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

    /**
     * Create a playlist for a Spotify user. (The playlist will be empty until you
     * [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is
     * generally limited to a maximum of 11000 playlists.
     */
    fun create(
        userId: String,
        params: PlaylistCreateParams,
    ): CompletableFuture<PlaylistCreateResponse> = create(userId, params, RequestOptions.none())

    /** @see create */
    fun create(
        userId: String,
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistCreateResponse> =
        create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see create */
    fun create(params: PlaylistCreateParams): CompletableFuture<PlaylistCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlaylistCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistCreateResponse>

    /** Get a list of the playlists owned or followed by a Spotify user. */
    fun list(userId: String): CompletableFuture<PlaylistListPageAsync> =
        list(userId, PlaylistListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistListPageAsync> =
        list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(
        userId: String,
        params: PlaylistListParams = PlaylistListParams.none(),
    ): CompletableFuture<PlaylistListPageAsync> = list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistListPageAsync>

    /** @see list */
    fun list(params: PlaylistListParams): CompletableFuture<PlaylistListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaylistListPageAsync> =
        list(userId, PlaylistListParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistServiceAsync.create].
         */
        fun create(
            userId: String,
            params: PlaylistCreateParams,
        ): CompletableFuture<HttpResponseFor<PlaylistCreateResponse>> =
            create(userId, params, RequestOptions.none())

        /** @see create */
        fun create(
            userId: String,
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistCreateResponse>> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PlaylistCreateParams
        ): CompletableFuture<HttpResponseFor<PlaylistCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlaylistCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/playlists`, but is otherwise the
         * same as [PlaylistServiceAsync.list].
         */
        fun list(userId: String): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(userId, PlaylistListParams.none())

        /** @see list */
        fun list(
            userId: String,
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        fun list(
            userId: String,
            params: PlaylistListParams = PlaylistListParams.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(userId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>>

        /** @see list */
        fun list(
            params: PlaylistListParams
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(userId, PlaylistListParams.none(), requestOptions)
    }
}
