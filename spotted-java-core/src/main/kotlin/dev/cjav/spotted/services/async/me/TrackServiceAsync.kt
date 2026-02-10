// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.tracks.TrackCheckParams
import dev.cjav.spotted.models.me.tracks.TrackListPageAsync
import dev.cjav.spotted.models.me.tracks.TrackListParams
import dev.cjav.spotted.models.me.tracks.TrackRemoveParams
import dev.cjav.spotted.models.me.tracks.TrackSaveParams
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

    /** Get a list of the songs saved in the current Spotify user's 'Your Music' library. */
    fun list(): CompletableFuture<TrackListPageAsync> = list(TrackListParams.none())

    /** @see list */
    fun list(
        params: TrackListParams = TrackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackListPageAsync>

    /** @see list */
    fun list(
        params: TrackListParams = TrackListParams.none()
    ): CompletableFuture<TrackListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TrackListPageAsync> =
        list(TrackListParams.none(), requestOptions)

    /**
     * Check if one or more tracks is already saved in the current Spotify user's 'Your Music'
     * library.
     */
    fun check(params: TrackCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: TrackCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** Remove one or more tracks from the current user's 'Your Music' library. */
    @Deprecated("deprecated")
    fun remove(): CompletableFuture<Void?> = remove(TrackRemoveParams.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(
        params: TrackRemoveParams = TrackRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(params: TrackRemoveParams = TrackRemoveParams.none()): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions): CompletableFuture<Void?> =
        remove(TrackRemoveParams.none(), requestOptions)

    /** Save one or more tracks to the current user's 'Your Music' library. */
    @Deprecated("deprecated")
    fun save(params: TrackSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(
        params: TrackSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
         * Returns a raw HTTP response for `get /me/tracks`, but is otherwise the same as
         * [TrackServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(TrackListParams.none())

        /** @see list */
        fun list(
            params: TrackListParams = TrackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>>

        /** @see list */
        fun list(
            params: TrackListParams = TrackListParams.none()
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TrackListPageAsync>> =
            list(TrackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/tracks/contains`, but is otherwise the same as
         * [TrackServiceAsync.check].
         */
        fun check(params: TrackCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: TrackCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/tracks`, but is otherwise the same as
         * [TrackServiceAsync.remove].
         */
        @Deprecated("deprecated")
        fun remove(): CompletableFuture<HttpResponse> = remove(TrackRemoveParams.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: TrackRemoveParams = TrackRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: TrackRemoveParams = TrackRemoveParams.none()
        ): CompletableFuture<HttpResponse> = remove(params, RequestOptions.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            remove(TrackRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/tracks`, but is otherwise the same as
         * [TrackServiceAsync.save].
         */
        @Deprecated("deprecated")
        fun save(params: TrackSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        @Deprecated("deprecated")
        fun save(
            params: TrackSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
