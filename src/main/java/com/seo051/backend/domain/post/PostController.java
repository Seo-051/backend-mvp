package com.seo051.backend.domain.post;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Map<String, Long> create(@RequestBody PostCreateRequest req) {
        Long id = postService.create(req);
        return Map.of("id", id);
    }

    @GetMapping
    public List<PostResponse> list() {
        return postService.list();
    }

    @GetMapping("/{id}")
    public PostResponse get(@PathVariable Long id) {
        return postService.get(id);
    }
}
