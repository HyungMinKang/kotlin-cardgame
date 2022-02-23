sealed class Fruit {
   data class Apple(val fruitName: String = "Apple", val fruitShape: String = "\uD83C\uDF4E") : Fruit()
   data class Grape(val fruitName: String = "Grape", val fruitShape: String = "\uD83C\uDF47") : Fruit()
   data class Cherry(val fruitName: String = "Cherry", val fruitShape: String = "\uD83C\uDF52") : Fruit()
   data class Orange(val fruitName: String = "Orange", val fruitShape: String = "\uD83C\uDF4A") : Fruit()
}
