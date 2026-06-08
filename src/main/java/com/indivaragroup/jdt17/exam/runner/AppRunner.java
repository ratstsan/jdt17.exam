package com.indivaragroup.jdt17.exam.runner;

import com.indivaragroup.jdt17.exam.service.GreetingMessageService;
import com.indivaragroup.jdt17.exam.service.ResourceReaderService;
import com.indivaragroup.jdt17.exam.service.StoreInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class AppRunner implements CommandLineRunner {

    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    @Override
    public void run(String... args) throws Exception {
        // 1. Print banner
        System.out.println("\n" + resourceReaderService.readBanner());

        // 2. Print store info
        System.out.println(storeInfoService.getStoreInformation());
        System.out.println();

        // 3. Print greeting EN (English)
        Locale englishLocale = Locale.ENGLISH;
        System.out.println("[EN] " + greetingMessageService.getGreeting(englishLocale));
        System.out.println("[EN] " + greetingMessageService.getStatus(englishLocale));
        System.out.println();

        // 4. Print greeting ID (Indonesian)
        Locale indonesianLocale = new Locale("id", "ID");
        System.out.println("[ID] " + greetingMessageService.getGreeting(indonesianLocale));
        System.out.println("[ID] " + greetingMessageService.getStatus(indonesianLocale));
        System.out.println("=================================\n");
    }
}