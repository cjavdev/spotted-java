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
import dev.cjav.spotted.models.me.audiobooks.AudiobookCheckParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPageAsync
import dev.cjav.spotted.models.me.audiobooks.AudiobookListPageResponse
import dev.cjav.spotted.models.me.audiobooks.AudiobookListParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookRemoveParams
import dev.cjav.spotted.models.me.audiobooks.AudiobookSaveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AudiobookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudiobookServiceAsync {

    private val withRawResponse: AudiobookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudiobookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudiobookServiceAsync =
        AudiobookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AudiobookListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudiobookListPageAsync> =
        // get /me/audiobooks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun check(
        params: AudiobookCheckParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Boolean>> =
        // get /me/audiobooks/contains
        withRawResponse().check(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun remove(
        params: AudiobookRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /me/audiobooks
        withRawResponse().remove(params, requestOptions).thenAccept {}

    @Deprecated("deprecated")
    override fun save(
        params: AudiobookSaveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/audiobooks
        withRawResponse().save(params, requestOptions).thenAccept {}

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

        private val listHandler: Handler<AudiobookListPageResponse> =
            jsonHandler<AudiobookListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AudiobookListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudiobookListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
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
                                AudiobookListPageAsync.builder()
                                    .service(AudiobookServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val checkHandler: Handler<List<Boolean>> =
            jsonHandler<List<Boolean>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun check(
            params: AudiobookCheckParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Boolean>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks", "contains")
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

        private val removeHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override fun remove(
            params: AudiobookRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { removeHandler.handle(it) }
                    }
                }
        }

        private val saveHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override fun save(
            params: AudiobookSaveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "audiobooks")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { saveHandler.handle(it) }
                    }
                }
        }
    }
}
