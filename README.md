# INTRODUCTION
A collection allows a group of objects to be treated as a single unit. Java Collection Framework provides a set of standard utility classes for managing various kind of collections.
The core framework is provided in `java.util` package and comprises three main parts:
 1. The core interface
 2. A set of implementations (concrete classes) that are specific implementations of the core interface.
 3. Static Utility Methods found in Collections and Arrays classes that can be used to perform various operations on collections and arrays.

## Core Interfaces
![img.png](img.png)

## Concrete Class Implementations From Core Interfaces
![img_1.png](img_1.png)
## Map Concrete Class Implementation
![img_2.png](img_2.png)

## Iterable Interface
Now that we have seen the core interfaces and concrete class implementations of 
collection framework. Now starting its implementation, from the top interface that
is `Iterable`.
<br/>
`OurGenericList<T>` is a generic class which contains a list and whenever we add a new 
element it is added to that list. But we can't iterate over it because, that list is 
private element of this class. So, to iterate over it we implement `Iterable<T>` interface,
this will make this class iterable. Now, this interface contains a method `iterator()`
which return `Iterator<T>` object.
Now, this `Iterator<T>` is returned by the inner class `OurGenericListIterator` which implements
`Iterator<T>` interface. This interface has two methods, `hasNext()` and `next()` these
in this interface we can access the variables of `Outer Class`, which is `OurGenericList<T>`,
so we can treat it as collection.

## Collection Interface
The Collection interface in Java is a fundamental interface that provides a unified way to work with groups of objects. It is part of the Java Collections Framework and serves as the root interface for most of the other collection interfaces like List, Set, and Queue.

Here are some key points about the Collection interface:

1. Purpose: 
<br />
The Collection interface represents a group of objects known as elements. It provides methods for adding, removing, and manipulating elements in a collection.

2. Structure:
<br />
The Collection interface does not enforce any specific order or indexing of elements. It is a generic interface that can work with any type of objects using type parameters.

3. Methods:
<br />
The Collection interface defines several methods to perform common operations on collections, such as adding elements, removing elements, checking for containment, iterating over elements, and more. Some of the commonly used methods include add, remove, contains, size, isEmpty, iterator, and toArray.

4. Inheritance:
   <br />
The Collection interface extends the Iterable interface, which enables collections to be iterated using the enhanced for-loop or by explicitly obtaining an iterator.

5. Subinterfaces:
   <br />
The Collection interface is the parent interface for more specialized collection interfaces like List, Set, and Queue. These subinterfaces provide additional behavior and semantics specific to different types of collections.

6. Implementations:
   <br />
The Collection interface itself does not provide a concrete implementation. However, you can find various classes that implement the Collection interface, such as ArrayList, LinkedList, and HashSet.

By using the Collection interface, you can write more generic code that can work with different types of collections interchangeably. It provides a unified way to manipulate and process groups of objects, making it easier to work with collections of data in Java.

#### Abstract Methods in Collection Interface
Here is a list of some abstract methods defined in the Collection interface:

`boolean add(E element):` Adds the specified element to the collection.

`boolean remove(Object element):` Removes a single occurrence of the specified element from the collection, if it is present.

`boolean contains(Object element):` Returns true if the collection contains the specified element.

`boolean isEmpty():` Returns true if the collection contains no elements.

`int size():` Returns the number of elements in the collection.

`void clear():` Removes all elements from the collection.

`boolean addAll(Collection<? extends E> collection):` Adds all elements from the specified collection to the collection.

`boolean removeAll(Collection<?> collection):` Removes all elements from the collection that are also contained in the specified collection.

`boolean retainAll(Collection<?> collection):` Retains only the elements in the collection that are contained in the specified collection.

`boolean containsAll(Collection<?> collection):` Returns true if the collection contains all the elements in the specified collection.

`Object[] toArray():` Returns an array containing all the elements in the collection.

`Iterator<E> iterator():` Returns an iterator over the elements in the collection.

### List Interface
In Java, the List interface is a Sub-interface of the Collection interface. It represents an ordered collection of elements, allowing duplicate values and maintaining the insertion order. The List interface provides methods to add, remove, access, and manipulate elements in a list.

#### Class That Implements the List Interface
`ArrayList:` This class provides a resizable array implementation of the List interface. It is backed by an array and supports fast random access and dynamic resizing.

`LinkedList:` This class provides a doubly linked list implementation of the List interface. It is useful when frequent insertion and deletion operations are performed, but random access is slower compared to ArrayList.

`Vector:` This class is similar to ArrayList but is synchronized, making it thread-safe. It is part of the legacy Java Collections Framework and has been largely replaced by ArrayList.