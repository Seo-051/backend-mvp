package com.seo051.backend.domain.post;

public record PostCreateRequest (
    String title,
    String content,
    Long userId
) {}
