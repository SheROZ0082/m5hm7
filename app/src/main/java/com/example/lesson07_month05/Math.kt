package com.example.lesson07_month05

class Math {
    private var result =""

    fun sum(a:String,b:String):String{
        result = if (a.isNotBlank()&& a.isNotEmpty()&&b!=""&& b.isNotEmpty()){
            if (a.isNumeric()&&b.isNumeric()){
                (a.toInt()+b.toInt()).toString()
            }else "Enter numbers"
        }else "Enter numbers"
        return result
    }
    fun divide(a: Int, b:Int):Int{
//        result = if (a.isNotBlank()&& a.isNotEmpty()&&b!=""&& b.isNotEmpty()){
//            if (a.isNumeric()&&b.isNumeric()){
//                (a.toInt()/b.toInt()).toString()
//                throw ArithmeticException("На ноль невозможно делить!")
//            }else "Enter numbers"
//        }else "Enter numbers"
//        return result
        if (b==0){
       try {
           a/b
       }catch (e:ArithmeticException){
           result ="tytytyty"
           throw e
       }}
    return a/b }
    fun increase(a: String,b: String):String{
        result = if (a.isNotBlank()&& a.isNotEmpty()&&b!=""&& b.isNotEmpty()){
            if (a.isNumeric()&&b.isNumeric()){
                (a.toInt()*b.toInt()).toString()
            }else "Enter numbers"
        }else "Enter numbers"
        return result
    }
    fun minus(a: String,b: String):String{
        result = if (a.isNotBlank()&& a.isNotEmpty()&&b!=""&& b.isNotEmpty()){
            if (a.isNumeric()&&b.isNumeric()){
                (a.toInt()-b.toInt()).toString()
            }else "Enter numbers"
        }else "Enter numbers"
        return result
    }


    fun squareRoot(a: Int,b: Int):Int{
        val c:Int
       c= (a*a)+(2*a*b)+(b*b)
        return c
    }
    private fun  String.isNumeric():Boolean{
        return this.matches("-?\\d+(\\.\\d+)?".toRegex())
    }
}