/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    // Note: please restart the page if syntax highlighting works bad.
    val arr = listOf(10, 20, 0, -4, -5)
    var numPlus: Double = 0.0
    var numEqualToZero: Double = 0.0
    var numMinus: Double = 0.0
    val lengthArr = arr.size
    for(i in arr.indices){
        if(arr[i] > 0){
            numPlus ++

        }
        else if(arr[i] < 0){
            numMinus++

        }
        else{
            numEqualToZero++
        }

    }

    val a = numPlus/lengthArr;
    println(a);
    val b = numMinus/lengthArr;
    println(b);
    val c = numEqualToZero/lengthArr;
    println(c);

}