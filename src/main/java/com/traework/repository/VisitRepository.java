package com.traework.repository;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

@Repository
public class VisitRepository {

	private final AtomicLong counter = new AtomicLong();

	public long recordVisit() {
		return counter.incrementAndGet();
	}

}
