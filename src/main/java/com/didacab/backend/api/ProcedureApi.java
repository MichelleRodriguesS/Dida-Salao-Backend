package com.didacab.backend.api;

import com.didacab.backend.model.dto.ProcedureDTO;
import com.didacab.backend.service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcedureApi {

    @Autowired
    ProcedureService procedureService;

    @GetMapping("Procedures")
    @ResponseBody
    public List<ProcedureDTO> Procedures() {
       return procedureService.getAllProcedures();

    }
}