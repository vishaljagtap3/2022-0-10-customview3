package `in`.bitcode.customview3

data class Task(
    var title : String,
    var state : Boolean,
    var type : Int
) {
    companion object {
        val TYPE_PERSONAL = 0
        val TYPE_HOME = 1
        val TYPE_OFFICE = 2
    }
}