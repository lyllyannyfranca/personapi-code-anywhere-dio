package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmailType {
    PERSONAL("Personal"),
    PROFESSIONAL("Professional");

    private final String description;
}
