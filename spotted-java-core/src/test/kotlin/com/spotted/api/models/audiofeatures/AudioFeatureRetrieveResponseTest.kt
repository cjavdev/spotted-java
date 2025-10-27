// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.audiofeatures

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioFeatureRetrieveResponseTest {

    @Test
    fun create() {
        val audioFeatureRetrieveResponse =
            AudioFeatureRetrieveResponse.builder()
                .id("2takcwOaAZWiXQijPHIx7B")
                .acousticness(0.00242f)
                .analysisUrl("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
                .danceability(0.585f)
                .durationMs(237040L)
                .energy(0.842f)
                .instrumentalness(0.00686f)
                .key(9L)
                .liveness(0.0866f)
                .loudness(-5.883f)
                .mode(0L)
                .speechiness(0.0556f)
                .tempo(118.211f)
                .timeSignature(4L)
                .trackHref("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
                .type(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
                .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                .valence(0.428f)
                .build()

        assertThat(audioFeatureRetrieveResponse.id()).contains("2takcwOaAZWiXQijPHIx7B")
        assertThat(audioFeatureRetrieveResponse.acousticness()).contains(0.00242f)
        assertThat(audioFeatureRetrieveResponse.analysisUrl())
            .contains("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
        assertThat(audioFeatureRetrieveResponse.danceability()).contains(0.585f)
        assertThat(audioFeatureRetrieveResponse.durationMs()).contains(237040L)
        assertThat(audioFeatureRetrieveResponse.energy()).contains(0.842f)
        assertThat(audioFeatureRetrieveResponse.instrumentalness()).contains(0.00686f)
        assertThat(audioFeatureRetrieveResponse.key()).contains(9L)
        assertThat(audioFeatureRetrieveResponse.liveness()).contains(0.0866f)
        assertThat(audioFeatureRetrieveResponse.loudness()).contains(-5.883f)
        assertThat(audioFeatureRetrieveResponse.mode()).contains(0L)
        assertThat(audioFeatureRetrieveResponse.speechiness()).contains(0.0556f)
        assertThat(audioFeatureRetrieveResponse.tempo()).contains(118.211f)
        assertThat(audioFeatureRetrieveResponse.timeSignature()).contains(4L)
        assertThat(audioFeatureRetrieveResponse.trackHref())
            .contains("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
        assertThat(audioFeatureRetrieveResponse.type())
            .contains(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
        assertThat(audioFeatureRetrieveResponse.uri())
            .contains("spotify:track:2takcwOaAZWiXQijPHIx7B")
        assertThat(audioFeatureRetrieveResponse.valence()).contains(0.428f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val audioFeatureRetrieveResponse =
            AudioFeatureRetrieveResponse.builder()
                .id("2takcwOaAZWiXQijPHIx7B")
                .acousticness(0.00242f)
                .analysisUrl("https://api.spotify.com/v1/audio-analysis/2takcwOaAZWiXQijPHIx7B\n")
                .danceability(0.585f)
                .durationMs(237040L)
                .energy(0.842f)
                .instrumentalness(0.00686f)
                .key(9L)
                .liveness(0.0866f)
                .loudness(-5.883f)
                .mode(0L)
                .speechiness(0.0556f)
                .tempo(118.211f)
                .timeSignature(4L)
                .trackHref("https://api.spotify.com/v1/tracks/2takcwOaAZWiXQijPHIx7B\n")
                .type(AudioFeatureRetrieveResponse.Type.AUDIO_FEATURES)
                .uri("spotify:track:2takcwOaAZWiXQijPHIx7B")
                .valence(0.428f)
                .build()

        val roundtrippedAudioFeatureRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(audioFeatureRetrieveResponse),
                jacksonTypeRef<AudioFeatureRetrieveResponse>(),
            )

        assertThat(roundtrippedAudioFeatureRetrieveResponse).isEqualTo(audioFeatureRetrieveResponse)
    }
}
