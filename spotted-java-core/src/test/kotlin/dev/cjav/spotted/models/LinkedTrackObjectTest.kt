// File generated from our OpenAPI spec by Stainless.

package dev.cjav.spotted.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.spotted.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedTrackObjectTest {

    @Test
    fun create() {
        val linkedTrackObject =
            LinkedTrackObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        assertThat(linkedTrackObject.id()).contains("id")
        assertThat(linkedTrackObject.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(linkedTrackObject.href()).contains("href")
        assertThat(linkedTrackObject.type()).contains("type")
        assertThat(linkedTrackObject.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkedTrackObject =
            LinkedTrackObject.builder()
                .id("id")
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .href("href")
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedLinkedTrackObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkedTrackObject),
                jacksonTypeRef<LinkedTrackObject>(),
            )

        assertThat(roundtrippedLinkedTrackObject).isEqualTo(linkedTrackObject)
    }
}
