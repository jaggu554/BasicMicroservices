package com.example.open;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface Greet {

	@GetMapping("/greet")
	public String invokeGreet();
}
