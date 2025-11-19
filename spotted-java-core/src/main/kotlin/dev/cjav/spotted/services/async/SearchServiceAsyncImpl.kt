// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.handlers.errorBodyHandler
import dev.cjav.spotted.core.handlers.errorHandler
import dev.cjav.spotted.core.handlers.jsonHandler
import dev.cjav.spotted.core.http.HttpMethod
import dev.cjav.spotted.core.http.HttpRequest
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponse.Handler
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.search.SearchQueryParams
import dev.cjav.spotted.models.search.SearchQueryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SearchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchServiceAsync {

    private val withRawResponse: SearchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SearchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchServiceAsync =
        SearchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun query(
        params: SearchQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SearchQueryResponse> =
        // get /search
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SearchServiceAsync.WithRawResponse =
            SearchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val queryHandler: Handler<SearchQueryResponse> =
            jsonHandler<SearchQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: SearchQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SearchQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { queryHandler.handle(it) }
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
