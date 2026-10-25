package com.traework.dto;

import java.time.Instant;

public record PingResponse(String message, long visitCount, Instant timestamp) {
}
