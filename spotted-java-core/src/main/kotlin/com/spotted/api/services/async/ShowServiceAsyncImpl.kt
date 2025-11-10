// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.checkRequired
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
import com.spotted.api.models.shows.ShowBulkRetrieveParams
import com.spotted.api.models.shows.ShowBulkRetrieveResponse
import com.spotted.api.models.shows.ShowListEpisodesPageAsync
import com.spotted.api.models.shows.ShowListEpisodesPageResponse
import com.spotted.api.models.shows.ShowListEpisodesParams
import com.spotted.api.models.shows.ShowRetrieveParams
import com.spotted.api.models.shows.ShowRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ShowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ShowServiceAsync {

    private val withRawResponse: ShowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShowServiceAsync =
        ShowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ShowRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShowRetrieveResponse> =
        // get /shows/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun bulkRetrieve(
        params: ShowBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShowBulkRetrieveResponse> =
        // get /shows
        withRawResponse().bulkRetrieve(params, requestOptions).thenApply { it.parse() }

    override fun listEpisodes(
        params: ShowListEpisodesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShowListEpisodesPageAsync> =
        // get /shows/{id}/episodes
        withRawResponse().listEpisodes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShowServiceAsync.WithRawResponse =
            ShowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ShowRetrieveResponse> =
            jsonHandler<ShowRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ShowRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShowRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val bulkRetrieveHandler: Handler<ShowBulkRetrieveResponse> =
            jsonHandler<ShowBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: ShowBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShowBulkRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bulkRetrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEpisodesHandler: Handler<ShowListEpisodesPageResponse> =
            jsonHandler<ShowListEpisodesPageResponse>(clientOptions.jsonMapper)

        override fun listEpisodes(
            params: ShowListEpisodesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShowListEpisodesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("shows", params._pathParam(0), "episodes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEpisodesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ShowListEpisodesPageAsync.builder()
                                    .service(ShowServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
