idea of iterator pattern . we iterate on class base on specified attribute.

if we change attribute structure or type is effected on consumers but if we used with iterator patter is break inside class
and handled inside class and don't impact on consumers

changing the internal of object should not affect on consumers


in this example we use browseHistory and store list of url visited
if we in future use array or queue instead of list that impact on consumers

but also if change in browseHistory only must break inside class not consumers

## note : use iterator method in interface rather than inside class.
we are able to use hasNext() and next() method on class but by consideration solid principle
class must have single responsibility. for example in browseHistory class we can to add hasNext() and next() method to this class
but is not responsibility of this class . also maybe we want to have different implementation such as list , queue , array and so on
then **_iterator functionality is better to be interface_**

![img.png](img.png)