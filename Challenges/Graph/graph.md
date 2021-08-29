# Graphs
<!-- Short summary or background information -->
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

## Challenge
<!-- Description of the challenge -->

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:
```
add node
Arguments: value
Returns: The added node
Add a node to the graph

add edge
Arguments: 2 nodes to be connected by the edge, weight (optional)
Returns: nothing
Adds a new edge between two nodes in the graph
If specified, assign a weight to the edge
Both nodes should already be in the Graph

get nodes
Arguments: none
Returns all of the nodes in the graph as a collection (set, list, or similar)

get neighbors
Arguments: node
Returns a collection of edges connected to the given node
Include the weight of the connection in the returned collection

size
Arguments: none
Returns the total number of nodes in the graph
```
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

add node Time: O(1), Space: O(1)
add edge Time: O(1), Space: O(1)
get nodes Time: O(1), Space: O(n): n is the number of nodes
get neighbors Time: O(1), Space: O(m) m is the number of the neighbor nodes
size , Time: O(n): n is the number of nodes , Space: O(1)

