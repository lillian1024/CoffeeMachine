package org.formation.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.formation.dto.CoffeeCreateDto;
import org.formation.dto.CoffeeDto;
import org.formation.service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("coffees")
@AllArgsConstructor
public class CoffeeController
{
    private CoffeeService service;

    @GetMapping
    public List<CoffeeDto> coffees()
    {
        return service.allCoffees();
    }

    @GetMapping("{id}")
    public ResponseEntity<CoffeeDto> coffee(Long id)
    {
        return service.oneCoffee(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public CoffeeDto create(@RequestBody @Valid CoffeeCreateDto createRequest)
    {
        return service.create(createRequest);
    }
}
