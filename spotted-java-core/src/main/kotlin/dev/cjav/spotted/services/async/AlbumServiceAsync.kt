// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveParams
import dev.cjav.spotted.models.albums.AlbumBulkRetrieveResponse
import dev.cjav.spotted.models.albums.AlbumListTracksPageAsync
import dev.cjav.spotted.models.albums.AlbumListTracksParams
import dev.cjav.spotted.models.albums.AlbumRetrieveParams
import dev.cjav.spotted.models.albums.AlbumRetrieveResponse
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

    /** Get Spotify catalog information for a single album. */
    fun retrieve(id: String): CompletableFuture<AlbumRetrieveResponse> =
        retrieve(id, AlbumRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
    ): CompletableFuture<AlbumRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AlbumRetrieveParams): CompletableFuture<AlbumRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlbumRetrieveResponse> =
        retrieve(id, AlbumRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for multiple albums identified by their Spotify IDs. */
    fun bulkRetrieve(
        params: AlbumBulkRetrieveParams
    ): CompletableFuture<AlbumBulkRetrieveResponse> = bulkRetrieve(params, RequestOptions.none())

    /** @see bulkRetrieve */
    fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumBulkRetrieveResponse>

    /**
     * Get Spotify catalog information about an album’s tracks. Optional parameters can be used to
     * limit the number of tracks returned.
     */
    fun listTracks(id: String): CompletableFuture<AlbumListTracksPageAsync> =
        listTracks(id, AlbumListTracksParams.none())

    /** @see listTracks */
    fun listTracks(
        id: String,
        params: AlbumListTracksParams = AlbumListTracksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumListTracksPageAsync> =
        listTracks(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTracks */
    fun listTracks(
        id: String,
        params: AlbumListTracksParams = AlbumListTracksParams.none(),
    ): CompletableFuture<AlbumListTracksPageAsync> = listTracks(id, params, RequestOptions.none())

    /** @see listTracks */
    fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlbumListTracksPageAsync>

    /** @see listTracks */
    fun listTracks(params: AlbumListTracksParams): CompletableFuture<AlbumListTracksPageAsync> =
        listTracks(params, RequestOptions.none())

    /** @see listTracks */
    fun listTracks(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlbumListTracksPageAsync> =
        listTracks(id, AlbumListTracksParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /albums/{id}`, but is otherwise the same as
         * [AlbumServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> =
            retrieve(id, AlbumRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AlbumRetrieveParams = AlbumRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AlbumRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AlbumRetrieveParams
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> =
            retrieve(id, AlbumRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /albums`, but is otherwise the same as
         * [AlbumServiceAsync.bulkRetrieve].
         */
        fun bulkRetrieve(
            params: AlbumBulkRetrieveParams
        ): CompletableFuture<HttpResponseFor<AlbumBulkRetrieveResponse>> =
            bulkRetrieve(params, RequestOptions.none())

        /** @see bulkRetrieve */
        fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumBulkRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /albums/{id}/tracks`, but is otherwise the same as
         * [AlbumServiceAsync.listTracks].
         */
        fun listTracks(id: String): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> =
            listTracks(id, AlbumListTracksParams.none())

        /** @see listTracks */
        fun listTracks(
            id: String,
            params: AlbumListTracksParams = AlbumListTracksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> =
            listTracks(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTracks */
        fun listTracks(
            id: String,
            params: AlbumListTracksParams = AlbumListTracksParams.none(),
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> =
            listTracks(id, params, RequestOptions.none())

        /** @see listTracks */
        fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>>

        /** @see listTracks */
        fun listTracks(
            params: AlbumListTracksParams
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> =
            listTracks(params, RequestOptions.none())

        /** @see listTracks */
        fun listTracks(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> =
            listTracks(id, AlbumListTracksParams.none(), requestOptions)
    }
}
