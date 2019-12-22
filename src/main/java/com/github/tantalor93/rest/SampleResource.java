package com.github.tantalor93.rest;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.tantalor93.dto.Sample;

@RestController
public class SampleResource {

	private static Logger LOGGER = LoggerFactory.getLogger(SampleResource.class);

	@GetMapping("/sample")
	public Sample getSample() {
		return new Sample("ahoj", 1);
	}

	@PostMapping("/sample")
	public void createSample(@RequestBody Sample sample) {
		LOGGER.info("received '{}'", sample);
	}
}
