package com.traework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traework.dto.PingResponse;
import com.traework.service.PingService;

@RestController
@RequestMapping("/api")
public class PingController {

	private final PingService pingService;

	public PingController(PingService pingService) {
		this.pingService = pingService;
	}

	@GetMapping("/ping")
	public PingResponse ping() {
		return pingService.ping();
	}

}
