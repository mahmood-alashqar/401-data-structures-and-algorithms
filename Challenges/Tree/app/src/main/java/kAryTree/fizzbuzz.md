# Challenge Summary
<!-- Description of the challenge -->
Write a function called fizz buzz tree
Arguments: k-ary tree
Return: new k-ary tree
Determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
If the value is divisible by 3, replace the value with "Fizz"
If the value is divisible by 5, replace the value with "Buzz"
If the value is divisible by 3 and 5, replace the value with "FizzBuzz"
If the value is not divisible by 3 or 5, simply turn the number into a String
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](challenge18KK.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Time Big O(n)
Space Big O(w)
## Solution
<!-- Show how to run your code, and examples of it in action -->
binaryTree.setRoot(new Node<>(2));
binaryTree.getRoot().setLeft(new Node<>(3));
binaryTree.getRoot().setRight(new Node<>(4));
binaryTree.getRoot().getLeft().setLeft(new Node<>(5));
result: {1}-> {Buzz}-> {4}-> {Fizz}->