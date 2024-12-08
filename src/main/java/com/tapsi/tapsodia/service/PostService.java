package com.tapsi.tapsodia.service;

import com.tapsi.tapsodia.entity.Post;
import com.tapsi.tapsodia.repository.PostRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @CacheEvict(value = "timeline", allEntries = true)
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    @CacheEvict(value = "timeline", allEntries = true)
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @CacheEvict(value = "timeline", allEntries = true)
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
