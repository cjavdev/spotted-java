// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.TrackObject
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveParams
import dev.cjav.spotted.models.tracks.TrackBulkRetrieveResponse
import dev.cjav.spotted.models.tracks.TrackRetrieveParams
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

    /** Get Spotify catalog information for a single track identified by its unique Spotify ID. */
    fun retrieve(id: String): CompletableFuture<TrackObject> =
        retrieve(id, TrackRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrackRetrieveParams = TrackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackObject> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrackRetrieveParams = TrackRetrieveParams.none(),
    ): CompletableFuture<TrackObject> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TrackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackObject>

    /** @see retrieve */
    fun retrieve(params: TrackRetrieveParams): CompletableFuture<TrackObject> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<TrackObject> =
        retrieve(id, TrackRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple tracks based on their Spotify IDs. */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: TrackBulkRetrieveParams
    ): CompletableFuture<TrackBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: TrackBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrackBulkRetrieveResponse>

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
         * Returns a raw HTTP response for `get /tracks/{id}`, but is otherwise the same as
         * [TrackServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TrackObject>> =
            retrieve(id, TrackRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TrackRetrieveParams = TrackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackObject>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TrackRetrieveParams = TrackRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TrackObject>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TrackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackObject>>

        /** @see retrieve */
        fun retrieve(params: TrackRetrieveParams): CompletableFuture<HttpResponseFor<TrackObject>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrackObject>> =
            retrieve(id, TrackRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tracks`, but is otherwise the same as
         * [TrackServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: TrackBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<TrackBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: TrackBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrackBulkRetrieveResponse>>
    }
}
