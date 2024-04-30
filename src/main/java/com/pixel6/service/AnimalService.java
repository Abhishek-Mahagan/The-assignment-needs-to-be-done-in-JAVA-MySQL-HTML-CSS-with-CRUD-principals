package com.pixel6.service;

import com.pixel6.model.Animal;
import com.pixel6.repository.AnimalRepository;

import java.util.List;

public interface AnimalService {

    List<Animal> getAllAnimals();

    Animal saveAnimal(Animal animal);

    Animal getAnimalById(int id);

    Animal updateAnimal(int id, Animal animal);

    void deleteAnimal(int id);
}
