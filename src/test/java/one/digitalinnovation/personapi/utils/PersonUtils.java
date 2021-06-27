package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Lyllyanny";
    private static final String LAST_NAME = "França";
    private static final String CPF_NUMBER = "123.456.789-80";
    private static final long PERSON_ID = 1;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1989,01,01);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("05-05-2005")
                .phone(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .email(Collections.singletonList(EmailUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phone(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .email(Collections.singletonList(EmailUtils.createFakeEntity()))
                .build();
    }
}
