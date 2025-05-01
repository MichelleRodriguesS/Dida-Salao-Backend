package com.didacab.backend.Data.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProcedureDTO {

    private double price;
    //  private int id;
    private int duration;
    private String name;

    public ProcedureDTO(String name, int duration, double price) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        //  this.id = getId(); // Ou outra lógica para definir o ID, se necessário
    }
}
