package org.formation.service;

import org.formation.dto.CoffeeCreateDto;
import org.formation.dto.CoffeeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CoffeeService
{
    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CoffeeCreateDto createRequest);
}
