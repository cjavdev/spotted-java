// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.services.async.me

import dev.cjav.spotted.core.ClientOptions
import dev.cjav.spotted.core.RequestOptions
import dev.cjav.spotted.core.http.HttpResponse
import dev.cjav.spotted.core.http.HttpResponseFor
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingParams
import dev.cjav.spotted.models.me.player.PlayerGetCurrentlyPlayingResponse
import dev.cjav.spotted.models.me.player.PlayerGetDevicesParams
import dev.cjav.spotted.models.me.player.PlayerGetDevicesResponse
import dev.cjav.spotted.models.me.player.PlayerGetStateParams
import dev.cjav.spotted.models.me.player.PlayerGetStateResponse
import dev.cjav.spotted.models.me.player.PlayerListRecentlyPlayedPageAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlayerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerServiceAsync

    fun queue(): QueueServiceAsync

    /** Get the object currently being played on the user's Spotify account. */
    fun getCurrentlyPlaying(): CompletableFuture<PlayerGetCurrentlyPlayingResponse> =
        getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none())

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlayerGetCurrentlyPlayingResponse>

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none()
    ): CompletableFuture<PlayerGetCurrentlyPlayingResponse> =
        getCurrentlyPlaying(params, RequestOptions.none())

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(
        requestOptions: RequestOptions
    ): CompletableFuture<PlayerGetCurrentlyPlayingResponse> =
        getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

    /**
     * Get information about a user’s available Spotify Connect devices. Some device models are not
     * supported and will not be listed in the API response.
     */
    fun getDevices(): CompletableFuture<PlayerGetDevicesResponse> =
        getDevices(PlayerGetDevicesParams.none())

    /** @see getDevices */
    fun getDevices(
        params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlayerGetDevicesResponse>

    /** @see getDevices */
    fun getDevices(
        params: PlayerGetDevicesParams = PlayerGetDevicesParams.none()
    ): CompletableFuture<PlayerGetDevicesResponse> = getDevices(params, RequestOptions.none())

    /** @see getDevices */
    fun getDevices(requestOptions: RequestOptions): CompletableFuture<PlayerGetDevicesResponse> =
        getDevices(PlayerGetDevicesParams.none(), requestOptions)

    /**
     * Get information about the user’s current playback state, including track or episode,
     * progress, and active device.
     */
    fun getState(): CompletableFuture<PlayerGetStateResponse> =
        getState(PlayerGetStateParams.none())

    /** @see getState */
    fun getState(
        params: PlayerGetStateParams = PlayerGetStateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlayerGetStateResponse>

    /** @see getState */
    fun getState(
        params: PlayerGetStateParams = PlayerGetStateParams.none()
    ): CompletableFuture<PlayerGetStateResponse> = getState(params, RequestOptions.none())

    /** @see getState */
    fun getState(requestOptions: RequestOptions): CompletableFuture<PlayerGetStateResponse> =
        getState(PlayerGetStateParams.none(), requestOptions)

    /**
     * Get tracks from the current user's recently played tracks. _**Note**: Currently doesn't
     * support podcast episodes._
     */
    fun listRecentlyPlayed(): CompletableFuture<PlayerListRecentlyPlayedPageAsync> =
        listRecentlyPlayed(PlayerListRecentlyPlayedParams.none())

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlayerListRecentlyPlayedPageAsync>

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none()
    ): CompletableFuture<PlayerListRecentlyPlayedPageAsync> =
        listRecentlyPlayed(params, RequestOptions.none())

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(
        requestOptions: RequestOptions
    ): CompletableFuture<PlayerListRecentlyPlayedPageAsync> =
        listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

    /**
     * Pause playback on the user's account. This API only works for users who have Spotify Premium.
     * The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun pausePlayback(): CompletableFuture<Void?> = pausePlayback(PlayerPausePlaybackParams.none())

    /** @see pausePlayback */
    fun pausePlayback(
        params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pausePlayback */
    fun pausePlayback(
        params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none()
    ): CompletableFuture<Void?> = pausePlayback(params, RequestOptions.none())

    /** @see pausePlayback */
    fun pausePlayback(requestOptions: RequestOptions): CompletableFuture<Void?> =
        pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

    /**
     * Seeks to the given position in the user’s currently playing track. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    fun seekToPosition(params: PlayerSeekToPositionParams): CompletableFuture<Void?> =
        seekToPosition(params, RequestOptions.none())

    /** @see seekToPosition */
    fun seekToPosition(
        params: PlayerSeekToPositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Set the repeat mode for the user's playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun setRepeatMode(params: PlayerSetRepeatModeParams): CompletableFuture<Void?> =
        setRepeatMode(params, RequestOptions.none())

    /** @see setRepeatMode */
    fun setRepeatMode(
        params: PlayerSetRepeatModeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Set the volume for the user’s current playback device. This API only works for users who have
     * Spotify Premium. The order of execution is not guaranteed when you use this API with other
     * Player API endpoints.
     */
    fun setVolume(params: PlayerSetVolumeParams): CompletableFuture<Void?> =
        setVolume(params, RequestOptions.none())

    /** @see setVolume */
    fun setVolume(
        params: PlayerSetVolumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Skips to next track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun skipNext(): CompletableFuture<Void?> = skipNext(PlayerSkipNextParams.none())

    /** @see skipNext */
    fun skipNext(
        params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see skipNext */
    fun skipNext(
        params: PlayerSkipNextParams = PlayerSkipNextParams.none()
    ): CompletableFuture<Void?> = skipNext(params, RequestOptions.none())

    /** @see skipNext */
    fun skipNext(requestOptions: RequestOptions): CompletableFuture<Void?> =
        skipNext(PlayerSkipNextParams.none(), requestOptions)

    /**
     * Skips to previous track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun skipPrevious(): CompletableFuture<Void?> = skipPrevious(PlayerSkipPreviousParams.none())

    /** @see skipPrevious */
    fun skipPrevious(
        params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see skipPrevious */
    fun skipPrevious(
        params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none()
    ): CompletableFuture<Void?> = skipPrevious(params, RequestOptions.none())

    /** @see skipPrevious */
    fun skipPrevious(requestOptions: RequestOptions): CompletableFuture<Void?> =
        skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

    /**
     * Start a new context or resume current playback on the user's active device. This API only
     * works for users who have Spotify Premium. The order of execution is not guaranteed when you
     * use this API with other Player API endpoints.
     */
    fun startPlayback(): CompletableFuture<Void?> = startPlayback(PlayerStartPlaybackParams.none())

    /** @see startPlayback */
    fun startPlayback(
        params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see startPlayback */
    fun startPlayback(
        params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none()
    ): CompletableFuture<Void?> = startPlayback(params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(requestOptions: RequestOptions): CompletableFuture<Void?> =
        startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

    /**
     * Toggle shuffle on or off for user’s playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun toggleShuffle(params: PlayerToggleShuffleParams): CompletableFuture<Void?> =
        toggleShuffle(params, RequestOptions.none())

    /** @see toggleShuffle */
    fun toggleShuffle(
        params: PlayerToggleShuffleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Transfer playback to a new device and optionally begin playback. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    fun transfer(params: PlayerTransferParams): CompletableFuture<Void?> =
        transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: PlayerTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [PlayerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlayerServiceAsync.WithRawResponse

        fun queue(): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/player/currently-playing`, but is otherwise the
         * same as [PlayerServiceAsync.getCurrentlyPlaying].
         */
        fun getCurrentlyPlaying():
            CompletableFuture<HttpResponseFor<PlayerGetCurrentlyPlayingResponse>> =
            getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none())

        /** @see getCurrentlyPlaying */
        fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlayerGetCurrentlyPlayingResponse>>

        /** @see getCurrentlyPlaying */
        fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none()
        ): CompletableFuture<HttpResponseFor<PlayerGetCurrentlyPlayingResponse>> =
            getCurrentlyPlaying(params, RequestOptions.none())

        /** @see getCurrentlyPlaying */
        fun getCurrentlyPlaying(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlayerGetCurrentlyPlayingResponse>> =
            getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/devices`, but is otherwise the same as
         * [PlayerServiceAsync.getDevices].
         */
        fun getDevices(): CompletableFuture<HttpResponseFor<PlayerGetDevicesResponse>> =
            getDevices(PlayerGetDevicesParams.none())

        /** @see getDevices */
        fun getDevices(
            params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlayerGetDevicesResponse>>

        /** @see getDevices */
        fun getDevices(
            params: PlayerGetDevicesParams = PlayerGetDevicesParams.none()
        ): CompletableFuture<HttpResponseFor<PlayerGetDevicesResponse>> =
            getDevices(params, RequestOptions.none())

        /** @see getDevices */
        fun getDevices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlayerGetDevicesResponse>> =
            getDevices(PlayerGetDevicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player`, but is otherwise the same as
         * [PlayerServiceAsync.getState].
         */
        fun getState(): CompletableFuture<HttpResponseFor<PlayerGetStateResponse>> =
            getState(PlayerGetStateParams.none())

        /** @see getState */
        fun getState(
            params: PlayerGetStateParams = PlayerGetStateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlayerGetStateResponse>>

        /** @see getState */
        fun getState(
            params: PlayerGetStateParams = PlayerGetStateParams.none()
        ): CompletableFuture<HttpResponseFor<PlayerGetStateResponse>> =
            getState(params, RequestOptions.none())

        /** @see getState */
        fun getState(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlayerGetStateResponse>> =
            getState(PlayerGetStateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/recently-played`, but is otherwise the
         * same as [PlayerServiceAsync.listRecentlyPlayed].
         */
        fun listRecentlyPlayed():
            CompletableFuture<HttpResponseFor<PlayerListRecentlyPlayedPageAsync>> =
            listRecentlyPlayed(PlayerListRecentlyPlayedParams.none())

        /** @see listRecentlyPlayed */
        fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlayerListRecentlyPlayedPageAsync>>

        /** @see listRecentlyPlayed */
        fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none()
        ): CompletableFuture<HttpResponseFor<PlayerListRecentlyPlayedPageAsync>> =
            listRecentlyPlayed(params, RequestOptions.none())

        /** @see listRecentlyPlayed */
        fun listRecentlyPlayed(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlayerListRecentlyPlayedPageAsync>> =
            listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/pause`, but is otherwise the same as
         * [PlayerServiceAsync.pausePlayback].
         */
        fun pausePlayback(): CompletableFuture<HttpResponse> =
            pausePlayback(PlayerPausePlaybackParams.none())

        /** @see pausePlayback */
        fun pausePlayback(
            params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pausePlayback */
        fun pausePlayback(
            params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none()
        ): CompletableFuture<HttpResponse> = pausePlayback(params, RequestOptions.none())

        /** @see pausePlayback */
        fun pausePlayback(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/seek`, but is otherwise the same as
         * [PlayerServiceAsync.seekToPosition].
         */
        fun seekToPosition(params: PlayerSeekToPositionParams): CompletableFuture<HttpResponse> =
            seekToPosition(params, RequestOptions.none())

        /** @see seekToPosition */
        fun seekToPosition(
            params: PlayerSeekToPositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/player/repeat`, but is otherwise the same as
         * [PlayerServiceAsync.setRepeatMode].
         */
        fun setRepeatMode(params: PlayerSetRepeatModeParams): CompletableFuture<HttpResponse> =
            setRepeatMode(params, RequestOptions.none())

        /** @see setRepeatMode */
        fun setRepeatMode(
            params: PlayerSetRepeatModeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/player/volume`, but is otherwise the same as
         * [PlayerServiceAsync.setVolume].
         */
        fun setVolume(params: PlayerSetVolumeParams): CompletableFuture<HttpResponse> =
            setVolume(params, RequestOptions.none())

        /** @see setVolume */
        fun setVolume(
            params: PlayerSetVolumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /me/player/next`, but is otherwise the same as
         * [PlayerServiceAsync.skipNext].
         */
        fun skipNext(): CompletableFuture<HttpResponse> = skipNext(PlayerSkipNextParams.none())

        /** @see skipNext */
        fun skipNext(
            params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see skipNext */
        fun skipNext(
            params: PlayerSkipNextParams = PlayerSkipNextParams.none()
        ): CompletableFuture<HttpResponse> = skipNext(params, RequestOptions.none())

        /** @see skipNext */
        fun skipNext(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            skipNext(PlayerSkipNextParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /me/player/previous`, but is otherwise the same as
         * [PlayerServiceAsync.skipPrevious].
         */
        fun skipPrevious(): CompletableFuture<HttpResponse> =
            skipPrevious(PlayerSkipPreviousParams.none())

        /** @see skipPrevious */
        fun skipPrevious(
            params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see skipPrevious */
        fun skipPrevious(
            params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none()
        ): CompletableFuture<HttpResponse> = skipPrevious(params, RequestOptions.none())

        /** @see skipPrevious */
        fun skipPrevious(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/play`, but is otherwise the same as
         * [PlayerServiceAsync.startPlayback].
         */
        fun startPlayback(): CompletableFuture<HttpResponse> =
            startPlayback(PlayerStartPlaybackParams.none())

        /** @see startPlayback */
        fun startPlayback(
            params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see startPlayback */
        fun startPlayback(
            params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none()
        ): CompletableFuture<HttpResponse> = startPlayback(params, RequestOptions.none())

        /** @see startPlayback */
        fun startPlayback(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/shuffle`, but is otherwise the same as
         * [PlayerServiceAsync.toggleShuffle].
         */
        fun toggleShuffle(params: PlayerToggleShuffleParams): CompletableFuture<HttpResponse> =
            toggleShuffle(params, RequestOptions.none())

        /** @see toggleShuffle */
        fun toggleShuffle(
            params: PlayerToggleShuffleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /me/player`, but is otherwise the same as
         * [PlayerServiceAsync.transfer].
         */
        fun transfer(params: PlayerTransferParams): CompletableFuture<HttpResponse> =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        fun transfer(
            params: PlayerTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
