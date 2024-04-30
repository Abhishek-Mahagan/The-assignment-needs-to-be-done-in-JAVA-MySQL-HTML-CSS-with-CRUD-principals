package com.pixel6.repository;

import com.pixel6.model.Animal;

import java.util.List;

public interface AnimalService {

    List<Animal> getAllAnimals();

    Animal saveAnimal(Animal animal);

    Animal getAnimalById(int id);

    Animal updateAnimal(int id, Animal animal);

    void deleteAnimal(int id);
}
