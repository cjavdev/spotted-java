// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.shows.ShowCheckParams
import dev.cjav.spotted.models.me.shows.ShowListPageAsync
import dev.cjav.spotted.models.me.shows.ShowListParams
import dev.cjav.spotted.models.me.shows.ShowRemoveParams
import dev.cjav.spotted.models.me.shows.ShowSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowServiceAsync

    /**
     * Get a list of shows saved in the current Spotify user's library. Optional parameters can be
     * used to limit the number of shows returned.
     */
    fun list(): CompletableFuture<ShowListPageAsync> = list(ShowListParams.none())

    /** @see list */
    fun list(
        params: ShowListParams = ShowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowListPageAsync>

    /** @see list */
    fun list(params: ShowListParams = ShowListParams.none()): CompletableFuture<ShowListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ShowListPageAsync> =
        list(ShowListParams.none(), requestOptions)

    /** Check if one or more shows is already saved in the current Spotify user's library. */
    fun check(params: ShowCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: ShowCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** Delete one or more shows from current Spotify user's library. */
    fun remove(): CompletableFuture<Void?> = remove(ShowRemoveParams.none())

    /** @see remove */
    fun remove(
        params: ShowRemoveParams = ShowRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see remove */
    fun remove(params: ShowRemoveParams = ShowRemoveParams.none()): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(requestOptions: RequestOptions): CompletableFuture<Void?> =
        remove(ShowRemoveParams.none(), requestOptions)

    /** Save one or more shows to current Spotify user's library. */
    fun save(): CompletableFuture<Void?> = save(ShowSaveParams.none())

    /** @see save */
    fun save(
        params: ShowSaveParams = ShowSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see save */
    fun save(params: ShowSaveParams = ShowSaveParams.none()): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(requestOptions: RequestOptions): CompletableFuture<Void?> =
        save(ShowSaveParams.none(), requestOptions)

    /** A view of [ShowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ShowListPageAsync>> =
            list(ShowListParams.none())

        /** @see list */
        fun list(
            params: ShowListParams = ShowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowListPageAsync>>

        /** @see list */
        fun list(
            params: ShowListParams = ShowListParams.none()
        ): CompletableFuture<HttpResponseFor<ShowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ShowListPageAsync>> =
            list(ShowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/shows/contains`, but is otherwise the same as
         * [ShowServiceAsync.check].
         */
        fun check(params: ShowCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: ShowCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.remove].
         */
        fun remove(): CompletableFuture<HttpResponse> = remove(ShowRemoveParams.none())

        /** @see remove */
        fun remove(
            params: ShowRemoveParams = ShowRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see remove */
        fun remove(
            params: ShowRemoveParams = ShowRemoveParams.none()
        ): CompletableFuture<HttpResponse> = remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            remove(ShowRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/shows`, but is otherwise the same as
         * [ShowServiceAsync.save].
         */
        fun save(): CompletableFuture<HttpResponse> = save(ShowSaveParams.none())

        /** @see save */
        fun save(
            params: ShowSaveParams = ShowSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see save */
        fun save(params: ShowSaveParams = ShowSaveParams.none()): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            save(ShowSaveParams.none(), requestOptions)
    }
}
