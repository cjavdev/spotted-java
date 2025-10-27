// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.async.me

import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.handlers.emptyHandler
import com.spotted.api.core.handlers.errorBodyHandler
import com.spotted.api.core.handlers.errorHandler
import com.spotted.api.core.handlers.jsonHandler
import com.spotted.api.core.http.HttpMethod
import com.spotted.api.core.http.HttpRequest
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponse.Handler
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.core.http.json
import com.spotted.api.core.http.parseable
import com.spotted.api.core.prepareAsync
import com.spotted.api.models.me.following.FollowingCheckParams
import com.spotted.api.models.me.following.FollowingFollowParams
import com.spotted.api.models.me.following.FollowingListParams
import com.spotted.api.models.me.following.FollowingListResponse
import com.spotted.api.models.me.following.FollowingUnfollowParams
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

    override fun list(
        params: FollowingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FollowingListResponse> =
        // get /me/following
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

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

        private val listHandler: Handler<FollowingListResponse> =
            jsonHandler<FollowingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FollowingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FollowingListResponse>> {
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
                            .use { listHandler.handle(it) }
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
