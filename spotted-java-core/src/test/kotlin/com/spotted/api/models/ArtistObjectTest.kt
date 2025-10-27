// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtistObjectTest {

    @Test
    fun create() {
        val artistObject =
            ArtistObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .addGenre("Prog rock")
                .addGenre("Grunge")
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .popularity(0L)
                .type(ArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        assertThat(artistObject.id()).contains("id")
        assertThat(artistObject.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(artistObject.followers())
            .contains(FollowersObject.builder().href("href").total(0L).build())
        assertThat(artistObject.genres().getOrNull()).containsExactly("Prog rock", "Grunge")
        assertThat(artistObject.href()).contains("href")
        assertThat(artistObject.images().getOrNull())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(artistObject.name()).contains("name")
        assertThat(artistObject.popularity()).contains(0L)
        assertThat(artistObject.type()).contains(ArtistObject.Type.ARTIST)
        assertThat(artistObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artistObject =
            ArtistObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .addGenre("Prog rock")
                .addGenre("Grunge")
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .name("name")
                .popularity(0L)
                .type(ArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        val roundtrippedArtistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artistObject),
                jacksonTypeRef<ArtistObject>(),
            )

        assertThat(roundtrippedArtistObject).isEqualTo(artistObject)
    }
}
