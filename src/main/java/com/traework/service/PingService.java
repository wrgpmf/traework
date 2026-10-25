package com.traework.service;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.traework.dto.PingResponse;
import com.traework.repository.VisitRepository;

@Service
public class PingService {

	private final VisitRepository visitRepository;

	public PingService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}

	public PingResponse ping() {
		long count = visitRepository.recordVisit();
		return new PingResponse("pong", count, Instant.now());
	}

}
