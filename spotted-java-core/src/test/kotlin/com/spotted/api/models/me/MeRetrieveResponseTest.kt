// File generated from our OpenAPI spec by Stainless.

package com.spotted.api.models.me

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.spotted.api.core.jsonMapper
import com.spotted.api.models.ExternalUrlObject
import com.spotted.api.models.FollowersObject
import com.spotted.api.models.ImageObject
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveResponseTest {

    @Test
    fun create() {
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .id("id")
                .country("country")
                .displayName("display_name")
                .email("email")
                .explicitContent(
                    MeRetrieveResponse.ExplicitContent.builder()
                        .filterEnabled(true)
                        .filterLocked(true)
                        .build()
                )
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .product("product")
                .type("type")
                .uri("uri")
                .build()

        assertThat(meRetrieveResponse.id()).contains("id")
        assertThat(meRetrieveResponse.country()).contains("country")
        assertThat(meRetrieveResponse.displayName()).contains("display_name")
        assertThat(meRetrieveResponse.email()).contains("email")
        assertThat(meRetrieveResponse.explicitContent())
            .contains(
                MeRetrieveResponse.ExplicitContent.builder()
                    .filterEnabled(true)
                    .filterLocked(true)
                    .build()
            )
        assertThat(meRetrieveResponse.externalUrls())
            .contains(ExternalUrlObject.builder().spotify("spotify").build())
        assertThat(meRetrieveResponse.followers())
            .contains(FollowersObject.builder().href("href").total(0L).build())
        assertThat(meRetrieveResponse.href()).contains("href")
        assertThat(meRetrieveResponse.images().getOrNull())
            .containsExactly(
                ImageObject.builder()
                    .height(300L)
                    .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                    .width(300L)
                    .build()
            )
        assertThat(meRetrieveResponse.product()).contains("product")
        assertThat(meRetrieveResponse.type()).contains("type")
        assertThat(meRetrieveResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meRetrieveResponse =
            MeRetrieveResponse.builder()
                .id("id")
                .country("country")
                .displayName("display_name")
                .email("email")
                .explicitContent(
                    MeRetrieveResponse.ExplicitContent.builder()
                        .filterEnabled(true)
                        .filterLocked(true)
                        .build()
                )
                .externalUrls(ExternalUrlObject.builder().spotify("spotify").build())
                .followers(FollowersObject.builder().href("href").total(0L).build())
                .href("href")
                .addImage(
                    ImageObject.builder()
                        .height(300L)
                        .url("https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228\n")
                        .width(300L)
                        .build()
                )
                .product("product")
                .type("type")
                .uri("uri")
                .build()

        val roundtrippedMeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meRetrieveResponse),
                jacksonTypeRef<MeRetrieveResponse>(),
            )

        assertThat(roundtrippedMeRetrieveResponse).isEqualTo(meRetrieveResponse)
    }
}
