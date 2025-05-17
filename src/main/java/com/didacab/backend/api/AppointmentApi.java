package com.didacab.backend.api;

import com.didacab.backend.model.dto.AppointmentRequestDTO;
import com.didacab.backend.model.dto.AppointmentResponseDTO;
import com.didacab.backend.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppointmentApi {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/scheduling-save")
    public ResponseEntity<AppointmentResponseDTO> create(@RequestBody AppointmentRequestDTO dto) {
        return ResponseEntity.ok(appointmentService.create(dto));
    }

    @GetMapping("/schedule-find")
    public String getAll() {
        return ("Hello World!");
    }
}
