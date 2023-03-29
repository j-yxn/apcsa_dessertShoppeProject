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
  <li> Candy class – A candy item has a weight and a price per pound which are used to determine
  its cost. For example, 2.30 lbs of fudge @ .89/lb = 205 cents. The cost should be rounded to
  the nearest cent.</li>
  <li>Cookie class – A cookie item has a number and a price per dozen which are used to
  determine its cost. For example, 4 cookies @ 3.99/dozen = 133 cents. The cost should be
  rounded to the nearest cent.</li>
  <li>IceCream class – An ice cream item has a cost.</li>
  <li>Sundae class – A sundae item is a child of the IceCream class. The cost of a sundae is the
cost of an IceCream item plus the cost of the topping.</li>
</ol>
<details>
  <summary><h3>Scanner Project Rubric 📚</h3></summary>
    <table>
      <tr>
        <th colspan="2">Scanner Basics</th>
      </tr>
      <tr>
        <td>1) Import is correct</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <th colspan="2"><b>Part I: Statistics Program</th>
      </tr>
      <tr>
        <td>1) Prompts user for input</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>2) Correctly accepts user input for number of values</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>3) Loops to accept the appropriate number of values based on criteria #2</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>4) Prompts user for input values and correctly accepts those values</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>5) Uses input to correctly calculate sums</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>6) Uses input to correctly calculate average</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <th colspan="2"><b>Part II: Star Wars Name Program</th>
      </tr>
      <tr>
        <td>1) Prompts user for input</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>2) Correctly accepts user input for number of values</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <td>3) Determines the user’s Star Wars name given the formula</td>
        <td>_____ / 1</td>
      </tr>
      <tr>
        <th colspan="2"> </th>
      </tr>
    </table>
</details>

</body>
</html>

