package com.example.people_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @GetMapping
    public List<Person> getAll() { return repository.findAll(); }

    @PostMapping
    public Person create(@RequestBody Person person) { return repository.save(person); }

    @GetMapping("/{id}")
    public Person getById(@PathVariable String id) { return repository.findById(id).orElse(null); }

    @PutMapping("/{id}")
    public Person update(@PathVariable String id, @RequestBody Person person) {
        person.setId(id);
        return repository.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { repository.deleteById(id); }
}
