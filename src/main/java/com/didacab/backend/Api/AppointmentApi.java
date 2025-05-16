package com.didacab.backend.Api;

import com.didacab.backend.Model.DTO.AppointmentRequestDTO;
import com.didacab.backend.Model.DTO.AppointmentResponseDTO;
import com.didacab.backend.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentApi {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/appointment")
    public ResponseEntity<AppointmentResponseDTO> create(@RequestBody AppointmentRequestDTO dto) {
        return ResponseEntity.ok(appointmentService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<AppointmentResponseDTO>> getAll() {
        return ResponseEntity.ok(appointmentService.getAll());
    }

}
