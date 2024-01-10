package io.hyubuki.test_code.app.dto;

import io.hyubuki.test_code.app.Person;

public record PersonListResponse(long peronId, String personName) {

    public PersonListResponse(Person entity) {
        this(entity.getId(), entity.getName());
    }
}
