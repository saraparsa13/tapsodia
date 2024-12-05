package com.tapsi.tapsodia.service;

import com.tapsi.tapsodia.entity.Post;
import com.tapsi.tapsodia.repository.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimelineService {

    private static final int TIMELINE_SIZE = 10;
    private final PostRepository postRepository;

    public TimelineService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getTimeline(Long lastId) {
        Pageable pageable = PageRequest.of(0, TIMELINE_SIZE);
        return postRepository.findByIdLessThanOrderByCreatedAtDesc(lastId, pageable);
    }
}