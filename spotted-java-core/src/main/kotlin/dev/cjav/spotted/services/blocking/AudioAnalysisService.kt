// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveParams
import dev.cjav.spotted.models.audioanalysis.AudioAnalysisRetrieveResponse
import java.util.function.Consumer

interface AudioAnalysisService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioAnalysisService

    /**
     * Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis
     * describes the track’s structure and musical content, including rhythm, pitch, and timbre.
     */
    @Deprecated("deprecated")
    fun retrieve(id: String): AudioAnalysisRetrieveResponse =
        retrieve(id, AudioAnalysisRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioAnalysisRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        id: String,
        params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
    ): AudioAnalysisRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: AudioAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudioAnalysisRetrieveResponse

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: AudioAnalysisRetrieveParams): AudioAnalysisRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(id: String, requestOptions: RequestOptions): AudioAnalysisRetrieveResponse =
        retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)

    /**
     * A view of [AudioAnalysisService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioAnalysisService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audio-analysis/{id}`, but is otherwise the same as
         * [AudioAnalysisService.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(id, AudioAnalysisRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudioAnalysisRetrieveParams = AudioAnalysisRetrieveParams.none(),
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            params: AudioAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudioAnalysisRetrieveResponse>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            params: AudioAnalysisRetrieveParams
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioAnalysisRetrieveResponse> =
            retrieve(id, AudioAnalysisRetrieveParams.none(), requestOptions)
    }
}
