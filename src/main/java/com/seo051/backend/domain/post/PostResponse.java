package com.seo051.backend.domain.post;

public record PostResponse(
   Long id,
   String title,
   String content,
   Long userId
) {}
