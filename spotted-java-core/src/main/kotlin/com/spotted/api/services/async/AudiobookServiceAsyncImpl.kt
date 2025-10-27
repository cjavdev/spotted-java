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
import com.spotted.api.models.audiobooks.AudiobookListChaptersPageAsync
import com.spotted.api.models.audiobooks.AudiobookListChaptersPageResponse
import com.spotted.api.models.audiobooks.AudiobookListChaptersParams
import com.spotted.api.models.audiobooks.AudiobookListParams
import com.spotted.api.models.audiobooks.AudiobookListResponse
import com.spotted.api.models.audiobooks.AudiobookRetrieveParams
import com.spotted.api.models.audiobooks.AudiobookRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AudiobookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudiobookServiceAsync {

    private val withRawResponse: AudiobookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudiobookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookServiceAsync =
        AudiobookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AudiobookRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookRetrieveResponse> =
        // get /audiobooks/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AudiobookListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookListResponse> =
        // get /audiobooks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listChapters(
        params: AudiobookListChaptersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookListChaptersPageAsync> =
        // get /audiobooks/{id}/chapters
        withRawResponse().listChapters(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudiobookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudiobookServiceAsync.WithRawResponse =
            AudiobookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AudiobookRetrieveResponse> =
            jsonHandler<AudiobookRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AudiobookRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks", params._pathParam(0))
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

        private val listHandler: Handler<AudiobookListResponse> =
            jsonHandler<AudiobookListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AudiobookListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listChaptersHandler: Handler<AudiobookListChaptersPageResponse> =
            jsonHandler<AudiobookListChaptersPageResponse>(clientOptions.jsonMapper)

        override fun listChapters(
            params: AudiobookListChaptersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookListChaptersPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audiobooks", params._pathParam(0), "chapters")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listChaptersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AudiobookListChaptersPageAsync.builder()
                                    .service(AudiobookServiceAsyncImpl(clientOptions))
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
