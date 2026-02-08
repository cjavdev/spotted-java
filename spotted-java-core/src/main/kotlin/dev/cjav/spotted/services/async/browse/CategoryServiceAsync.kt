// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.browse

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsParams
import dev.cjav.spotted.models.browse.categories.CategoryGetPlaylistsResponse
import dev.cjav.spotted.models.browse.categories.CategoryListPageAsync
import dev.cjav.spotted.models.browse.categories.CategoryListParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveParams
import dev.cjav.spotted.models.browse.categories.CategoryRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CategoryServiceAsync

    /**
     * Get a single category used to tag items in Spotify (on, for example, the Spotify player’s
     * “Browse” tab).
     */
    @Deprecated("deprecated")
    fun retrieve(categoryId: String): CompletableFuture<CategoryRetrieveResponse> =
        retrieve(categoryId, CategoryRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        categoryId: String,
        params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CategoryRetrieveResponse> =
        retrieve(params.toBuilder().categoryId(categoryId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        categoryId: String,
        params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
    ): CompletableFuture<CategoryRetrieveResponse> =
        retrieve(categoryId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CategoryRetrieveResponse>

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: CategoryRetrieveParams): CompletableFuture<CategoryRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        categoryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CategoryRetrieveResponse> =
        retrieve(categoryId, CategoryRetrieveParams.none(), requestOptions)

    /**
     * Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s
     * “Browse” tab).
     */
    @Deprecated("deprecated")
    fun list(): CompletableFuture<CategoryListPageAsync> = list(CategoryListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CategoryListParams = CategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CategoryListPageAsync>

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CategoryListParams = CategoryListParams.none()
    ): CompletableFuture<CategoryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): CompletableFuture<CategoryListPageAsync> =
        list(CategoryListParams.none(), requestOptions)

    /** Get a list of Spotify playlists tagged with a particular category. */
    @Deprecated("deprecated")
    fun getPlaylists(categoryId: String): CompletableFuture<CategoryGetPlaylistsResponse> =
        getPlaylists(categoryId, CategoryGetPlaylistsParams.none())

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        categoryId: String,
        params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CategoryGetPlaylistsResponse> =
        getPlaylists(params.toBuilder().categoryId(categoryId).build(), requestOptions)

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        categoryId: String,
        params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
    ): CompletableFuture<CategoryGetPlaylistsResponse> =
        getPlaylists(categoryId, params, RequestOptions.none())

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        params: CategoryGetPlaylistsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CategoryGetPlaylistsResponse>

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        params: CategoryGetPlaylistsParams
    ): CompletableFuture<CategoryGetPlaylistsResponse> = getPlaylists(params, RequestOptions.none())

    /** @see getPlaylists */
    @Deprecated("deprecated")
    fun getPlaylists(
        categoryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CategoryGetPlaylistsResponse> =
        getPlaylists(categoryId, CategoryGetPlaylistsParams.none(), requestOptions)

    /**
     * A view of [CategoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse/categories/{category_id}`, but is otherwise
         * the same as [CategoryServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(
            categoryId: String
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>> =
            retrieve(categoryId, CategoryRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            categoryId: String,
            params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>> =
            retrieve(params.toBuilder().categoryId(categoryId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            categoryId: String,
            params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>> =
            retrieve(categoryId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>>

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: CategoryRetrieveParams
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            categoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CategoryRetrieveResponse>> =
            retrieve(categoryId, CategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/categories`, but is otherwise the same as
         * [CategoryServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(): CompletableFuture<HttpResponseFor<CategoryListPageAsync>> =
            list(CategoryListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: CategoryListParams = CategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CategoryListPageAsync>>

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: CategoryListParams = CategoryListParams.none()
        ): CompletableFuture<HttpResponseFor<CategoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CategoryListPageAsync>> =
            list(CategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /browse/categories/{category_id}/playlists`, but is
         * otherwise the same as [CategoryServiceAsync.getPlaylists].
         */
        @Deprecated("deprecated")
        fun getPlaylists(
            categoryId: String
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>> =
            getPlaylists(categoryId, CategoryGetPlaylistsParams.none())

        /** @see getPlaylists */
        @Deprecated("deprecated")
        fun getPlaylists(
            categoryId: String,
            params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>> =
            getPlaylists(params.toBuilder().categoryId(categoryId).build(), requestOptions)

        /** @see getPlaylists */
        @Deprecated("deprecated")
        fun getPlaylists(
            categoryId: String,
            params: CategoryGetPlaylistsParams = CategoryGetPlaylistsParams.none(),
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>> =
            getPlaylists(categoryId, params, RequestOptions.none())

        /** @see getPlaylists */
        @Deprecated("deprecated")
        fun getPlaylists(
            params: CategoryGetPlaylistsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>>

        /** @see getPlaylists */
        @Deprecated("deprecated")
        fun getPlaylists(
            params: CategoryGetPlaylistsParams
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>> =
            getPlaylists(params, RequestOptions.none())

        /** @see getPlaylists */
        @Deprecated("deprecated")
        fun getPlaylists(
            categoryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CategoryGetPlaylistsResponse>> =
            getPlaylists(categoryId, CategoryGetPlaylistsParams.none(), requestOptions)
    }
}
