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
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsParams
import dev.cjav.spotted.models.browse.BrowseGetFeaturedPlaylistsResponse
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesParams
import dev.cjav.spotted.models.browse.BrowseGetNewReleasesResponse
import dev.cjav.spotted.services.async.browse.CategoryServiceAsync
import dev.cjav.spotted.services.async.browse.CategoryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BrowseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrowseServiceAsync {

    private val withRawResponse: BrowseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val categories: CategoryServiceAsync by lazy { CategoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BrowseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseServiceAsync =
        BrowseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun categories(): CategoryServiceAsync = categories

    @Deprecated("deprecated")
    override fun getFeaturedPlaylists(
        params: BrowseGetFeaturedPlaylistsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrowseGetFeaturedPlaylistsResponse> =
        // get /browse/featured-playlists
        withRawResponse().getFeaturedPlaylists(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun getNewReleases(
        params: BrowseGetNewReleasesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrowseGetNewReleasesResponse> =
        // get /browse/new-releases
        withRawResponse().getNewReleases(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val categories: CategoryServiceAsync.WithRawResponse by lazy {
            CategoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowseServiceAsync.WithRawResponse =
            BrowseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun categories(): CategoryServiceAsync.WithRawResponse = categories

        private val getFeaturedPlaylistsHandler: Handler<BrowseGetFeaturedPlaylistsResponse> =
            jsonHandler<BrowseGetFeaturedPlaylistsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getFeaturedPlaylists(
            params: BrowseGetFeaturedPlaylistsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrowseGetFeaturedPlaylistsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "featured-playlists")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFeaturedPlaylistsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getNewReleasesHandler: Handler<BrowseGetNewReleasesResponse> =
            jsonHandler<BrowseGetNewReleasesResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getNewReleases(
            params: BrowseGetNewReleasesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrowseGetNewReleasesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse", "new-releases")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getNewReleasesHandler.handle(it) }
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
