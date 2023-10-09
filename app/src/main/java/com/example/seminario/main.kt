package com.example.seminario

fun main(){
    var array= arrayOf(7,3,80,75,3,1)
    println(Maximo(array))
    println(Sumatoria(array))
    println(Kilometros(100.0))
    println(Palindromo("abao"))
    println(Letras("melon",'e'))
    println(Subcadena("el doctor Pimiento pi to me miro el pito","pito"))
}
//Ejercicio1
fun Maximo(array:Array<Int>):Int{
    var mayor = array[0]
    for(i in array.indices){
        if(mayor<array[i]){
            mayor=array[i]
        }
    }
    return mayor
}
//Ejercicio2
fun Sumatoria(array:Array<Int>):Int{
    var suma=0
    for(i in array.indices){
        suma+=array[i]
    }
    return suma
}
//Ejercicio3
fun Kilometros(millas:Double):Double{
    return millas*1.6
}
//Ejercicio4
fun Palindromo(frase:String):Boolean{
    var reversa=frase.reversed().lowercase()
    var frase2=frase.lowercase()
    var decision=true
    for(i in frase2.indices){
        if(reversa[i]!=frase2[i]){
            decision=false
        }
    }
    return decision
}
//Ejercicio5
fun Letras(frase:String,letra:Char):Int{
    var cont=0
    for(i in frase.indices){
        if(frase[i]==letra){
            cont++
        }
    }
    return cont
}
//Ejercicio6
fun Subcadena(frase:String,frase2:String):Int{
    var cont=0
    var array= arrayOf(frase.split())
    for(i in array.indices){
        println(array[i])
        if(array[i].equals(frase2)){
            cont++
        }
    }

    return cont
}