// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.audioanalysis.AudioAnalysisRetrieveParams
import com.spotted.api.models.audioanalysis.AudioAnalysisRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudioAnalysisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioAnalysisServiceAsync

    /**
     * Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis
     * describes the track’s structure and musical content, including rhythm, pitch, and timbre.
     */
    @Deprecated("deprecated")
    fun retrieve(id: String): CompletableFuture<AudioAnalysisRetrieveResponse> =
        retrieve(id, AudioAnalysisRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioAnalysisRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
    ): CompletableFuture<AudioAnalysisRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioAnalysisRetrieveResponse>

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioAnalysisRetrieveParams
    ): CompletableFuture<AudioAnalysisRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudioAnalysisRetrieveResponse> =
        retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)

    /**
     * A view of [AudioAnalysisServiceAsync] that provides access to raw HTTP responses for each
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
        ): AudioAnalysisServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-analysis/{id}`, but is otherwise the same as
         * [AudioAnalysisServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>> =
            retrieve(id, AudioAnalysisRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: AudioAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>>

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: AudioAnalysisRetrieveParams
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudioAnalysisRetrieveResponse>> =
            retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)
    }
}
