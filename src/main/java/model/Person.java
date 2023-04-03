package model;

import lombok.Builder;

@Builder
public record Person(
        String firstName,
        String lastName,
        Integer age,
        String city
) {
}
