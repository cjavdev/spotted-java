// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.markets.MarketListParams
import com.spotted.api.models.markets.MarketListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MarketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketServiceAsync

    /** Get the list of markets where Spotify is available. */
    fun list(): CompletableFuture<MarketListResponse> = list(MarketListParams.none())

    /** @see list */
    fun list(
        params: MarketListParams = MarketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketListResponse>

    /** @see list */
    fun list(
        params: MarketListParams = MarketListParams.none()
    ): CompletableFuture<MarketListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MarketListResponse> =
        list(MarketListParams.none(), requestOptions)

    /**
     * A view of [MarketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /markets`, but is otherwise the same as
         * [MarketServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MarketListResponse>> =
            list(MarketListParams.none())

        /** @see list */
        fun list(
            params: MarketListParams = MarketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketListResponse>>

        /** @see list */
        fun list(
            params: MarketListParams = MarketListParams.none()
        ): CompletableFuture<HttpResponseFor<MarketListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketListResponse>> =
            list(MarketListParams.none(), requestOptions)
    }
}
