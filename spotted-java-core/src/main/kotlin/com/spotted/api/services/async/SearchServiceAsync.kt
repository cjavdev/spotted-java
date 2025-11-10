// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.search.SearchSearchParams
import com.spotted.api.models.search.SearchSearchResponse
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
    fun search(params: SearchSearchParams): CompletableFuture<SearchSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: SearchSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchSearchResponse>

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
         * [SearchServiceAsync.search].
         */
        fun search(
            params: SearchSearchParams
        ): CompletableFuture<HttpResponseFor<SearchSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: SearchSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchSearchResponse>>
    }
}
