Approach & Efficiency
utilize 2 Stack instances to create and manage the queue(stack1,stack2).
create enqueue method take an argument use to push a new node to stack1.
create dequeue method .
if stack1 is empty will return exception. if stack1 does not empty will do loop to push the top from stack1 to stack2 and do pop for each top in stack1.
then after finish of push all nodes from stack1 to stack2 will define extractData to do pop for stack2.
then if stack2 does not empty will do loop to push the top from stack2 to stack1 and do pop for each top in stack2.
return extractData.
Solution
enqueue:
PseudoQueue sodo = new PseudoQueue();
sodo.enqueue(1);
sodo.enqueue(2);
sodo.enqueue(3);
sodo.tostring();
Result: {3} ->{2} ->{1} ->Null
dequeue:
sodo.dequeue();
Result: {3} ->{2} ->Null
![](queue-stack.PNG)
/////////////////////////////
#stack-queue-animal-shelter
Challenge Summary
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Whiteboard Process
Approach & Efficiency
space: O(1) time: O(1)
Solution
enqueue:
````
enqueue:

input:
Cat cat = new Cat("cat1");
Cat cat2 = new Cat("cat2");
Dog dog = new Dog("dog1");

output:
cat1,cat2,dog1

dequeue:

input:
cat

output:
cat1

## Test
public void testAnimalShelterDequeue() {
AnimalShelter animalShelter = new AnimalShelter();
Dogs dog1 = new Dogs("Scooby");
animalShelter.enqueue(dog1);
Cats cat2 = new Cats("Garfield");
animalShelter.enqueue(cat2);
Cats cat3 = new Cats("HelloKitty");
animalShelter.enqueue(cat3);
Dogs dog4 = new Dogs("Scrappy");
animalShelter.enqueue(dog4);
assertEquals(dog1.getName(), animalShelter.dequeue("dog").getName());
assertEquals(dog4.getName(), animalShelter.dequeue("dog").getName());

}
//