package com.didacab.backend.service;

import com.didacab.backend.model.dto.AppointmentRequestDTO;
import com.didacab.backend.model.dto.AppointmentResponseDTO;
import com.didacab.backend.model.entity.Appointment;
import com.didacab.backend.repository.AppointmentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AppointmentService {

    AppointmentRepository appointmentRepository;

    public AppointmentResponseDTO create(AppointmentRequestDTO dto) {
        Appointment appointment = Appointment.builder()
                .date(dto.date())
                .time(dto.time())
                .procedure(dto.procedure())
                .durationInMinutes(dto.procedure().getDuration())
                .build();

        Appointment saved = appointmentRepository.save(appointment);

        return new AppointmentResponseDTO(
                saved.getId(),
                saved.getDate(),
                saved.getTime(),
                saved.getDurationInMinutes(),
                saved.getProcedure()
        );
    }

    public List<AppointmentResponseDTO> getAll() {
        return appointmentRepository.findAll().stream()
                .map(a -> new AppointmentResponseDTO(
                        a.getId(),
                        a.getDate(),
                        a.getTime(),
                        a.getDurationInMinutes(),
                        a.getProcedure()
                ))
                .toList();
    }
}