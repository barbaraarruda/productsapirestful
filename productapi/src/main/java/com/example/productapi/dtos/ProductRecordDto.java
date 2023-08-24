package com.example.productapi.dtos;

import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(String, name, @NotNull BigDecimal value) {
    
}
