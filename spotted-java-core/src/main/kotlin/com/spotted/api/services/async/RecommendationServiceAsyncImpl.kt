// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.recommendations.RecommendationGetParams
import com.spotted.api.models.recommendations.RecommendationGetResponse
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsParams
import com.spotted.api.models.recommendations.RecommendationListAvailableGenreSeedsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RecommendationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RecommendationServiceAsync {

    private val withRawResponse: RecommendationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecommendationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RecommendationServiceAsync =
        RecommendationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun get(
        params: RecommendationGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecommendationGetResponse> =
        // get /recommendations
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun listAvailableGenreSeeds(
        params: RecommendationListAvailableGenreSeedsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecommendationListAvailableGenreSeedsResponse> =
        // get /recommendations/available-genre-seeds
        withRawResponse().listAvailableGenreSeeds(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecommendationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecommendationServiceAsync.WithRawResponse =
            RecommendationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<RecommendationGetResponse> =
            jsonHandler<RecommendationGetResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun get(
            params: RecommendationGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecommendationGetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listAvailableGenreSeedsHandler:
            Handler<RecommendationListAvailableGenreSeedsResponse> =
            jsonHandler<RecommendationListAvailableGenreSeedsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun listAvailableGenreSeeds(
            params: RecommendationListAvailableGenreSeedsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecommendationListAvailableGenreSeedsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recommendations", "available-genre-seeds")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAvailableGenreSeedsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
