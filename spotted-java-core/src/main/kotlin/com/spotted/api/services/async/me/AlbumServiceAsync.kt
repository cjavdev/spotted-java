// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.albums.AlbumCheckParams
import com.spotted.api.models.me.albums.AlbumListPageAsync
import com.spotted.api.models.me.albums.AlbumListParams
import com.spotted.api.models.me.albums.AlbumRemoveParams
import com.spotted.api.models.me.albums.AlbumSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AlbumServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlbumServiceAsync

    /** Get a list of the albums saved in the current Spotify user's 'Your Music' library. */
    fun list(): CompletableFuture<AlbumListPageAsync> = list(AlbumListParams.none())

    /** @see list */
    fun list(
        params: AlbumListParams = AlbumListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumListPageAsync>

    /** @see list */
    fun list(
        params: AlbumListParams = AlbumListParams.none()
    ): CompletableFuture<AlbumListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AlbumListPageAsync> =
        list(AlbumListParams.none(), requestOptions)

    /**
     * Check if one or more albums is already saved in the current Spotify user's 'Your Music'
     * library.
     */
    fun check(params: AlbumCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    fun check(
        params: AlbumCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /** Remove one or more albums from the current user's 'Your Music' library. */
    fun remove(params: AlbumRemoveParams): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: AlbumRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Save one or more albums to the current user's 'Your Music' library. */
    fun save(params: AlbumSaveParams): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(
        params: AlbumSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [AlbumServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlbumServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AlbumListPageAsync>> =
            list(AlbumListParams.none())

        /** @see list */
        fun list(
            params: AlbumListParams = AlbumListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumListPageAsync>>

        /** @see list */
        fun list(
            params: AlbumListParams = AlbumListParams.none()
        ): CompletableFuture<HttpResponseFor<AlbumListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AlbumListPageAsync>> =
            list(AlbumListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/albums/contains`, but is otherwise the same as
         * [AlbumServiceAsync.check].
         */
        fun check(params: AlbumCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        fun check(
            params: AlbumCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.remove].
         */
        fun remove(params: AlbumRemoveParams): CompletableFuture<HttpResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: AlbumRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.save].
         */
        fun save(params: AlbumSaveParams): CompletableFuture<HttpResponse> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(
            params: AlbumSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
