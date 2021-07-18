# Trees
<!-- Short summary or background information -->
A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children,
we typically name them the left and right child.
- InOrder: left root right.
- postOrder: left right root.
- preOrder: root left right.
## Challenge
<!-- Description of the challenge -->
#### Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
#### Create a Binary Tree class
Define a method for each of the depth first traversals:
- pre order
- in order
- post order
  which returns an array of the values, ordered appropriately.
#### Create a Binary Search Tree class
This class sub-class of the Binary Tree Class
- Add method has:
  Arguments: value
  Return: nothing
  Adds a new node with that value in the correct location in the binary search tree.
- Contains method has:
  Argument: value
  Returns: boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
space Big O(width)
Time  Big O(n)
## API
<!-- Description of each method publicly available in each of your trees -->
I used ArrayList.