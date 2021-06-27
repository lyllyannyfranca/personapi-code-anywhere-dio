package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.EmailDTO;
import one.digitalinnovation.personapi.entity.Email;
import one.digitalinnovation.personapi.enums.EmailType;

public class EmailUtils {

    private static final String EMAIL = "teste@teste.com.br";
    private static final EmailType EMAIL_TYPE= EmailType.PERSONAL;
    private static final long EMAIL_ID = 1L;

    public static EmailDTO createFakeDTO() {
        return EmailDTO.builder()
                .id(EMAIL_ID)
                .type(EMAIL_TYPE)
                .email(EMAIL)
                .build();
    }

    public static Email createFakeEntity() {
        return Email.builder()
                .id(EMAIL_ID)
                .type(EMAIL_TYPE)
                .email(EMAIL)
                .build();
    }
}
