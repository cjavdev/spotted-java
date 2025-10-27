// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedTrackObjectTest {

    @Test
    fun create() {
        val simplifiedTrackObject =
            SimplifiedTrackObject.builder()
                .id("id")
                .addArtist(
                    SimplifiedArtistObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .name("name")
                        .type(SimplifiedArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .addAvailableMarket("string")
                .discNumber(0L)
                .durationMs(0L)
                .explicit(true)
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .isLocal(true)
                .isPlayable(true)
                .linkedFrom(
                    LinkedTrackObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .name("name")
                .previewUrl("preview_url")
                .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                .trackNumber(0L)
                .type("type")
                .uri("uri")
                .build()

        assertThat(simplifiedTrackObject.id()).contains("id")
        assertThat(simplifiedTrackObject.artists().getOrNull())
            .containsExactly(
                SimplifiedArtistObject.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .name("name")
                    .type(SimplifiedArtistObject.Type.ARTIST)
                    .uri("uri")
                    .build()
            )
        assertThat(simplifiedTrackObject.availableMarkets().getOrNull()).containsExactly("string")
        assertThat(simplifiedTrackObject.discNumber()).contains(0L)
        assertThat(simplifiedTrackObject.durationMs()).contains(0L)
        assertThat(simplifiedTrackObject.explicit()).contains(true)
        assertThat(simplifiedTrackObject.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(simplifiedTrackObject.href()).contains("href")
        assertThat(simplifiedTrackObject.isLocal()).contains(true)
        assertThat(simplifiedTrackObject.isPlayable()).contains(true)
        assertThat(simplifiedTrackObject.linkedFrom())
            .contains(
                LinkedTrackObject.builder()
                    .id("id")
                    .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                    .href("href")
                    .type("type")
                    .uri("uri")
                    .build()
            )
        assertThat(simplifiedTrackObject.name()).contains("name")
        assertThat(simplifiedTrackObject.previewUrl()).contains("preview_url")
        assertThat(simplifiedTrackObject.restrictions())
            .contains(TrackRestrictionObject.builder().reason("reason").build())
        assertThat(simplifiedTrackObject.trackNumber()).contains(0L)
        assertThat(simplifiedTrackObject.type()).contains("type")
        assertThat(simplifiedTrackObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedTrackObject =
            SimplifiedTrackObject.builder()
                .id("id")
                .addArtist(
                    SimplifiedArtistObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .name("name")
                        .type(SimplifiedArtistObject.Type.ARTIST)
                        .uri("uri")
                        .build()
                )
                .addAvailableMarket("string")
                .discNumber(0L)
                .durationMs(0L)
                .explicit(true)
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .isLocal(true)
                .isPlayable(true)
                .linkedFrom(
                    LinkedTrackObject.builder()
                        .id("id")
                        .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                        .href("href")
                        .type("type")
                        .uri("uri")
                        .build()
                )
                .name("name")
                .previewUrl("preview_url")
                .restrictions(TrackRestrictionObject.builder().reason("reason").build())
                .trackNumber(0L)
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedSimplifiedTrackObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedTrackObject),
                jacksonTypeRef<SimplifiedTrackObject>(),
            )

        assertThat(roundtrippedSimplifiedTrackObject).isEqualTo(simplifiedTrackObject)
    }
}
