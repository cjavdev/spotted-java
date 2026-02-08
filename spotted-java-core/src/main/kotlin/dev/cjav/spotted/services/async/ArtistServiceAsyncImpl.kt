// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.checkRequired
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
import dev.cjav.spotted.models.ArtistObject
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveParams
import dev.cjav.spotted.models.artists.ArtistBulkRetrieveResponse
import dev.cjav.spotted.models.artists.ArtistListAlbumsPageAsync
import dev.cjav.spotted.models.artists.ArtistListAlbumsPageResponse
import dev.cjav.spotted.models.artists.ArtistListAlbumsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsParams
import dev.cjav.spotted.models.artists.ArtistListRelatedArtistsResponse
import dev.cjav.spotted.models.artists.ArtistRetrieveParams
import dev.cjav.spotted.models.artists.ArtistTopTracksParams
import dev.cjav.spotted.models.artists.ArtistTopTracksResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ArtistServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ArtistServiceAsync {

    private val withRawResponse: ArtistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtistServiceAsync =
        ArtistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ArtistRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistObject> =
        // get /artists/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun bulkRetrieve(
        params: ArtistBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistBulkRetrieveResponse> =
        // get /artists
        withRawResponse().bulkRetrieve(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun listAlbums(
        params: ArtistListAlbumsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistListAlbumsPageAsync> =
        // get /artists/{id}/albums
        withRawResponse().listAlbums(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun listRelatedArtists(
        params: ArtistListRelatedArtistsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistListRelatedArtistsResponse> =
        // get /artists/{id}/related-artists
        withRawResponse().listRelatedArtists(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun topTracks(
        params: ArtistTopTracksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtistTopTracksResponse> =
        // get /artists/{id}/top-tracks
        withRawResponse().topTracks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtistServiceAsync.WithRawResponse =
            ArtistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ArtistObject> =
            jsonHandler<ArtistObject>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ArtistRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<ArtistBulkRetrieveResponse> =
            jsonHandler<ArtistBulkRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun bulkRetrieve(
            params: ArtistBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistBulkRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists")
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

        private val listAlbumsHandler: Handler<ArtistListAlbumsPageResponse> =
            jsonHandler<ArtistListAlbumsPageResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun listAlbums(
            params: ArtistListAlbumsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistListAlbumsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "albums")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAlbumsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ArtistListAlbumsPageAsync.builder()
                                    .service(ArtistServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listRelatedArtistsHandler: Handler<ArtistListRelatedArtistsResponse> =
            jsonHandler<ArtistListRelatedArtistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun listRelatedArtists(
            params: ArtistListRelatedArtistsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistListRelatedArtistsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "related-artists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRelatedArtistsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val topTracksHandler: Handler<ArtistTopTracksResponse> =
            jsonHandler<ArtistTopTracksResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun topTracks(
            params: ArtistTopTracksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtistTopTracksResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artists", params._pathParam(0), "top-tracks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { topTracksHandler.handle(it) }
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
