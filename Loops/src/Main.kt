fun main() {
    /*for (i in 1..10) {
        println(i)
    }*/
    /*for (i in 1 until 10) { // Number on the left must be smallers than the number on the right.
        println(i)
    }*/
    /*for (i in 10 downTo 1 step 2) {
        println(i)
    }*/
//    for (i in 1 until 10 step 2) {
//        println(i)
//    }
//    for (i in 1..10) {
//        println(i)
//    }
    var number = 0
//    while (number < 10) {
//        println(number)
//        number++
//    }
//    while (number < 10) println(number++)
//    do {
//        println(number++)
//    } while (number < 10)
//    while (number < 10) {
//        if (7 == number) {
//            continue
//        }
//        println(number)
//        number++
//    }
//    while (number < 10) {
//        number++
////        if (2 < number && 8 > number) {
//        if (number in 3..7) {
//            continue
////            break
//        }
//        println(number)
//    }
//    for (i in 0..10) {
////        if (i in 3..8) {
//        if (7 == i) {
////            continue
//            break
//        }
//        println(i)
//    }
    outer@ while (5 > number) {
        number++
        println(number)
//        Cannot target an inner loop from an outer loop.
        var i = 0
        while (5 > i) {
            if (0 == i) break@outer
            i++
            println("***$i")
        }
    }
}