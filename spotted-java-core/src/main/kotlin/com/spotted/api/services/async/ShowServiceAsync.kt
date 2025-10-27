// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.shows.ShowListEpisodesPageAsync
import com.spotted.api.models.shows.ShowListEpisodesParams
import com.spotted.api.models.shows.ShowListParams
import com.spotted.api.models.shows.ShowListResponse
import com.spotted.api.models.shows.ShowRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowServiceAsync

    /** Get Spotify catalog information for a single show identified by its unique Spotify ID. */
    fun retrieve(id: String): CompletableFuture<ShowRetrieveResponse> =
        retrieve(id, ShowRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShowRetrieveParams = ShowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShowRetrieveParams = ShowRetrieveParams.none(),
    ): CompletableFuture<ShowRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ShowRetrieveParams): CompletableFuture<ShowRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShowRetrieveResponse> =
        retrieve(id, ShowRetrieveParams.none(), requestOptions)

    /** Get Spotify catalog information for several shows based on their Spotify IDs. */
    fun list(params: ShowListParams): CompletableFuture<ShowListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ShowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowListResponse>

    /**
     * Get Spotify catalog information about an show’s episodes. Optional parameters can be used to
     * limit the number of episodes returned.
     */
    fun listEpisodes(id: String): CompletableFuture<ShowListEpisodesPageAsync> =
        listEpisodes(id, ShowListEpisodesParams.none())

    /** @see listEpisodes */
    fun listEpisodes(
        id: String,
        params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowListEpisodesPageAsync> =
        listEpisodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEpisodes */
    fun listEpisodes(
        id: String,
        params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
    ): CompletableFuture<ShowListEpisodesPageAsync> =
        listEpisodes(id, params, RequestOptions.none())

    /** @see listEpisodes */
    fun listEpisodes(
        params: ShowListEpisodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShowListEpisodesPageAsync>

    /** @see listEpisodes */
    fun listEpisodes(params: ShowListEpisodesParams): CompletableFuture<ShowListEpisodesPageAsync> =
        listEpisodes(params, RequestOptions.none())

    /** @see listEpisodes */
    fun listEpisodes(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShowListEpisodesPageAsync> =
        listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)

    /** A view of [ShowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /shows/{id}`, but is otherwise the same as
         * [ShowServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> =
            retrieve(id, ShowRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ShowRetrieveParams = ShowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ShowRetrieveParams = ShowRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ShowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ShowRetrieveParams
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> =
            retrieve(id, ShowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /shows`, but is otherwise the same as
         * [ShowServiceAsync.list].
         */
        fun list(params: ShowListParams): CompletableFuture<HttpResponseFor<ShowListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ShowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowListResponse>>

        /**
         * Returns a raw HTTP response for `get /shows/{id}/episodes`, but is otherwise the same as
         * [ShowServiceAsync.listEpisodes].
         */
        fun listEpisodes(
            id: String
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> =
            listEpisodes(id, ShowListEpisodesParams.none())

        /** @see listEpisodes */
        fun listEpisodes(
            id: String,
            params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> =
            listEpisodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEpisodes */
        fun listEpisodes(
            id: String,
            params: ShowListEpisodesParams = ShowListEpisodesParams.none(),
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> =
            listEpisodes(id, params, RequestOptions.none())

        /** @see listEpisodes */
        fun listEpisodes(
            params: ShowListEpisodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>>

        /** @see listEpisodes */
        fun listEpisodes(
            params: ShowListEpisodesParams
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> =
            listEpisodes(params, RequestOptions.none())

        /** @see listEpisodes */
        fun listEpisodes(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> =
            listEpisodes(id, ShowListEpisodesParams.none(), requestOptions)
    }
}
