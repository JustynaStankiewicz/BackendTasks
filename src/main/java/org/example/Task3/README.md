# Task3

### Description:
The first line of input contains a positive number n, next n lines contains pairs of positive integers, where each pair identifies a connection between two vertices in a graph. Please provide a working code that will give us the answer for the following questions: how many separated graphs are in the input.

### Solution:
This solution is based on `HashMap` to represent the graph, mapping each vertex to its list of connected vertices. By applying Depth-First Search (`dfs`), the code efficiently identifies all separate graphs within the input. 
The approach unfolds as follows:

1. **Building the Graph**: For each pair of integers (representing an edge in the graph), the program adds this connection to the `HashMap`. This ensures that every vertex is associated with its adjacent vertices, facilitating the traversal process.
2. **Identifying Unique Vertices**: A `HashSet` collects every unique vertex from the input pairs, setting the stage for a graph traversal.
3. **Counting Separate Graphs**: Using DFS, the program explores each vertex, marking them as visited. Each unvisited vertex initiates a new DFS traversal, indicating the start of a new separate graph. The count of these traversals gives the total number of separate graphs.


### Example Output

For an input of `n = 3` with the edges:

```plaintext
4 3
1 4
5 6
```
the expected output is:
```plaintext
2
