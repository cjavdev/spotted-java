// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterBulkRetrieveResponse
import dev.cjav.spotted.models.chapters.ChapterRetrieveParams
import dev.cjav.spotted.models.chapters.ChapterRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChapterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChapterServiceAsync

    /**
     * Get Spotify catalog information for a single audiobook chapter. Chapters are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(id: String): CompletableFuture<ChapterRetrieveResponse> =
        retrieve(id, ChapterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChapterRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
    ): CompletableFuture<ChapterRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChapterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChapterRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ChapterRetrieveParams): CompletableFuture<ChapterRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChapterRetrieveResponse> =
        retrieve(id, ChapterRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobook chapters identified by their Spotify
     * IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and
     * Australia markets.
     */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: ChapterBulkRetrieveParams
    ): CompletableFuture<ChapterBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: ChapterBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChapterBulkRetrieveResponse>

    /**
     * A view of [ChapterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChapterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /chapters/{id}`, but is otherwise the same as
         * [ChapterServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>> =
            retrieve(id, ChapterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChapterRetrieveParams = ChapterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChapterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ChapterRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChapterRetrieveResponse>> =
            retrieve(id, ChapterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /chapters`, but is otherwise the same as
         * [ChapterServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: ChapterBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChapterBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: ChapterBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChapterBulkRetrieveResponse>>
    }
}
