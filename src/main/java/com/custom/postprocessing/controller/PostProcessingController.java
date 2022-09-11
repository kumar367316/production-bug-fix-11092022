package com.custom.postprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.postprocessing.scheduler.PostProcessingScheduler;

/**
 * @author kumar.charanswain
 *
 */

@RestController
public class PostProcessingController {

    @Autowired
    private PostProcessingScheduler postProcessingScheduler;

    @GetMapping(path = "/postprocess")
    public void manualPostProcessBatch() {

        postProcessingScheduler.smartCommPostProcessing();
    }
}
