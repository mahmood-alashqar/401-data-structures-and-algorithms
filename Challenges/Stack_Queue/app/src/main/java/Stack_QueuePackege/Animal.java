package Stack_QueuePackege;

import org.checkerframework.checker.units.qual.A;

public class Animal<T> extends Queue {
    private String kind;
Queue animalQ = new Queue();

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Queue getAnimalQ() {
        return animalQ;
    }

    public void setAnimalQ(Queue animalQ) {
        this.animalQ = animalQ;
    }

    public void enqueue(String animal){

animal.toLowerCase();
        if(animal =="cat" || animal=="dog"){
            animalQ.enQueue(animal);
            System.out.println(animal);
        }
        else {
            System.out.println("sorry we just receive dogs or cats");
        }

    }
    public String deQueue(String pref){
        pref.toLowerCase();
        if(pref =="cat"){
            animalQ.dequeue();
            return "the pref was a cat";
        }
        else if (pref == "dog"){
            animalQ.dequeue();
           return " the pref was a dog";
        }
return null;
    }
    public void tostring() {
        animalQ.tostring();
    }
}
