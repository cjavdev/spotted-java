// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.albums.AlbumCheckParams
import dev.cjav.spotted.models.me.albums.AlbumListPageAsync
import dev.cjav.spotted.models.me.albums.AlbumListParams
import dev.cjav.spotted.models.me.albums.AlbumRemoveParams
import dev.cjav.spotted.models.me.albums.AlbumSaveParams
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
     *
     * **Note:** This endpoint is deprecated. Use
     * [Check User's Saved Items](/documentation/web-api/reference/check-library-contains) instead.
     */
    @Deprecated("deprecated")
    fun check(params: AlbumCheckParams): CompletableFuture<List<Boolean>> =
        check(params, RequestOptions.none())

    /** @see check */
    @Deprecated("deprecated")
    fun check(
        params: AlbumCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Boolean>>

    /**
     * Remove one or more albums from the current user's 'Your Music' library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Remove Items from Library](/documentation/web-api/reference/remove-library-items) instead.
     */
    @Deprecated("deprecated")
    fun remove(): CompletableFuture<Void?> = remove(AlbumRemoveParams.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(
        params: AlbumRemoveParams = AlbumRemoveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(params: AlbumRemoveParams = AlbumRemoveParams.none()): CompletableFuture<Void?> =
        remove(params, RequestOptions.none())

    /** @see remove */
    @Deprecated("deprecated")
    fun remove(requestOptions: RequestOptions): CompletableFuture<Void?> =
        remove(AlbumRemoveParams.none(), requestOptions)

    /**
     * Save one or more albums to the current user's 'Your Music' library.
     *
     * **Note:** This endpoint is deprecated. Use
     * [Save Items to Library](/documentation/web-api/reference/save-library-items) instead.
     */
    @Deprecated("deprecated") fun save(): CompletableFuture<Void?> = save(AlbumSaveParams.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(
        params: AlbumSaveParams = AlbumSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see save */
    @Deprecated("deprecated")
    fun save(params: AlbumSaveParams = AlbumSaveParams.none()): CompletableFuture<Void?> =
        save(params, RequestOptions.none())

    /** @see save */
    @Deprecated("deprecated")
    fun save(requestOptions: RequestOptions): CompletableFuture<Void?> =
        save(AlbumSaveParams.none(), requestOptions)

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
        @Deprecated("deprecated")
        fun check(params: AlbumCheckParams): CompletableFuture<HttpResponseFor<List<Boolean>>> =
            check(params, RequestOptions.none())

        /** @see check */
        @Deprecated("deprecated")
        fun check(
            params: AlbumCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Boolean>>>

        /**
         * Returns a raw HTTP response for `delete /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.remove].
         */
        @Deprecated("deprecated")
        fun remove(): CompletableFuture<HttpResponse> = remove(AlbumRemoveParams.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: AlbumRemoveParams = AlbumRemoveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(
            params: AlbumRemoveParams = AlbumRemoveParams.none()
        ): CompletableFuture<HttpResponse> = remove(params, RequestOptions.none())

        /** @see remove */
        @Deprecated("deprecated")
        fun remove(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            remove(AlbumRemoveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/albums`, but is otherwise the same as
         * [AlbumServiceAsync.save].
         */
        @Deprecated("deprecated")
        fun save(): CompletableFuture<HttpResponse> = save(AlbumSaveParams.none())

        /** @see save */
        @Deprecated("deprecated")
        fun save(
            params: AlbumSaveParams = AlbumSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see save */
        @Deprecated("deprecated")
        fun save(
            params: AlbumSaveParams = AlbumSaveParams.none()
        ): CompletableFuture<HttpResponse> = save(params, RequestOptions.none())

        /** @see save */
        @Deprecated("deprecated")
        fun save(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            save(AlbumSaveParams.none(), requestOptions)
    }
}
