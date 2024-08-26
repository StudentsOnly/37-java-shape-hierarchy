## Exercise: Shape Hierarchy

#### Objective:

Practice using access modifiers and inheritance in Java by creating a hierarchy of shape classes.

#### Description:

You should create a set of shape classes using inheritance. There should be a base class Shape, and two derived classes: Circle and Rectangle. The base class Shape should have protected instance variables for the shape's color and should include public methods to set and get this attribute. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific types of shapes.

#### Guidelines:

1.	Create a Shape class with the following protected instance variable:
    -	String color
2.	Implement the following public methods in the Shape class:
    -	setColor - to set the shape's color.
    -	getColor - to get the shape's color.
3.	Create a derived class Circle that inherits from Shape and has the following additional attributes:
    -	double radius
4.	Implement the following methods in the Circle class:
    -	setRadius - to set the radius of the circle.
    -	getRadius - to get the radius of the circle.
    -	calculateArea - to calculate the area of the circle (π * radius^2).
5.	Create another derived class Rectangle that inherits from Shape and has the following additional attributes:
    -	double width
    -	double height
6.	Implement the following methods in the Rectangle class:
    -	setWidth - to set the width of the rectangle.
    -	getWidth - to get the width of the rectangle.
    -	setHeight - to set the height of the rectangle.
    -	getHeight - to get the height of the rectangle.
    -	calculateArea - to calculate the area of the rectangle (width * height).
7.	In the main method, create instances of Circle and Rectangle, set their attributes, calculate their areas, and display their information.
