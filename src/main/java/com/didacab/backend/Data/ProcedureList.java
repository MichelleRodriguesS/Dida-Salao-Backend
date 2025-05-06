package com.didacab.backend.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProcedureList {
    HAIR_CUT("Corte de cabelo", 30, 50.00, 1),
    HAIR_COLORING("Coloração", 90, 120.00, 2),
    TREATMENT("Tratamento", 40, 120.00, 3),
    CHEMICAL_TREATMENT("Química em geral", 90, 120.00, 4),
    SCALP_THERAPY("Terapia Capilar", 90, 120.00, 5),
    BLOWOUT("Escova", 90, 120.00, 6),
    HYDRATION("Hidratação", 90, 120.00, 7),
    FULL_BODY_HAIR_REMOVAL("Depilação completa", 90, 120.00, 8),
    BIKINI_LINE("Depilação Virilha", 90, 120.00, 9),
    UNDERARMS("Depilação de Axila", 90, 120.00, 10),
    FULL_LEGS("Depilação Perna Inteira", 90, 120.00, 11),
    HALF_LEGS("Depilação Meia Perna", 90, 120.00, 12),
    UPPER_LIP("Depilação de Buço", 90, 120.00, 13),
    EYEBROWS("Depilação de Sobrancelha", 90, 120.00, 14);

    private final String name;
    private final int duration;
    private final double price;
    private final int id;
}