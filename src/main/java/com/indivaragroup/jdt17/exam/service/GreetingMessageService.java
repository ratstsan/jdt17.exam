package com.indivaragroup.jdt17.exam.service;

import com.indivaragroup.jdt17.exam.config.StoreProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class GreetingMessageService {

    private final MessageSource messageSource;
    private final StoreProperties storeProperties;

    public String getGreeting(Locale locale) {
        Object[] args = new Object[]{storeProperties.getName(), storeProperties.getCity()};
        return messageSource.getMessage("store.greeting", args, locale);
    }

    public String getStatus(Locale locale) {
        String key = storeProperties.getActive() ? "store.status.active" : "store.status.inactive";
        return messageSource.getMessage(key, null, locale);
    }
}
