// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

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
import com.spotted.api.models.PagingPlaylistObject
import com.spotted.api.models.me.playlists.PlaylistListPageAsync
import com.spotted.api.models.me.playlists.PlaylistListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PlaylistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaylistServiceAsync {

    private val withRawResponse: PlaylistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaylistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaylistServiceAsync =
        PlaylistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PlaylistListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaylistListPageAsync> =
        // get /me/playlists
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaylistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaylistServiceAsync.WithRawResponse =
            PlaylistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PagingPlaylistObject> =
            jsonHandler<PagingPlaylistObject>(clientOptions.jsonMapper)

        override fun list(
            params: PlaylistListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaylistListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "playlists")
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
                            .let {
                                PlaylistListPageAsync.builder()
                                    .service(PlaylistServiceAsyncImpl(clientOptions))
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
