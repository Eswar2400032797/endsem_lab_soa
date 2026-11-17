
package com.example.touristmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.repository.TouristRepository;

@Service
public class TouristService {

    @Autowired
    private TouristRepository repo;

    private final String VALID_TOKEN = "ABC123";

    public String createTourist(Tourist t, String token) {

        // Step 1: Validate token
        if (token == null || !token.equals(VALID_TOKEN)) {

            throw new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Token Validation Failed"
            );
        }

        // Step 2: Save tourist details
        repo.save(t);

        return "Tourist Created Successfully";
    }
}
