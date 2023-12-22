# SOLID Principle

### S --> Single Responsibility Principle

(i) - your class & method should have only one reason to change <br>
(ii)- your class & method should have only one responsibility

#### Benefits:

(i) - Reduces complexity of code <br>
(ii)- Easier to maintain the code

### O --> Open/Closed Principle

(i) - open for extension and closed for modification <br>
(ii)- can be seen by use of Interfaces (function overriding) <br> 

Eg. If system is live and we came across with some new business requirement, in that case we don't have to 
touch legacy cod, rather we can extend the feature to meet our new business requirement.

### L --> Liskov Substitution Principle

(i) - if class B is subtype of class A, then we should be able to replace the object of A with B without
breaking the behaviour of program. <br>

(ii)- subclass should extend the parent class, not narrowing it down.<br> 

Eg. Let's say we have TwoWheeler Interface which has two methods
    (i) - engineStart()
    (ii)- accelerate()

if there are two class implementing TwoWheeler Interface i.e.
    (i) - Motorcycle
    (ii)- Bicycle

then in motorcycle we can use of engineStart() method but in bicycle it is of no use since there is no engine in it.

Therefore, Bicycle class trying to narrowing TwoWheeler Interface.

### I --> Interface Segmented Principle

It states that interfaces should be such that, client should not implemented unnecessary functions they do not need.

| Wrong Way                                                                                                                                                                                       | Correct Way                                                                                                                                                                                                               |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| interface RestaurantsEmployee { <br/> void washDishes();<br/> void serveCustomer(); <br/> void cookFood();<br/> }                                                                               | interface waiterInterface { <br/> void serveCustomers();<br/> void takeOrder();<br/><br/> }                                                                                                                               |
| class Waiter implements RestaurantsEmployee { <br/> public void washDishes() { <br/> //not my Job <br/> } <br/> public void serveCustomer() {<br/>System.out.println("serving") <br/> } <br/> } | interface chefInterface { <br/> void cookFood(); <br/> void decideMenu(); <br/> }                                                                                                                                         |
| public void cookFood() { <br/> // not my job <br/> }                                                                                                                                            | class Waiter implement WaiterInterface { <br/> public void serveCustomer() { <br/> System.out.println(" Serving Customer "); <br/> } public void takeOrder() { <br/> System.out.println("taking orders"); <br/> } <br/> } |

### D -- Dependency Inversion Principle 

Class should dependent on interfaces rather than concrete classes.

| class MacBook { <br/> private final WiredKeyBoard keyboard; <br/> private final WiredMouse mouse; <br/> public MacBook() { <br/> keyboard = new WiredKeyboard(); <br/> mouse = new WiredMouse(); <br/> } <br/> } | class Mackbook { <br/> private final Keyboard keyboard; <br/> private final Mouse mouse; <br/> public MacBook(Keyboard keyboard, Mouse mouse) {<br/> this.keyboard = keyboard; <br/> this.mouse = mouse; <br/>} <br/> } |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|





