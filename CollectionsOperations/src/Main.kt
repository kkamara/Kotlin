fun main() {
    println(searchElement(27, mutableListOf(
        1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
    )))
}
// Elements need to be sorted for Binary Search to work.
private fun searchElement(
    searchedElement: Int, numbers: MutableList<Int>
): Int = numbers[numbers.binarySearch(27)]