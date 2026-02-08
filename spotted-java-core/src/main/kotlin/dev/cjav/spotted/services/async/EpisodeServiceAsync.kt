// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.EpisodeObject
import dev.cjav.spotted.models.episodes.EpisodeBulkRetrieveParams
import dev.cjav.spotted.models.episodes.EpisodeBulkRetrieveResponse
import dev.cjav.spotted.models.episodes.EpisodeRetrieveParams
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

    /** Get Spotify catalog information for a single episode identified by its unique Spotify ID. */
    fun retrieve(id: String): CompletableFuture<EpisodeObject> =
        retrieve(id, EpisodeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeObject> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
    ): CompletableFuture<EpisodeObject> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EpisodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeObject>

    /** @see retrieve */
    fun retrieve(params: EpisodeRetrieveParams): CompletableFuture<EpisodeObject> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EpisodeObject> =
        retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several episodes based on their Spotify IDs. */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: EpisodeBulkRetrieveParams
    ): CompletableFuture<EpisodeBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: EpisodeBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EpisodeBulkRetrieveResponse>

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
         * Returns a raw HTTP response for `get /episodes/{id}`, but is otherwise the same as
         * [EpisodeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EpisodeObject>> =
            retrieve(id, EpisodeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeObject>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EpisodeRetrieveParams = EpisodeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeObject>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EpisodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeObject>>

        /** @see retrieve */
        fun retrieve(
            params: EpisodeRetrieveParams
        ): CompletableFuture<HttpResponseFor<EpisodeObject>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EpisodeObject>> =
            retrieve(id, EpisodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /episodes`, but is otherwise the same as
         * [EpisodeServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: EpisodeBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<EpisodeBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: EpisodeBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EpisodeBulkRetrieveResponse>>
    }
}
