// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.search.SearchQueryParams
import com.spotted.api.models.search.SearchQueryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchServiceAsync

    /**
     * Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or
     * audiobooks that match a keyword string. Audiobooks are only available within the US, UK,
     * Canada, Ireland, New Zealand and Australia markets.
     */
    fun query(params: SearchQueryParams): CompletableFuture<SearchQueryResponse> =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(
        params: SearchQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchQueryResponse>

    /**
     * A view of [SearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /search`, but is otherwise the same as
         * [SearchServiceAsync.query].
         */
        fun query(
            params: SearchQueryParams
        ): CompletableFuture<HttpResponseFor<SearchQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            params: SearchQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchQueryResponse>>
    }
}
