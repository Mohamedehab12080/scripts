package com.scripts.controller.scripts.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class auditorAwareImpl implements AuditorAware<String>{

	
	@Override
	public Optional<String> getCurrentAuditor() {
        return Optional.of("Admin");
	}

}
