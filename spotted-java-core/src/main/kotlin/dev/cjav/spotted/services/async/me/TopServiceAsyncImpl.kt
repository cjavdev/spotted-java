// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

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
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageAsync
import dev.cjav.spotted.models.me.top.TopListTopArtistsPageResponse
import dev.cjav.spotted.models.me.top.TopListTopArtistsParams
import dev.cjav.spotted.models.me.top.TopListTopTracksPageAsync
import dev.cjav.spotted.models.me.top.TopListTopTracksPageResponse
import dev.cjav.spotted.models.me.top.TopListTopTracksParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TopServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TopServiceAsync {

    private val withRawResponse: TopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopServiceAsync =
        TopServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listTopArtists(
        params: TopListTopArtistsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TopListTopArtistsPageAsync> =
        // get /me/top/artists
        withRawResponse().listTopArtists(params, requestOptions).thenApply { it.parse() }

    override fun listTopTracks(
        params: TopListTopTracksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TopListTopTracksPageAsync> =
        // get /me/top/tracks
        withRawResponse().listTopTracks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TopServiceAsync.WithRawResponse =
            TopServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listTopArtistsHandler: Handler<TopListTopArtistsPageResponse> =
            jsonHandler<TopListTopArtistsPageResponse>(clientOptions.jsonMapper)

        override fun listTopArtists(
            params: TopListTopArtistsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TopListTopArtistsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "artists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTopArtistsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TopListTopArtistsPageAsync.builder()
                                    .service(TopServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listTopTracksHandler: Handler<TopListTopTracksPageResponse> =
            jsonHandler<TopListTopTracksPageResponse>(clientOptions.jsonMapper)

        override fun listTopTracks(
            params: TopListTopTracksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TopListTopTracksPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "top", "tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTopTracksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TopListTopTracksPageAsync.builder()
                                    .service(TopServiceAsyncImpl(clientOptions))
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
