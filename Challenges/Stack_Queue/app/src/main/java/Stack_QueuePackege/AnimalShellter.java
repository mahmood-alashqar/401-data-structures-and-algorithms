package Stack_QueuePackege;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

class AnimalShelter<T>  {
    private ArrayList<Animal> animals;

    public  AnimalShelter(){
        animals= new ArrayList<>();
    }

    public void enqueue(Animal animal){
        animals.add(animal);
    }

    public Animal dequeue(String pref){
        pref = pref.toLowerCase();
        Animal animal;
        int count = 0;
        switch (pref){
            case "cat":
                do{
                    animal=animals.get(count++);
                }
                while (animal.getClass() != Cat.class);
                animals.remove(animal);
                return animal;
            case "dog":
                do{
                    animal=animals.get(count++);
                }
                while (animal.getClass() != Dog.class);
                animals.remove(animal);
                return animal;
            default:
                return null;
        }
    }
}
