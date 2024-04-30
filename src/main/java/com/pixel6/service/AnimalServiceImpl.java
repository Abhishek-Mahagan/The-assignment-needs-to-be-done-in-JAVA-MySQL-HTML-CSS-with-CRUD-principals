package com.pixel6.service;

import com.pixel6.model.Animal;
import com.pixel6.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final Map<Integer, Animal> animalMap = new HashMap<>();
    private int nextId = 1;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        super();
    }

    @Override
    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animalMap.values());
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        int id = nextId++;
        animal.setId((long) id);
        animalMap.put(id, animal);
        return animal;
    }

    @Override
    public Animal getAnimalById(int id) {
        return animalMap.get(id);
    }

    @Override
    public Animal updateAnimal(int id, Animal animal) {
        animal.setId((long) id);
        return animalMap.put(id, animal);
    }


    public void deleteAnimal(int id) {
        animalMap.remove(id);
    }
}
