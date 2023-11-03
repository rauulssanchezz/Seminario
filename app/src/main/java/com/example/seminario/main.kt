package com.example.seminario

import kotlin.system.exitProcess

fun main(){
    var array= arrayOf(7,3,80,75,3,1)
    var array1= arrayOf(5,4,3,2,9,8)
    var matriz = arrayOf(arrayOf(1,20,3,2,1), arrayOf(2,6,5,3,9))
    println(Maximo(array))
    println(Sumatoria(array))
    println(Kilometros(100.0))
    println(Palindromo("abao"))
    println(Letras("melon",'e'))
    println(Subcadena("me miro el pito iubiubh pito","pito"))
    println(Mayuscula("me miro el pito iubiubh pito"))
    println(SumaCifras(123))
    println(Mcd(20,10))
    println(Fibonacci(2))
    println(PrimosRelativos(16,25))
    println(Capicua(122))
    println(Etiqueta("a.kaka"))
    print(Mosaico(5))
    for(i in array.indices){
        print(CompararArrays(array,array1)[i])
    }
    println()
    println(Factorial(5))
    println(Reverso("Hola"))
    println(Perfecto(6))
    println(Amstrong(153))
    println(EncontrarMayor(matriz))
    println(EncontrarMenor(matriz))
    println(PalabraLarga("Hola bebee como te va como te va"))
    println(PalabraCorta("Hola bebee como te va como te va"))
    println(Determinar("Por el amor de es2a mujeeeer"))
    println(Anagrama("pene","nepe"))
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
    val partes = frase.split(subcadena)

    return partes.size-1
}
//Ejercicio7
fun Mayuscula(texto:String):String{

    var arrayMutable=texto.split(" ").toMutableList()
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
    var aux=0
    var nn=numero
    var n2=numero2

    if (numero2<numero){
        aux=numero
        nn=numero2
        n2=numero
    }

    for(n in nn downTo 1){

        if(nn%n==0&&n2%n==0){
            res=n
            return res
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

    var res=0
    var aux=0
    var numero=n1
    var numero2=n2

    if (numero2<numero){
        aux=numero
        numero=numero2
        numero2=numero
    }

    for(n in numero downTo 1){

        if(numero%n==0&&numero2%n==0){
            res=n
            break
        }
    }
    if(res==1){
        return true
    }
    return false



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
fun Etiqueta(cadena:String):String{
    var res=""
    var id= cadena.split("#")
    var id2 = id[0].split(".")
    var div = cadena.split(".")
    if(cadena.contains(".") && !cadena.contains("#")){
        res="<"+div[0]+" class="+div[1]+"</div>"
    }else if(cadena.contains("#") && cadena.contains(".")){
        res="<div"+id[0]+" class="+id2[1]+" id="+id[1]+"></div>"
    }else{
        res="<"+cadena+"><"+cadena+"/>"
    }
    return res
}


//Ejercicio 14
fun Mosaico(n:Int):String{
    var res=""
    for(i in 1..n){
        for(z in 1..i){
            res+=i

        }
        res+="\n"
    }
    return res
}
//Ejercicio15
fun CompararArrays(array1:Array<Int>,array2:Array<Int>):BooleanArray{
    var arraybo = BooleanArray(array1.size)
    for(i in array1.indices){
        if(array1[i]==array2[i]){
            arraybo[i]=true
        }
    }
    return arraybo
}

//Ejercicio20
fun Factorial(n:Int):Int{
    var res=1
    for(i in 1..n){
        res*=i
    }
    return res
}

//Ejercicio21
fun Reverso(texto:String):String{
    return texto.reversed()
}

//Ejercicio22
fun Perfecto(n:Int):Boolean{
    var res=0
    for(i in 1..n){
        if(n%i==0 && n!=i){
            res+=i
        }
    }
    if(res==n){
        return true
    }
    return false
}

//Ejercicio 23
fun Amstrong (n:Int):Boolean{
    var res=0
    var cifra=0
    var numero=n
    for(i in n.toString()){
        cifra = numero%10
        numero=numero/10
        res+= Math.pow(cifra.toDouble(), n.toString().length.toDouble()).toInt()
    }
    if(res==n){
        return true
    }
    return false
}

//Ejercicio 24
fun EncontrarMayor(matriz:Array<Array<Int>>):Int{
    var res=matriz[0][0]
    for(i in matriz.indices){
        for(z in matriz[0].indices){
            if(matriz[i][z]>res){
                res=matriz[i][z]
            }
        }
    }
    return res
}

//Ejercicio25
fun EncontrarMenor(matriz:Array<Array<Int>>):Int{
    var res=matriz[0][0]
    for(i in matriz.indices){
        for(z in matriz[0].indices){
            if(matriz[i][z]<res){
                res=matriz[i][z]
            }
        }
    }
    return res
}

//Ejercicio26
fun PalabraLarga(text:String):String{
    var palabras=text.split(" ")
    var res=palabras[0]
    for(i in palabras.indices){
        if(palabras[i].length>res.length){
            res=palabras[i]
        }
    }
    return res
}

//Ejercicio27
fun PalabraCorta(text:String):String{
    var palabras=text.split(" ")
    var res=palabras[0]
    for(i in palabras.indices){
        if(palabras[i].length<res.length){
            res=palabras[i]
        }
    }
    return res
}

//Ejercicio28
fun Determinar(text:String):Boolean{
    var lista=text.split("")
    for(i in lista.indices){
        for(z in 0..9) {
            if (lista[i].equals(z.toString())) {
                return false
            }
        }
    }
    return true
}

//Ejercicio29
fun Anagrama(text:String,text2:String):Boolean{
    var confirmar= BooleanArray(text.length)

    var z = 0
    loop1@ for (i in text.indices){
       loop2@ for(z in text2.indices){
            if(text[i].equals(text2[z])){
                confirmar[i]=true
                continue@loop1
            }else{
                confirmar[i]=false
            }
        }
    }
    for(i in confirmar.indices){
        if(confirmar[i]==true){
            return true
        }
    }
    return false
}

//Ejercicio30
