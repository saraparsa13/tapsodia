package com.tapsi.tapsodia.controller;

import com.tapsi.tapsodia.entity.Post;
import com.tapsi.tapsodia.service.TimelineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/timeline")
public class TimelineController {

    private final TimelineService timelineService;

    public TimelineController(TimelineService timelineService) {
        this.timelineService = timelineService;
    }

    @GetMapping
    public List<Post> getTimeline(@RequestParam(value = "lastId", defaultValue = "0") Long lastId) {
        return timelineService.getTimeline(lastId);
    }
}