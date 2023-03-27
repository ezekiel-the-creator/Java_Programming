//Shape, a sealed interface that perimits only Circle and Square classes to implement it.

public sealed interface Shape permits Circle, Square{
    //...
}

//sealed interfaces provide better control over interface hierarchies in java