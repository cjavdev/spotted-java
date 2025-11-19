// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.playlists.PlaylistListPageAsync
import dev.cjav.spotted.models.me.playlists.PlaylistListParams
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

    /** Get a list of the playlists owned or followed by the current Spotify user. */
    fun list(): CompletableFuture<PlaylistListPageAsync> = list(PlaylistListParams.none())

    /** @see list */
    fun list(
        params: PlaylistListParams = PlaylistListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaylistListPageAsync>

    /** @see list */
    fun list(
        params: PlaylistListParams = PlaylistListParams.none()
    ): CompletableFuture<PlaylistListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlaylistListPageAsync> =
        list(PlaylistListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /me/playlists`, but is otherwise the same as
         * [PlaylistServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(PlaylistListParams.none())

        /** @see list */
        fun list(
            params: PlaylistListParams = PlaylistListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>>

        /** @see list */
        fun list(
            params: PlaylistListParams = PlaylistListParams.none()
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> =
            list(PlaylistListParams.none(), requestOptions)
    }
}
