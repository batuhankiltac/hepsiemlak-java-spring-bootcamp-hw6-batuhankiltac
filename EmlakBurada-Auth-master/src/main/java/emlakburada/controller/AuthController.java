package emlakburada.controller;

import emlakburada.model.AuthRequest;
import emlakburada.model.AuthResponse;
import emlakburada.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public final class AuthController {

	private final AuthService authService;

	@PostMapping
	public AuthResponse getToken(@RequestBody AuthRequest authRequest) throws Exception {
		return authService.getToken(authRequest);
	}
}