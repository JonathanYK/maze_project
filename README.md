# Mazes world project

IDE: IntelliJ IDEA 2021.1.3

In this project, I created a maze game where each maze could be initiated using "random selection"(simpleMaze) or Prim's algorithm(myMaze).
This project uses MVC architecture, where the view is a CLI interface. The communication between the layers occures using observer pattern.

On Demo class, after generating a Maze2d (simpleMaze or myMaze), it can be solved using BFS, DFS and Astar algorithms.
Then, the solution can be printed (showing the steps to the solution), saved compressed (using Huffman Coding algorithm) 
and decompressed back to a Maze2d. Using adapter pattern, Maze2d instance adapted to ISearchable instance. 

On the main menu of this project - are the following available commands for execution:

dir: printing the path of a maze/all files in path 
genmaze: generating simpleMaze or myMaze 
display: displays generated/loaded mazes 
savemaze: saves generated/loaded mazes compressed 
loadmaze: loads maze from compressed file 
mazesize: returns the maze size (uncompressed) 
filesize: returns the file size (compressed maze size for comparison) 
exit: closes the whole application
