package com.example.seminario

import kotlin.system.exitProcess

fun main(){
    var array= arrayOf(7,3,80,75,3,1)
    println(Maximo(array))
    println(Sumatoria(array))
    println(Kilometros(100.0))
    println(Palindromo("abao"))
    println(Letras("melon",'e'))
    println(Subcadena("me miro el pito iubiubh pito","pito"))
    println(Mayuscula("me miro el pito iubiubh pito"))
    println(SumaCifras(123))
    println(Mcd(24,40))
    println(Fibonacci(2))
    println(PrimosRelativos(10,20))
    println(Capicua(122))
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
fun Subcadena(frase:String,subcadena:String):Int{
    var encontrado=false
    var cont=0
    var contFrase = subcadena.length
    var contadorVeces = 0
    var elto_inicial = subcadena[0]

    for(letra in frase){

        if(cont > 0){
            if(letra == subcadena[cont]) {
                cont++
            }else{
                cont = 0
            }

        }else{
            if(letra == elto_inicial){
                cont++
            }
        }
        if(cont == contFrase){
            contadorVeces++
            cont = 0
        }

    }

    return contadorVeces
}
//Ejercicio7
fun Mayuscula(texto:String):String{
    var arrayPalabras=texto.split(" ")
    var arrayMutable=arrayPalabras.toMutableList()
    var res=""
    for (i in arrayMutable.indices){
        arrayMutable[i] = arrayMutable[i].capitalize()
        res+=arrayMutable[i]+" "
    }
    return res
}
//Ejercicio8
fun SumaCifras(numero:Int):Int{
    var cifra=0
    var res=0
    var numero2=numero

    while(numero2%10!=0){
        cifra=numero2%10
        numero2 = numero2/10
        res+=cifra
    }
    return res
}
//Ejercicio9
fun Mcd(numero: Int,numero2:Int):Int{
    var res=0
    for(n in numero .. 0){

        if(numero%n==0&&numero%n==0){
            return n
        }
    }
    return res
}
//Ejercicio10
fun Fibonacci(numero:Int):Int{
    var res=0
    var n1 = 0
    var n2 = 1

    if (numero == 0) return 0
    if (numero == 1) return 1
    if (numero == 2) return 1

    for(n in 3..numero){
        res=n1+n2
        n1=n2
        n2=res
    }

    return res
}

//Ejercicio11
fun PrimosRelativos(n1:Int,n2:Int):Boolean{

    var fact1=0
    var fact2=0

    for(n in 1..n1){
        if(n1%n==0){
            fact1=n
        }
    }
    for(n in 1..n2){
        if(n1%n==0){
            fact2=n
        }
    }
    if(fact1!=0 && fact2!=0){
        if(fact1==fact2){
            return false
        }
    }
    return true
}

//Ejercicio12
fun Capicua(numero:Int):Boolean{
    var n1=numero
    var n2=numero.toString().reversed().toInt()
    if(n1==n2){
        return true
    }
    return false
}
//Ejercio13
fun