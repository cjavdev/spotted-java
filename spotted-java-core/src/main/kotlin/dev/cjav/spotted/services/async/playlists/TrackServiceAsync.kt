// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.playlists

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.playlists.tracks.TrackAddParams
import dev.cjav.spotted.models.playlists.tracks.TrackAddResponse
import dev.cjav.spotted.models.playlists.tracks.TrackListPageAsync
import dev.cjav.spotted.models.playlists.tracks.TrackListParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveParams
import dev.cjav.spotted.models.playlists.tracks.TrackRemoveResponse
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateParams
import dev.cjav.spotted.models.playlists.tracks.TrackUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TrackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrackServiceAsync

    /**
     * Either reorder or replace items in a playlist depending on the request's parameters. To
     * reorder items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in
     * the request's body. To replace items, include `uris` as either a query parameter or in the
     * request's body. Replacing items in a playlist will overwrite its existing items. This
     * operation can be used for replacing or clearing items in a playlist. <br/> **Note**: Replace
     * and reorder are mutually exclusive operations which share the same endpoint, but have
     * different parameters. These operations can't be applied together in a single request.
     */
    fun update(playlistId: String): CompletableFuture<TrackUpdateResponse> =
        update(playlistId, TrackUpdateParams.none())

    /** @see update */
    fun update(
        playlistId: String,
        params: TrackUpdateParams = TrackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackUpdateResponse> =
        update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see update */
    fun update(
        playlistId: String,
        params: TrackUpdateParams = TrackUpdateParams.none(),
    ): CompletableFuture<TrackUpdateResponse> = update(playlistId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TrackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackUpdateResponse>

    /** @see update */
    fun update(params: TrackUpdateParams): CompletableFuture<TrackUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrackUpdateResponse> =
        update(playlistId, TrackUpdateParams.none(), requestOptions)

    /**
     * Get full details of the items of a playlist owned by a Spotify user.
     *
     * **Note**: This endpoint is only accessible for playlists owned by the current user.
     */
    fun list(playlistId: String): CompletableFuture<TrackListPageAsync> =
        list(playlistId, TrackListParams.none())

    /** @see list */
    fun list(
        playlistId: String,
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackListPageAsync> =
        list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see list */
    fun list(
        playlistId: String,
        params: TrackListParams = TrackListParams.none(),
    ): CompletableFuture<TrackListPageAsync> = list(playlistId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TrackListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackListPageAsync>

    /** @see list */
    fun list(params: TrackListParams): CompletableFuture<TrackListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrackListPageAsync> =
        list(playlistId, TrackListParams.none(), requestOptions)

    /** Add one or more items to a user's playlist. */
    fun add(playlistId: String): CompletableFuture<TrackAddResponse> =
        add(playlistId, TrackAddParams.none())

    /** @see add */
    fun add(
        playlistId: String,
        params: TrackAddParams = TrackAddParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackAddResponse> =
        add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see add */
    fun add(
        playlistId: String,
        params: TrackAddParams = TrackAddParams.none(),
    ): CompletableFuture<TrackAddResponse> = add(playlistId, params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TrackAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackAddResponse>

    /** @see add */
    fun add(params: TrackAddParams): CompletableFuture<TrackAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        playlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrackAddResponse> = add(playlistId, TrackAddParams.none(), requestOptions)

    /** Remove one or more items from a user's playlist. */
    fun remove(
        playlistId: String,
        params: TrackRemoveParams,
    ): CompletableFuture<TrackRemoveResponse> = remove(playlistId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        playlistId: String,
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRemoveResponse> =
        remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

    /** @see remove */
    fun remove(params: TrackRemoveParams): CompletableFuture<TrackRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TrackRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackRemoveResponse>

    /** A view of [TrackServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TrackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.update].
         */
        fun update(playlistId: String): CompletableFuture<HttpResponseFor<TrackUpdateResponse>> =
            update(playlistId, TrackUpdateParams.none())

        /** @see update */
        fun update(
            playlistId: String,
            params: TrackUpdateParams = TrackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackUpdateResponse>> =
            update(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see update */
        fun update(
            playlistId: String,
            params: TrackUpdateParams = TrackUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TrackUpdateResponse>> =
            update(playlistId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TrackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackUpdateResponse>>

        /** @see update */
        fun update(
            params: TrackUpdateParams
        ): CompletableFuture<HttpResponseFor<TrackUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrackUpdateResponse>> =
            update(playlistId, TrackUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.list].
         */
        fun list(playlistId: String): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(playlistId, TrackListParams.none())

        /** @see list */
        fun list(
            playlistId: String,
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see list */
        fun list(
            playlistId: String,
            params: TrackListParams = TrackListParams.none(),
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(playlistId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TrackListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>>

        /** @see list */
        fun list(params: TrackListParams): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(playlistId, TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /playlists/{playlist_id}/tracks`, but is otherwise
         * the same as [TrackServiceAsync.add].
         */
        fun add(playlistId: String): CompletableFuture<HttpResponseFor<TrackAddResponse>> =
            add(playlistId, TrackAddParams.none())

        /** @see add */
        fun add(
            playlistId: String,
            params: TrackAddParams = TrackAddParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackAddResponse>> =
            add(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see add */
        fun add(
            playlistId: String,
            params: TrackAddParams = TrackAddParams.none(),
        ): CompletableFuture<HttpResponseFor<TrackAddResponse>> =
            add(playlistId, params, RequestOptions.none())

        /** @see add */
        fun add(
            params: TrackAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackAddResponse>>

        /** @see add */
        fun add(params: TrackAddParams): CompletableFuture<HttpResponseFor<TrackAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            playlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrackAddResponse>> =
            add(playlistId, TrackAddParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /playlists/{playlist_id}/tracks`, but is
         * otherwise the same as [TrackServiceAsync.remove].
         */
        fun remove(
            playlistId: String,
            params: TrackRemoveParams,
        ): CompletableFuture<HttpResponseFor<TrackRemoveResponse>> =
            remove(playlistId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            playlistId: String,
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRemoveResponse>> =
            remove(params.toBuilder().playlistId(playlistId).build(), requestOptions)

        /** @see remove */
        fun remove(
            params: TrackRemoveParams
        ): CompletableFuture<HttpResponseFor<TrackRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: TrackRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackRemoveResponse>>
    }
}
