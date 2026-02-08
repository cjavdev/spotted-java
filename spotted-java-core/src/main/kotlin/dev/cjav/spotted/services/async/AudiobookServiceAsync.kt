// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveResponse
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersPageAsync
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudiobookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookServiceAsync

    /**
     * Get Spotify catalog information for a single audiobook. Audiobooks are only available within
     * the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(id: String): CompletableFuture<AudiobookRetrieveResponse> =
        retrieve(id, AudiobookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
    ): CompletableFuture<AudiobookRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AudiobookRetrieveParams): CompletableFuture<AudiobookRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookRetrieveResponse> =
        retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobooks identified by their Spotify IDs.
     * Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia
     * markets.
     */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams
    ): CompletableFuture<AudiobookBulkRetrieveResponse> =
        bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    @Deprecated("deprecated")
    fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookBulkRetrieveResponse>

    /**
     * Get Spotify catalog information about an audiobook's chapters. Audiobooks are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun listChapters(id: String): CompletableFuture<AudiobookListChaptersPageAsync> =
        listChapters(id, AudiobookListChaptersParams.none())

    /** @see listChapters */
    fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookListChaptersPageAsync> =
        listChapters(params.toBuilder().id(id).build(), requestOptions)

    /** @see listChapters */
    fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
    ): CompletableFuture<AudiobookListChaptersPageAsync> =
        listChapters(id, params, RequestOptions.none())

    /** @see listChapters */
    fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudiobookListChaptersPageAsync>

    /** @see listChapters */
    fun listChapters(
        params: AudiobookListChaptersParams
    ): CompletableFuture<AudiobookListChaptersPageAsync> =
        listChapters(params, RequestOptions.none())

    /** @see listChapters */
    fun listChapters(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookListChaptersPageAsync> =
        listChapters(id, AudiobookListChaptersParams.none(), requestOptions)

    /**
     * A view of [AudiobookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudiobookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}`, but is otherwise the same as
         * [AudiobookServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> =
            retrieve(id, AudiobookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AudiobookRetrieveParams
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> =
            retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiobooks`, but is otherwise the same as
         * [AudiobookServiceAsync.bulkRetrieve].
         */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<AudiobookBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @Deprecated("deprecated")
        fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookBulkRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}/chapters`, but is otherwise the
         * same as [AudiobookServiceAsync.listChapters].
         */
        fun listChapters(
            id: String
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> =
            listChapters(id, AudiobookListChaptersParams.none())

        /** @see listChapters */
        fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> =
            listChapters(params.toBuilder().id(id).build(), requestOptions)

        /** @see listChapters */
        fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> =
            listChapters(id, params, RequestOptions.none())

        /** @see listChapters */
        fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>>

        /** @see listChapters */
        fun listChapters(
            params: AudiobookListChaptersParams
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> =
            listChapters(params, RequestOptions.none())

        /** @see listChapters */
        fun listChapters(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> =
            listChapters(id, AudiobookListChaptersParams.none(), requestOptions)
    }
}
