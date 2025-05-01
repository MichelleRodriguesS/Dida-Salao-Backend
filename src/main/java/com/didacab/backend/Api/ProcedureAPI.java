package com.didacab.backend.Api;

import com.didacab.backend.Data.DTO.ProcedureDTO;
import com.didacab.backend.Service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcedureAPI {

    @Autowired
    ProcedureService procedureService;

    @GetMapping("Procedures")
    @ResponseBody
    public List<ProcedureDTO> Procedures() {
       return procedureService.getAllProcedures();

    }
}
