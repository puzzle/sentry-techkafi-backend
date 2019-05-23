package ch.puzzle.sentrytechkafibackend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class BackendController {

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value="/post")
	public void post() {
		throw new RuntimeException("TechKafi #Sentry Error during Post Request");
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping(value="/get")
	public String get() {
		throw new RuntimeException("TechKafi #Sentry Error during Get Request");
	}
	
}
