class Card(fruitName:String, cardValue:Int) {
    private val cardValue = CardValue(cardValue)
    private val cardShape = CardShape(fruitName)

    override fun toString(): String {
        return "$cardShape$cardValue"
    }
}

