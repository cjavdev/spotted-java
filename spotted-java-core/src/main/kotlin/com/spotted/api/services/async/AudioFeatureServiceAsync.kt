// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureBulkRetrieveResponse
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveParams
import com.spotted.api.models.audiofeatures.AudioFeatureRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudioFeatureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioFeatureServiceAsync

    /** Get audio feature information for a single track identified by its unique Spotify ID. */
    @Deprecated("deprecated")
    fun retrieve(id: String): CompletableFuture<AudioFeatureRetrieveResponse> =
        retrieve(id, AudioFeatureRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioFeatureRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
    ): CompletableFuture<AudioFeatureRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioFeatureRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioFeatureRetrieveResponse>

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioFeatureRetrieveParams
    ): CompletableFuture<AudioFeatureRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudioFeatureRetrieveResponse> =
        retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

    /** Get audio features for multiple tracks based on their Spotify IDs. */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams
    ): CompletableFuture<AudioFeatureBulkRetrieveResponse> =
        bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioFeatureBulkRetrieveResponse>

    /**
     * A view of [AudioFeatureServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioFeatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-features/{id}`, but is otherwise the same as
         * [AudioFeatureServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> =
            retrieve(id, AudioFeatureRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            params: AudioFeatureRetrieveParams = AudioFeatureRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: AudioFeatureRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>>

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: AudioFeatureRetrieveParams
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> =
            retrieve(id, AudioFeatureRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audio-features`, but is otherwise the same as
         * [AudioFeatureServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<AudioFeatureBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioFeatureBulkRetrieveResponse>>
    }
}
