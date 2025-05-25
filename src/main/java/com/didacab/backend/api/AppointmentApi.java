package com.didacab.backend.api;

import com.didacab.backend.model.dto.AppointmentRequestDTO;
import com.didacab.backend.model.dto.AppointmentResponseDTO;
import com.didacab.backend.model.dto.ClientAppointmentsDTO;
import com.didacab.backend.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentApi {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/scheduling-save")
    public ResponseEntity<AppointmentResponseDTO> create(@RequestBody AppointmentRequestDTO dto) {
        return ResponseEntity.ok(appointmentService.create(dto));
    }

    @GetMapping("/schedule-find/{clientId}")
    public ResponseEntity<List<AppointmentResponseDTO>> findByClientId(@PathVariable Long clientId) {
        return ResponseEntity.ok(appointmentService.findByClientId(clientId));
    }

    // NOVO endpoint para cliente + agendamentos
    @GetMapping("/client-appointments/{clientId}")
    public ResponseEntity<ClientAppointmentsDTO> getClientWithAppointments(@PathVariable Long clientId) {
        ClientAppointmentsDTO dto = appointmentService.getClientWithAppointments(clientId);
        return ResponseEntity.ok(dto);
    }
}

