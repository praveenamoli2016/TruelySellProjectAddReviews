package com.kaamcube.truelysell.controller;

import com.kaamcube.truelysell.model.entity.Review;
import com.kaamcube.truelysell.model.request.ReviewRequest;
import com.kaamcube.truelysell.model.responce.Response;
import com.kaamcube.truelysell.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping("/")
    public Response sendReview(@RequestBody ReviewRequest reviewRequest){
        return reviewService.sendReview(reviewRequest);
    }

    @DeleteMapping("/delete/{id}")
    public Response deleteReview(@PathVariable Long id){
        return reviewService.deleteReview(id);
    }
}
