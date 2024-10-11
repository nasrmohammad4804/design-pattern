## strategy pattern

The Strategy pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. It allows a client to choose which algorithm to use at runtime.

use case : You might use the Strategy pattern when you have multiple ways to perform a task and you want to switch between them easily (e.g., different sorting algorithms).

this pattern is very similar to state pattern with key differences

focus ; strategy focused on interchangeable algorithm. white state focused on changing state of object

behaviour : in strategy context isn't change it just change algorithm. but in state context change behaviour base on state

## in strategy pattern we use different way to perform task and switch between them. but in state pattern we use different behaviour base on changing state

example : suppose we have class called SortingAlgorithm and method of sort with argument of sortName and array
we have different type of sorting such as bubble sort and heap sort merge sort and quick sort
we call different implementation base on sortType.

but in state pattern if we have state with name of sortType we can change behaviour base on state

key difference between state & strategy : 
## in strategy pattern we behaviour differently base on client decision. but also we do same work in different way for example sorting or hashing in different way
but in state pattern . we do different work base on state changed.


## very important note
<p style="background-color: #ffebcd;border-radius: 5px">
"In the Strategy pattern, we perform the same task in different ways based on the client's decision, such as using different sorting or hashing algorithms. In contrast, the State pattern allows us to perform different behaviors based on changes in the object's state."
</p>