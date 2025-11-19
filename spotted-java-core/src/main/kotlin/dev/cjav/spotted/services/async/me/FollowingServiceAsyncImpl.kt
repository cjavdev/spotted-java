// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.handlers.emptyHandler
import dev.cjav.spotted.core.handlers.errorBodyHandler
import dev.cjav.spotted.core.handlers.errorHandler
import dev.cjav.spotted.core.handlers.jsonHandler
import dev.cjav.spotted.core.http.HttpMethod
import dev.cjav.spotted.core.http.HttpRequest
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponse.Handler
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.core.http.json
import dev.cjav.spotted.core.http.parseable
import dev.cjav.spotted.core.prepareAsync
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveParams
import dev.cjav.spotted.models.me.following.FollowingBulkRetrieveResponse
import dev.cjav.spotted.models.me.following.FollowingCheckParams
import dev.cjav.spotted.models.me.following.FollowingFollowParams
import dev.cjav.spotted.models.me.following.FollowingUnfollowParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FollowingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FollowingServiceAsync {

    private val withRawResponse: FollowingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FollowingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowingServiceAsync =
        FollowingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun bulkRetrieve(
        params: FollowingBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FollowingBulkRetrieveResponse> =
        // get /me/following
        withRawResponse().bulkRetrieve(params, requestOptions).thenApply { it.parse() }

    override fun check(
        params: FollowingCheckParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Boolean>> =
        // get /me/following/contains
        withRawResponse().check(params, requestOptions).thenApply { it.parse() }

    override fun follow(
        params: FollowingFollowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/following
        withRawResponse().follow(params, requestOptions).thenAccept {}

    override fun unfollow(
        params: FollowingUnfollowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /me/following
        withRawResponse().unfollow(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FollowingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowingServiceAsync.WithRawResponse =
            FollowingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val bulkRetrieveHandler: Handler<FollowingBulkRetrieveResponse> =
            jsonHandler<FollowingBulkRetrieveResponse>(clientOptions.jsonMapper)

        override fun bulkRetrieve(
            params: FollowingBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FollowingBulkRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
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

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        override fun check(
            params: FollowingCheckParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Boolean>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following", "contains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { checkHandler.handle(it) }
                    }
                }
        }

        private val followHandler: Handler<Void?> = emptyHandler()

        override fun follow(
            params: FollowingFollowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { followHandler.handle(it) }
                    }
                }
        }

        private val unfollowHandler: Handler<Void?> = emptyHandler()

        override fun unfollow(
            params: FollowingUnfollowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "following")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unfollowHandler.handle(it) }
                    }
                }
        }
    }
}
