package com.didacab.backend.model.dto;

import java.util.List;

public record ClientAppointmentsDTO(
        String name,
        String phone,
        List<AppointmentResponseDTO> appointments
) {
}
