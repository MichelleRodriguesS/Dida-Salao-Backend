package com.didacab.backend.Service;

import com.didacab.backend.Model.DTO.AppointmentRequestDTO;
import com.didacab.backend.Model.DTO.AppointmentResponseDTO;
import com.didacab.backend.Model.Entity.Appointment;
import com.didacab.backend.Repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AppointmentService {

     AppointmentRepository repository;

    public AppointmentResponseDTO create(AppointmentRequestDTO dto) {
        Appointment appointment = Appointment.builder()
                .date(dto.date())
                .time(dto.time())
                .procedure(dto.procedure())
                .durationInMinutes(dto.procedure().getDuration())
                .build();

        Appointment saved = repository.save(appointment);

        return new AppointmentResponseDTO(
                saved.getId(),
                saved.getDate(),
                saved.getTime(),
                saved.getDurationInMinutes(),
                saved.getProcedure()
        );
    }

    public List<AppointmentResponseDTO> getAll() {
        return repository.findAll().stream()
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
