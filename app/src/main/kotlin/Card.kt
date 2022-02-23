class Card(fruitName:String, cardValue:Int) {
    private val cardValue = CardValue(cardValue)
    private val cardShape = CardShape(fruitName)

    override fun toString(): String {
        return "$cardShape$cardValue"
    }
}

fun main(){
    val card1= Card("apple",1)
    val card2= Card("grape",10)
    println(card1)
    println(card2)
}