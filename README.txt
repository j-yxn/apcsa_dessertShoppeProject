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

<p><b>Part II:</b> Rumor has it that George Lucas may use a “formula” to create all of those strange sounding
names you see in the Star Wars movies (Jar Jar Binks, ObiWan, etc.)</p>

<p>Write a program that allows users to see what their Star Wars name might be according to the
suggested “formula”, follow the steps below.</p>

<p>Prompt the user for the following information:</p>
<ol type="1">
  <li>First Name</li>
  <li>Middle Name</li>
  <li>Last Name</li>
  <li>The Town of their Birth</li>
</ol>
<p>Print their Star Wars Name using the following criteria:</p>
  <p>Star Wars First Name = first three letters of last name + first 2 letters of first name</p>
<p>Star Wars Last Name = first two letters of middle name + first three letters of town of birth</p>

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

