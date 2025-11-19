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
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingParams
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingResponse
import dev.cjav.spotted.models.me.player.PlayerGetDevicesParams
import dev.cjav.spotted.models.me.player.PlayerGetDevicesResponse
import dev.cjav.spotted.models.me.player.PlayerGetStateParams
import dev.cjav.spotted.models.me.player.PlayerGetStateResponse
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedPageAsync
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedPageResponse
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedParams
import dev.cjav.spotted.models.me.player.PlayerPausePlaybackParams
import dev.cjav.spotted.models.me.player.PlayerSeekToPositionParams
import dev.cjav.spotted.models.me.player.PlayerSetRepeatModeParams
import dev.cjav.spotted.models.me.player.PlayerSetVolumeParams
import dev.cjav.spotted.models.me.player.PlayerSkipNextParams
import dev.cjav.spotted.models.me.player.PlayerSkipPreviousParams
import dev.cjav.spotted.models.me.player.PlayerStartPlaybackParams
import dev.cjav.spotted.models.me.player.PlayerToggleShuffleParams
import dev.cjav.spotted.models.me.player.PlayerTransferParams
import dev.cjav.spotted.services.async.me.player.QueueServiceAsync
import dev.cjav.spotted.services.async.me.player.QueueServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PlayerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlayerServiceAsync {

    private val withRawResponse: PlayerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val queue: QueueServiceAsync by lazy { QueueServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PlayerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerServiceAsync =
        PlayerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun queue(): QueueServiceAsync = queue

    override fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlayerGetCurrentlyPlayingResponse> =
        // get /me/player/currently-playing
        withRawResponse().getCurrentlyPlaying(params, requestOptions).thenApply { it.parse() }

    override fun getDevices(
        params: PlayerGetDevicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlayerGetDevicesResponse> =
        // get /me/player/devices
        withRawResponse().getDevices(params, requestOptions).thenApply { it.parse() }

    override fun getState(
        params: PlayerGetStateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlayerGetStateResponse> =
        // get /me/player
        withRawResponse().getState(params, requestOptions).thenApply { it.parse() }

    override fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlayerListRecentlyPlayedPageAsync> =
        // get /me/player/recently-played
        withRawResponse().listRecentlyPlayed(params, requestOptions).thenApply { it.parse() }

    override fun pausePlayback(
        params: PlayerPausePlaybackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/pause
        withRawResponse().pausePlayback(params, requestOptions).thenAccept {}

    override fun seekToPosition(
        params: PlayerSeekToPositionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/seek
        withRawResponse().seekToPosition(params, requestOptions).thenAccept {}

    override fun setRepeatMode(
        params: PlayerSetRepeatModeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/repeat
        withRawResponse().setRepeatMode(params, requestOptions).thenAccept {}

    override fun setVolume(
        params: PlayerSetVolumeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/volume
        withRawResponse().setVolume(params, requestOptions).thenAccept {}

    override fun skipNext(
        params: PlayerSkipNextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /me/player/next
        withRawResponse().skipNext(params, requestOptions).thenAccept {}

    override fun skipPrevious(
        params: PlayerSkipPreviousParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /me/player/previous
        withRawResponse().skipPrevious(params, requestOptions).thenAccept {}

    override fun startPlayback(
        params: PlayerStartPlaybackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/play
        withRawResponse().startPlayback(params, requestOptions).thenAccept {}

    override fun toggleShuffle(
        params: PlayerToggleShuffleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player/shuffle
        withRawResponse().toggleShuffle(params, requestOptions).thenAccept {}

    override fun transfer(
        params: PlayerTransferParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /me/player
        withRawResponse().transfer(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlayerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val queue: QueueServiceAsync.WithRawResponse by lazy {
            QueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlayerServiceAsync.WithRawResponse =
            PlayerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun queue(): QueueServiceAsync.WithRawResponse = queue

        private val getCurrentlyPlayingHandler: Handler<PlayerGetCurrentlyPlayingResponse> =
            jsonHandler<PlayerGetCurrentlyPlayingResponse>(clientOptions.jsonMapper)

        override fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlayerGetCurrentlyPlayingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "currently-playing")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCurrentlyPlayingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDevicesHandler: Handler<PlayerGetDevicesResponse> =
            jsonHandler<PlayerGetDevicesResponse>(clientOptions.jsonMapper)

        override fun getDevices(
            params: PlayerGetDevicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlayerGetDevicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "devices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDevicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getStateHandler: Handler<PlayerGetStateResponse> =
            jsonHandler<PlayerGetStateResponse>(clientOptions.jsonMapper)

        override fun getState(
            params: PlayerGetStateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlayerGetStateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRecentlyPlayedHandler: Handler<PlayerListRecentlyPlayedPageResponse> =
            jsonHandler<PlayerListRecentlyPlayedPageResponse>(clientOptions.jsonMapper)

        override fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlayerListRecentlyPlayedPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "recently-played")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRecentlyPlayedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PlayerListRecentlyPlayedPageAsync.builder()
                                    .service(PlayerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val pausePlaybackHandler: Handler<Void?> = emptyHandler()

        override fun pausePlayback(
            params: PlayerPausePlaybackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "pause")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { pausePlaybackHandler.handle(it) }
                    }
                }
        }

        private val seekToPositionHandler: Handler<Void?> = emptyHandler()

        override fun seekToPosition(
            params: PlayerSeekToPositionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "seek")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { seekToPositionHandler.handle(it) }
                    }
                }
        }

        private val setRepeatModeHandler: Handler<Void?> = emptyHandler()

        override fun setRepeatMode(
            params: PlayerSetRepeatModeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "repeat")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setRepeatModeHandler.handle(it) }
                    }
                }
        }

        private val setVolumeHandler: Handler<Void?> = emptyHandler()

        override fun setVolume(
            params: PlayerSetVolumeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "volume")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setVolumeHandler.handle(it) }
                    }
                }
        }

        private val skipNextHandler: Handler<Void?> = emptyHandler()

        override fun skipNext(
            params: PlayerSkipNextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "next")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { skipNextHandler.handle(it) }
                    }
                }
        }

        private val skipPreviousHandler: Handler<Void?> = emptyHandler()

        override fun skipPrevious(
            params: PlayerSkipPreviousParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "previous")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { skipPreviousHandler.handle(it) }
                    }
                }
        }

        private val startPlaybackHandler: Handler<Void?> = emptyHandler()

        override fun startPlayback(
            params: PlayerStartPlaybackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "play")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { startPlaybackHandler.handle(it) }
                    }
                }
        }

        private val toggleShuffleHandler: Handler<Void?> = emptyHandler()

        override fun toggleShuffle(
            params: PlayerToggleShuffleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player", "shuffle")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { toggleShuffleHandler.handle(it) }
                    }
                }
        }

        private val transferHandler: Handler<Void?> = emptyHandler()

        override fun transfer(
            params: PlayerTransferParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("me", "player")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { transferHandler.handle(it) }
                    }
                }
        }
    }
}
