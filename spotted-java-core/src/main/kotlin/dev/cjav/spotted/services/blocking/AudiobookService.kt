// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookBulkRetrieveResponse
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersPage
import dev.cjav.spotted.models.audiobooks.AudiobookListChaptersParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveParams
import dev.cjav.spotted.models.audiobooks.AudiobookRetrieveResponse
import java.util.function.Consumer

interface AudiobookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookService

    /**
     * Get Spotify catalog information for a single audiobook. Audiobooks are only available within
     * the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun retrieve(id: String): AudiobookRetrieveResponse =
        retrieve(id, AudiobookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
    ): AudiobookRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AudiobookRetrieveParams): AudiobookRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AudiobookRetrieveResponse =
        retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

    /**
     * Get Spotify catalog information for several audiobooks identified by their Spotify IDs.
     * Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia
     * markets.
     */
    fun bulkRetrieve(params: AudiobookBulkRetrieveParams): AudiobookBulkRetrieveResponse =
        bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    fun bulkRetrieve(
        params: AudiobookBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookBulkRetrieveResponse

    /**
     * Get Spotify catalog information about an audiobook's chapters. Audiobooks are only available
     * within the US, UK, Canada, Ireland, New Zealand and Australia markets.
     */
    fun listChapters(id: String): AudiobookListChaptersPage =
        listChapters(id, AudiobookListChaptersParams.none())

    /** @see listChapters */
    fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPage = listChapters(params.toBuilder().id(id).build(), requestOptions)

    /** @see listChapters */
    fun listChapters(
        id: String,
        params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
    ): AudiobookListChaptersPage = listChapters(id, params, RequestOptions.none())

    /** @see listChapters */
    fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudiobookListChaptersPage

    /** @see listChapters */
    fun listChapters(params: AudiobookListChaptersParams): AudiobookListChaptersPage =
        listChapters(params, RequestOptions.none())

    /** @see listChapters */
    fun listChapters(id: String, requestOptions: RequestOptions): AudiobookListChaptersPage =
        listChapters(id, AudiobookListChaptersParams.none(), requestOptions)

    /** A view of [AudiobookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}`, but is otherwise the same as
         * [AudiobookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(id, AudiobookRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AudiobookRetrieveParams = AudiobookRetrieveParams.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AudiobookRetrieveParams): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookRetrieveResponse> =
            retrieve(id, AudiobookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiobooks`, but is otherwise the same as
         * [AudiobookService.bulkRetrieve].
         */
        @MustBeClosed
        fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams
        ): HttpResponseFor<AudiobookBulkRetrieveResponse> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        @MustBeClosed
        fun bulkRetrieve(
            params: AudiobookBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookBulkRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /audiobooks/{id}/chapters`, but is otherwise the
         * same as [AudiobookService.listChapters].
         */
        @MustBeClosed
        fun listChapters(id: String): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(id, AudiobookListChaptersParams.none())

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(params.toBuilder().id(id).build(), requestOptions)

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            id: String,
            params: AudiobookListChaptersParams = AudiobookListChaptersParams.none(),
        ): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(id, params, RequestOptions.none())

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudiobookListChaptersPage>

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            params: AudiobookListChaptersParams
        ): HttpResponseFor<AudiobookListChaptersPage> = listChapters(params, RequestOptions.none())

        /** @see listChapters */
        @MustBeClosed
        fun listChapters(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudiobookListChaptersPage> =
            listChapters(id, AudiobookListChaptersParams.none(), requestOptions)
    }
}
