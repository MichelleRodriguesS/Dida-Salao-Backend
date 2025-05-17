package com.didacab.backend.service;

import com.didacab.backend.model.dto.ProcedureDTO;
import com.didacab.backend.model.ProcedureList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProcedureService {

    public List<ProcedureDTO> getAllProcedures() {
        List<ProcedureDTO> procedureDTOList = new ArrayList<>();

        // Convertendo cada valor do enum para um DTO
        for (ProcedureList procedure : ProcedureList.values()) {
            procedureDTOList.add(new ProcedureDTO(procedure.getName(), procedure.getDuration(), procedure.getPrice()));
        }
        return procedureDTOList;
    }
}