package com.javawhizz.DTOPattern.user;

public record UserDTO(
        Long userId,
        String firstName,
        String lastName,
        String email
) {
}
