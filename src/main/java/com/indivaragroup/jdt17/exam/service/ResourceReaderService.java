package com.indivaragroup.jdt17.exam.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResourceReaderService {

    private final ResourceLoader resourceLoader;

    public String readBanner() {
        try {

            Resource resource = resourceLoader.getResource("classpath:banner-store.txt");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } catch (Exception e) {
            return "Failed to load banner: " + e.getMessage();
        }
    }
}
