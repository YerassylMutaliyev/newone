package lab5.iitu.dto;

import lab5.iitu.entity.Session;
import lab5.iitu.entity.Users;

public record AuthResponse(
        Users user,
        Session session
) {
}
