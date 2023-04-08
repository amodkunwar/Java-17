
public sealed class Vehicle permits Car {

}

sealed class Car extends Vehicle permits Ford, Tata {
}

final class Ford extends Car {
}

final class Tata extends Car {
}

sealed interface Animal permits Dog {
}

final class Dog implements Animal {
}
