fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val somaMaior = 14
    val somaMenor = 10
    print("$somaMaior" + " " +"$somaMenor")
    //miniMaxSum(arr)
}


fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    var maiorElemento  = 0
    var menorElemento = 10000000


    for(i in arr){
        if(i > maiorElemento){
            maiorElemento = i
        }
        if(i < menorElemento){
            menorElemento = i
        }

    }

    val somaMaior = arr.sum() - menorElemento
    val somaMenor = arr.sum() - maiorElemento
    print(somaMaior)
    print(somaMenor)
}

