package com.didacab.backend.service;

import com.didacab.backend.model.dto.AppointmentRequestDTO;
import com.didacab.backend.model.dto.AppointmentResponseDTO;
import com.didacab.backend.model.dto.ClientAppointmentsDTO;
import com.didacab.backend.model.entity.Appointment;
import com.didacab.backend.model.entity.Client;
import com.didacab.backend.repository.AppointmentRepository;
import com.didacab.backend.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AppointmentService {

    AppointmentRepository appointmentRepository;
    ClientRepository clientRepository;

    public AppointmentResponseDTO create(AppointmentRequestDTO dto) {
        Appointment appointment = Appointment.builder()
                .clientId(dto.clientId())
                .date(dto.date())
                .time(dto.time())
                .procedure(dto.procedure())
                .durationInMinutes(dto.procedure().getDuration())
                .build();

        Appointment saved = appointmentRepository.save(appointment);

        return new AppointmentResponseDTO(
                saved.getClientId(),
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
                        a.getClientId(),
                        a.getId(),
                        a.getDate(),
                        a.getTime(),
                        a.getDurationInMinutes(),
                        a.getProcedure()
                ))
                .toList();
    }

    public List<AppointmentResponseDTO> findByClientId(Long clientId) {
        return appointmentRepository.findByClientId(clientId).stream()
                .map(a -> new AppointmentResponseDTO(
                        a.getId(),
                        a.getClientId(),
                        a.getDate(),
                        a.getTime(),
                        a.getDurationInMinutes(),
                        a.getProcedure()
                ))
                .toList();
    }

    public ClientAppointmentsDTO getClientWithAppointments(Long clientId) {
        var client = clientRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        var appointments = appointmentRepository.findByClientId(clientId).stream()
                .map(a -> new AppointmentResponseDTO(
                        a.getId(),
                        clientId,
                        a.getDate(),
                        a.getTime(),
                        a.getDurationInMinutes(),
                        a.getProcedure()
                ))
                .toList();

        return new ClientAppointmentsDTO(
                client.getName(),
                client.getPhone(),
                appointments
        );
    }
}
