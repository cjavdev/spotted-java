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
import dev.cjav.spotted.models.audiofeatures.AudioFeatureBulkRetrieveParams
import dev.cjav.spotted.models.audiofeatures.AudioFeatureBulkRetrieveResponse
import dev.cjav.spotted.models.audiofeatures.AudioFeatureRetrieveParams
import dev.cjav.spotted.models.audiofeatures.AudioFeatureRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AudioFeatureServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioFeatureServiceAsync {

    private val withRawResponse: AudioFeatureServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudioFeatureServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioFeatureServiceAsync =
        AudioFeatureServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun retrieve(
        params: AudioFeatureRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudioFeatureRetrieveResponse> =
        // get /audio-features/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun bulkRetrieve(
        params: AudioFeatureBulkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudioFeatureBulkRetrieveResponse> =
        // get /audio-features
        withRawResponse().bulkRetrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioFeatureServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioFeatureServiceAsync.WithRawResponse =
            AudioFeatureServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AudioFeatureRetrieveResponse> =
            jsonHandler<AudioFeatureRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: AudioFeatureRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudioFeatureRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audio-features", params._pathParam(0))
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

        private val bulkRetrieveHandler: Handler<AudioFeatureBulkRetrieveResponse> =
            jsonHandler<AudioFeatureBulkRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun bulkRetrieve(
            params: AudioFeatureBulkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudioFeatureBulkRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("audio-features")
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
    }
}
