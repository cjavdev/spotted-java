// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.services.blocking.me

import com.google.errorprone.annotations.MustBeClosed
import com.spotted.api.core.ClientOptions
import com.spotted.api.core.RequestOptions
import com.spotted.api.core.http.HttpResponse
import com.spotted.api.core.http.HttpResponseFor
import com.spotted.api.models.me.player.PlayerGetCurrentlyPlayingParams
import com.spotted.api.models.me.player.PlayerGetCurrentlyPlayingResponse
import com.spotted.api.models.me.player.PlayerGetDevicesParams
import com.spotted.api.models.me.player.PlayerGetDevicesResponse
import com.spotted.api.models.me.player.PlayerGetStateParams
import com.spotted.api.models.me.player.PlayerGetStateResponse
import com.spotted.api.models.me.player.PlayerListRecentlyPlayedPage
import com.spotted.api.models.me.player.PlayerListRecentlyPlayedParams
import com.spotted.api.models.me.player.PlayerPausePlaybackParams
import com.spotted.api.models.me.player.PlayerSeekToPositionParams
import com.spotted.api.models.me.player.PlayerSetRepeatModeParams
import com.spotted.api.models.me.player.PlayerSetVolumeParams
import com.spotted.api.models.me.player.PlayerSkipNextParams
import com.spotted.api.models.me.player.PlayerSkipPreviousParams
import com.spotted.api.models.me.player.PlayerStartPlaybackParams
import com.spotted.api.models.me.player.PlayerToggleShuffleParams
import com.spotted.api.models.me.player.PlayerTransferParams
import com.spotted.api.services.blocking.me.player.QueueService
import java.util.function.Consumer

interface PlayerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerService

    fun queue(): QueueService

    /** Get the object currently being played on the user's Spotify account. */
    fun getCurrentlyPlaying(): PlayerGetCurrentlyPlayingResponse =
        getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none())

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetCurrentlyPlayingResponse

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(
        params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none()
    ): PlayerGetCurrentlyPlayingResponse = getCurrentlyPlaying(params, RequestOptions.none())

    /** @see getCurrentlyPlaying */
    fun getCurrentlyPlaying(requestOptions: RequestOptions): PlayerGetCurrentlyPlayingResponse =
        getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

    /**
     * Get information about a user’s available Spotify Connect devices. Some device models are not
     * supported and will not be listed in the API response.
     */
    fun getDevices(): PlayerGetDevicesResponse = getDevices(PlayerGetDevicesParams.none())

    /** @see getDevices */
    fun getDevices(
        params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetDevicesResponse

    /** @see getDevices */
    fun getDevices(
        params: PlayerGetDevicesParams = PlayerGetDevicesParams.none()
    ): PlayerGetDevicesResponse = getDevices(params, RequestOptions.none())

    /** @see getDevices */
    fun getDevices(requestOptions: RequestOptions): PlayerGetDevicesResponse =
        getDevices(PlayerGetDevicesParams.none(), requestOptions)

    /**
     * Get information about the user’s current playback state, including track or episode,
     * progress, and active device.
     */
    fun getState(): PlayerGetStateResponse = getState(PlayerGetStateParams.none())

    /** @see getState */
    fun getState(
        params: PlayerGetStateParams = PlayerGetStateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerGetStateResponse

    /** @see getState */
    fun getState(
        params: PlayerGetStateParams = PlayerGetStateParams.none()
    ): PlayerGetStateResponse = getState(params, RequestOptions.none())

    /** @see getState */
    fun getState(requestOptions: RequestOptions): PlayerGetStateResponse =
        getState(PlayerGetStateParams.none(), requestOptions)

    /**
     * Get tracks from the current user's recently played tracks. _**Note**: Currently doesn't
     * support podcast episodes._
     */
    fun listRecentlyPlayed(): PlayerListRecentlyPlayedPage =
        listRecentlyPlayed(PlayerListRecentlyPlayedParams.none())

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlayerListRecentlyPlayedPage

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(
        params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none()
    ): PlayerListRecentlyPlayedPage = listRecentlyPlayed(params, RequestOptions.none())

    /** @see listRecentlyPlayed */
    fun listRecentlyPlayed(requestOptions: RequestOptions): PlayerListRecentlyPlayedPage =
        listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

    /**
     * Pause playback on the user's account. This API only works for users who have Spotify Premium.
     * The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun pausePlayback() = pausePlayback(PlayerPausePlaybackParams.none())

    /** @see pausePlayback */
    fun pausePlayback(
        params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pausePlayback */
    fun pausePlayback(params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none()) =
        pausePlayback(params, RequestOptions.none())

    /** @see pausePlayback */
    fun pausePlayback(requestOptions: RequestOptions) =
        pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

    /**
     * Seeks to the given position in the user’s currently playing track. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    fun seekToPosition(params: PlayerSeekToPositionParams) =
        seekToPosition(params, RequestOptions.none())

    /** @see seekToPosition */
    fun seekToPosition(
        params: PlayerSeekToPositionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Set the repeat mode for the user's playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun setRepeatMode(params: PlayerSetRepeatModeParams) =
        setRepeatMode(params, RequestOptions.none())

    /** @see setRepeatMode */
    fun setRepeatMode(
        params: PlayerSetRepeatModeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Set the volume for the user’s current playback device. This API only works for users who have
     * Spotify Premium. The order of execution is not guaranteed when you use this API with other
     * Player API endpoints.
     */
    fun setVolume(params: PlayerSetVolumeParams) = setVolume(params, RequestOptions.none())

    /** @see setVolume */
    fun setVolume(
        params: PlayerSetVolumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Skips to next track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun skipNext() = skipNext(PlayerSkipNextParams.none())

    /** @see skipNext */
    fun skipNext(
        params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see skipNext */
    fun skipNext(params: PlayerSkipNextParams = PlayerSkipNextParams.none()) =
        skipNext(params, RequestOptions.none())

    /** @see skipNext */
    fun skipNext(requestOptions: RequestOptions) =
        skipNext(PlayerSkipNextParams.none(), requestOptions)

    /**
     * Skips to previous track in the user’s queue. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun skipPrevious() = skipPrevious(PlayerSkipPreviousParams.none())

    /** @see skipPrevious */
    fun skipPrevious(
        params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see skipPrevious */
    fun skipPrevious(params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none()) =
        skipPrevious(params, RequestOptions.none())

    /** @see skipPrevious */
    fun skipPrevious(requestOptions: RequestOptions) =
        skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

    /**
     * Start a new context or resume current playback on the user's active device. This API only
     * works for users who have Spotify Premium. The order of execution is not guaranteed when you
     * use this API with other Player API endpoints.
     */
    fun startPlayback() = startPlayback(PlayerStartPlaybackParams.none())

    /** @see startPlayback */
    fun startPlayback(
        params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see startPlayback */
    fun startPlayback(params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none()) =
        startPlayback(params, RequestOptions.none())

    /** @see startPlayback */
    fun startPlayback(requestOptions: RequestOptions) =
        startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

    /**
     * Toggle shuffle on or off for user’s playback. This API only works for users who have Spotify
     * Premium. The order of execution is not guaranteed when you use this API with other Player API
     * endpoints.
     */
    fun toggleShuffle(params: PlayerToggleShuffleParams) =
        toggleShuffle(params, RequestOptions.none())

    /** @see toggleShuffle */
    fun toggleShuffle(
        params: PlayerToggleShuffleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Transfer playback to a new device and optionally begin playback. This API only works for
     * users who have Spotify Premium. The order of execution is not guaranteed when you use this
     * API with other Player API endpoints.
     */
    fun transfer(params: PlayerTransferParams) = transfer(params, RequestOptions.none())

    /** @see transfer */
    fun transfer(
        params: PlayerTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [PlayerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlayerService.WithRawResponse

        fun queue(): QueueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /me/player/currently-playing`, but is otherwise the
         * same as [PlayerService.getCurrentlyPlaying].
         */
        @MustBeClosed
        fun getCurrentlyPlaying(): HttpResponseFor<PlayerGetCurrentlyPlayingResponse> =
            getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none())

        /** @see getCurrentlyPlaying */
        @MustBeClosed
        fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse>

        /** @see getCurrentlyPlaying */
        @MustBeClosed
        fun getCurrentlyPlaying(
            params: PlayerGetCurrentlyPlayingParams = PlayerGetCurrentlyPlayingParams.none()
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse> =
            getCurrentlyPlaying(params, RequestOptions.none())

        /** @see getCurrentlyPlaying */
        @MustBeClosed
        fun getCurrentlyPlaying(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerGetCurrentlyPlayingResponse> =
            getCurrentlyPlaying(PlayerGetCurrentlyPlayingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/devices`, but is otherwise the same as
         * [PlayerService.getDevices].
         */
        @MustBeClosed
        fun getDevices(): HttpResponseFor<PlayerGetDevicesResponse> =
            getDevices(PlayerGetDevicesParams.none())

        /** @see getDevices */
        @MustBeClosed
        fun getDevices(
            params: PlayerGetDevicesParams = PlayerGetDevicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetDevicesResponse>

        /** @see getDevices */
        @MustBeClosed
        fun getDevices(
            params: PlayerGetDevicesParams = PlayerGetDevicesParams.none()
        ): HttpResponseFor<PlayerGetDevicesResponse> = getDevices(params, RequestOptions.none())

        /** @see getDevices */
        @MustBeClosed
        fun getDevices(requestOptions: RequestOptions): HttpResponseFor<PlayerGetDevicesResponse> =
            getDevices(PlayerGetDevicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player`, but is otherwise the same as
         * [PlayerService.getState].
         */
        @MustBeClosed
        fun getState(): HttpResponseFor<PlayerGetStateResponse> =
            getState(PlayerGetStateParams.none())

        /** @see getState */
        @MustBeClosed
        fun getState(
            params: PlayerGetStateParams = PlayerGetStateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerGetStateResponse>

        /** @see getState */
        @MustBeClosed
        fun getState(
            params: PlayerGetStateParams = PlayerGetStateParams.none()
        ): HttpResponseFor<PlayerGetStateResponse> = getState(params, RequestOptions.none())

        /** @see getState */
        @MustBeClosed
        fun getState(requestOptions: RequestOptions): HttpResponseFor<PlayerGetStateResponse> =
            getState(PlayerGetStateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /me/player/recently-played`, but is otherwise the
         * same as [PlayerService.listRecentlyPlayed].
         */
        @MustBeClosed
        fun listRecentlyPlayed(): HttpResponseFor<PlayerListRecentlyPlayedPage> =
            listRecentlyPlayed(PlayerListRecentlyPlayedParams.none())

        /** @see listRecentlyPlayed */
        @MustBeClosed
        fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlayerListRecentlyPlayedPage>

        /** @see listRecentlyPlayed */
        @MustBeClosed
        fun listRecentlyPlayed(
            params: PlayerListRecentlyPlayedParams = PlayerListRecentlyPlayedParams.none()
        ): HttpResponseFor<PlayerListRecentlyPlayedPage> =
            listRecentlyPlayed(params, RequestOptions.none())

        /** @see listRecentlyPlayed */
        @MustBeClosed
        fun listRecentlyPlayed(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlayerListRecentlyPlayedPage> =
            listRecentlyPlayed(PlayerListRecentlyPlayedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/pause`, but is otherwise the same as
         * [PlayerService.pausePlayback].
         */
        @MustBeClosed
        fun pausePlayback(): HttpResponse = pausePlayback(PlayerPausePlaybackParams.none())

        /** @see pausePlayback */
        @MustBeClosed
        fun pausePlayback(
            params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pausePlayback */
        @MustBeClosed
        fun pausePlayback(
            params: PlayerPausePlaybackParams = PlayerPausePlaybackParams.none()
        ): HttpResponse = pausePlayback(params, RequestOptions.none())

        /** @see pausePlayback */
        @MustBeClosed
        fun pausePlayback(requestOptions: RequestOptions): HttpResponse =
            pausePlayback(PlayerPausePlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/seek`, but is otherwise the same as
         * [PlayerService.seekToPosition].
         */
        @MustBeClosed
        fun seekToPosition(params: PlayerSeekToPositionParams): HttpResponse =
            seekToPosition(params, RequestOptions.none())

        /** @see seekToPosition */
        @MustBeClosed
        fun seekToPosition(
            params: PlayerSeekToPositionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player/repeat`, but is otherwise the same as
         * [PlayerService.setRepeatMode].
         */
        @MustBeClosed
        fun setRepeatMode(params: PlayerSetRepeatModeParams): HttpResponse =
            setRepeatMode(params, RequestOptions.none())

        /** @see setRepeatMode */
        @MustBeClosed
        fun setRepeatMode(
            params: PlayerSetRepeatModeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player/volume`, but is otherwise the same as
         * [PlayerService.setVolume].
         */
        @MustBeClosed
        fun setVolume(params: PlayerSetVolumeParams): HttpResponse =
            setVolume(params, RequestOptions.none())

        /** @see setVolume */
        @MustBeClosed
        fun setVolume(
            params: PlayerSetVolumeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /me/player/next`, but is otherwise the same as
         * [PlayerService.skipNext].
         */
        @MustBeClosed fun skipNext(): HttpResponse = skipNext(PlayerSkipNextParams.none())

        /** @see skipNext */
        @MustBeClosed
        fun skipNext(
            params: PlayerSkipNextParams = PlayerSkipNextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see skipNext */
        @MustBeClosed
        fun skipNext(params: PlayerSkipNextParams = PlayerSkipNextParams.none()): HttpResponse =
            skipNext(params, RequestOptions.none())

        /** @see skipNext */
        @MustBeClosed
        fun skipNext(requestOptions: RequestOptions): HttpResponse =
            skipNext(PlayerSkipNextParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /me/player/previous`, but is otherwise the same as
         * [PlayerService.skipPrevious].
         */
        @MustBeClosed
        fun skipPrevious(): HttpResponse = skipPrevious(PlayerSkipPreviousParams.none())

        /** @see skipPrevious */
        @MustBeClosed
        fun skipPrevious(
            params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see skipPrevious */
        @MustBeClosed
        fun skipPrevious(
            params: PlayerSkipPreviousParams = PlayerSkipPreviousParams.none()
        ): HttpResponse = skipPrevious(params, RequestOptions.none())

        /** @see skipPrevious */
        @MustBeClosed
        fun skipPrevious(requestOptions: RequestOptions): HttpResponse =
            skipPrevious(PlayerSkipPreviousParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/play`, but is otherwise the same as
         * [PlayerService.startPlayback].
         */
        @MustBeClosed
        fun startPlayback(): HttpResponse = startPlayback(PlayerStartPlaybackParams.none())

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(
            params: PlayerStartPlaybackParams = PlayerStartPlaybackParams.none()
        ): HttpResponse = startPlayback(params, RequestOptions.none())

        /** @see startPlayback */
        @MustBeClosed
        fun startPlayback(requestOptions: RequestOptions): HttpResponse =
            startPlayback(PlayerStartPlaybackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /me/player/shuffle`, but is otherwise the same as
         * [PlayerService.toggleShuffle].
         */
        @MustBeClosed
        fun toggleShuffle(params: PlayerToggleShuffleParams): HttpResponse =
            toggleShuffle(params, RequestOptions.none())

        /** @see toggleShuffle */
        @MustBeClosed
        fun toggleShuffle(
            params: PlayerToggleShuffleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /me/player`, but is otherwise the same as
         * [PlayerService.transfer].
         */
        @MustBeClosed
        fun transfer(params: PlayerTransferParams): HttpResponse =
            transfer(params, RequestOptions.none())

        /** @see transfer */
        @MustBeClosed
        fun transfer(
            params: PlayerTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
