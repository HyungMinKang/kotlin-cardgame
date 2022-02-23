class CardValue(intValue:Int){
    var stringValue:String = when(intValue){
        1-> "A"
        10->"X"
        else-> intValue.toString()
    }

    override fun toString(): String {
        return "$stringValue"
    }

}