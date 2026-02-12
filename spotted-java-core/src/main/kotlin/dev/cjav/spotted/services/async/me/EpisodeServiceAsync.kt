// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.episodes.EpisodeCheckParams
import dev.cjav.spotted.models.me.episodes.EpisodeListPageAsync
import dev.cjav.spotted.models.me.episodes.EpisodeListParams
import dev.cjav.spotted.models.me.episodes.EpisodeRemoveParams
import dev.cjav.spotted.models.me.episodes.EpisodeSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EpisodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EpisodeServiceAsync

    /** Get a list of the episodes saved in the current Spotify user's library. */
    fun list(): CompletableFuture<EpisodeListPageAsync> = list(EpisodeListParams.none())

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeListPageAsync>

    /** @see list */
    fun list(
        params: EpisodeListParams = EpisodeListParams.none()
    ): CompletableFuture<EpisodeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EpisodeListPageAsync> =
        list(EpisodeListParams.none(), requestOptions)

    /**
     * Check if one or more episodes is already saved in the current Spotify user's 'Your Episodes'
     * library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(params: EpisodeCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    @Deprecated("deprecated")
    fun check(
        params: EpisodeCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /**
     * Remove one or more episodes from the current user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun remove(): CompletableFuture<Void?> = remove(EpisodeRemoveParams.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(
        params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(params: EpisodeRemoveParams = EpisodeRemoveParams.none()): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions): CompletableFuture<Void?> =
        remove(EpisodeRemoveParams.none(), requestOptions)

    /**
     * Save one or more episodes to the current user's library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated")
    fun save(params: EpisodeSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(
        params: EpisodeSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [EpisodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EpisodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none())

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>>

        /** @see list */
        fun list(
            params: EpisodeListParams = EpisodeListParams.none()
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EpisodeListPageAsync>> =
            list(EpisodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/episodes/contains`, but is otherwise the same as
         * [EpisodeServiceAsync.check].
         */
        @Deprecated("deprecated")
        fun check(params: EpisodeCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        @Deprecated("deprecated")
        fun check(
            params: EpisodeCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.remove].
         */
        @Deprecated("deprecated")
        fun remove(): CompletableFuture<HttpResponse> = remove(EpisodeRemoveParams.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: EpisodeRemoveParams = EpisodeRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: EpisodeRemoveParams = EpisodeRemoveParams.none()
        ): CompletableFuture<HttpResponse> = remove(params, RequestOptions.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            remove(EpisodeRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.save].
         */
        @Deprecated("deprecated")
        fun save(params: EpisodeSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        @Deprecated("deprecated")
        fun save(
            params: EpisodeSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
