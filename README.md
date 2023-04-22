<!DOCTYPE html>
<html>
<head>
</head>
<body>
  
<h2>Dessert Shoppe Project Instructions 📝</h2>

<p><b>Part I:</b> The DessertItem class is a superclass from which specific types of DessertItems can be
derived. The DessertItem class should have the following:
<ol type="1">
  <li>It should keep track of the name of the DessertItem</li>
  <li>It should have two constructors, a default constructor that sets the DessertItem name to an
  empty String and another constructor that takes the name of the DessertItem as a
  parameter</li>
  <li>It should have an accessor method for the name of the DessertItem</li>
  <li>It should have an accessor method for the cost of the DessertItem, this method should not
  be defined in the DessertItem class because the method of determining the cost varies
  based on the type of item.</li>
  <li>The DessertItem class should implement the Comparable interface (such that it is
  comparable to other DessertItems). You can choose to define the compareTo method in
  the DessertItem class or in each child class. DessertItems should be compared using
  their cost. (Note: The Comparable interface is already written – you do not have to write it.).</li>
</ol></p>

<br>

<p><b>Part II:</b> Write the Derived (Child) Classes</p>

<p>You will write the code for four(4) child classes of DessertItem. These classes include the:</p>
<ol type="1">
  <li> Candy Class – A candy item has a weight and a price per pound which are used to determine
  its cost. For example, 2.30 lbs of fudge @ .89/lb = 205 cents. The cost should be rounded to
  the nearest cent.</li>
  <li>Cookie Class – A cookie item has a number and a price per dozen which are used to
  determine its cost. For example, 4 cookies @ 3.99/dozen = 133 cents. The cost should be
  rounded to the nearest cent.</li>
  <li>IceCream Class – An ice cream item has a cost.</li>
  <li>Sundae Class – A sundae item is a child of the IceCream class. The cost of a sundae is the
cost of an IceCream item plus the cost of the topping.</li>
</ol>

</body>
</html>

