// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplifiedArtistObjectTest {

    @Test
    fun create() {
        val simplifiedArtistObject =
            SimplifiedArtistObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .name("name")
                .type(SimplifiedArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        assertThat(simplifiedArtistObject.id()).contains("id")
        assertThat(simplifiedArtistObject.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(simplifiedArtistObject.href()).contains("href")
        assertThat(simplifiedArtistObject.name()).contains("name")
        assertThat(simplifiedArtistObject.type()).contains(SimplifiedArtistObject.Type.ARTIST)
        assertThat(simplifiedArtistObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplifiedArtistObject =
            SimplifiedArtistObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .name("name")
                .type(SimplifiedArtistObject.Type.ARTIST)
                .uri("uri")
                .build()

        val roundtrippedSimplifiedArtistObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplifiedArtistObject),
                jacksonTypeRef<SimplifiedArtistObject>(),
            )

        assertThat(roundtrippedSimplifiedArtistObject).isEqualTo(simplifiedArtistObject)
    }
}
