## Rectangle Intersection Problem
This code helps you to understand the rectangle intersection problem

### Code Requirements
The example code is in Java ([version 1.8](https://java.com/en/download/) or higher will work). 

### Description

Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates.
l1: Top Left coordinate of first rectangle.
r1: Bottom Right coordinate of first rectangle.
l2: Top Left coordinate of second rectangle.
r2: Bottom Right coordinate of second rectangle.

<img src="https://github.com/akshaybahadur21/Rectangle_Intersect/blob/master/rect.png" align=center>

One solution is to one by one pick all points of one rectangle and see if the point lies inside the other rectangle or not. This can be done using the algorithm discussed here.
Following is a simpler approach. Two rectangles do not overlap if one of the following conditions is true.
1) One rectangle is above top edge of other rectangle.
2) One rectangle is on left side of left edge of other rectangle.

For more information, [see](http://www.geeksforgeeks.org/find-two-rectangles-overlap/)

<img src="https://github.com/akshaybahadur21/Search/blob/master/search.gif" align=center>


### Execution
To compile the code, simply run the `javac Rectangle_Intersect.java`.
To run the code, type `java Rectangle_Intersect`

```
javac Rectangle_Intersect.java
java Rectangle_Intersect
```