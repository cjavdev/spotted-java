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
import com.spotted.api.models.albums.AlbumBulkRetrieveParams
import com.spotted.api.models.albums.AlbumBulkRetrieveResponse
import com.spotted.api.models.albums.AlbumListTracksPageAsync
import com.spotted.api.models.albums.AlbumListTracksPageResponse
import com.spotted.api.models.albums.AlbumListTracksParams
import com.spotted.api.models.albums.AlbumRetrieveParams
import com.spotted.api.models.albums.AlbumRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AlbumServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlbumServiceAsync {

    private val withRawResponse: AlbumServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlbumServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlbumServiceAsync =
        AlbumServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AlbumRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlbumRetrieveResponse> =
        // get /albums/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun bulkRetrieve(
        params: AlbumBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlbumBulkRetrieveResponse> =
        // get /albums
        withRawResponse().bulkRetrieve(params, requestOptions).thenApply { it.parse() }

    override fun listTracks(
        params: AlbumListTracksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlbumListTracksPageAsync> =
        // get /albums/{id}/tracks
        withRawResponse().listTracks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlbumServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlbumServiceAsync.WithRawResponse =
            AlbumServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AlbumRetrieveResponse> =
            jsonHandler<AlbumRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AlbumRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlbumRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<AlbumBulkRetrieveResponse> =
            jsonHandler<AlbumBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: AlbumBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlbumBulkRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums")
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

        private val listTracksHandler: Handler<AlbumListTracksPageResponse> =
            jsonHandler<AlbumListTracksPageResponse>(clientOptions.jsonMapper)

        override fun listTracks(
            params: AlbumListTracksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlbumListTracksPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("albums", params._pathParam(0), "tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTracksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AlbumListTracksPageAsync.builder()
                                    .service(AlbumServiceAsyncImpl(clientOptions))
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
