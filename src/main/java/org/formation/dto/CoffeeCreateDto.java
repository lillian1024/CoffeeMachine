package org.formation.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CoffeeCreateDto(
        @NotNull(message = "Coffee name cannot be null") String name,
        @Positive(message = "Price should be positive") Long price)
{
}
