object Caesar_cipher{
    val alphabet=Array('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')

    def encryption(plain_text:String,shift:Int):String={
        var cipher_text=""
        for (char<-plain_text){
            alphabet.find(_==char.toLower) match{
                case Some(_)=>
                    val position=alphabet.indexOf(char.toLower)
                    val new_position=(position+shift)%26
                    val new_char=alphabet(new_position)
                    cipher_text+=(if (char.isUpper) new_char.toUpper else new_char)
            
            case None =>
                cipher_text+=char
            }
        }
        cipher_text
    }

    def decryption(cipher_text:String,shift:Int):String={
        var plain_text=""
        for (char<-cipher_text){
            alphabet.find(_==char.toLower) match{
                case Some(_)=>
                    val position=alphabet.indexOf(char.toLower)
                    val new_position=(position-shift+26)%26
                    val new_char=alphabet(new_position)
                    plain_text+=(if (char.isUpper) new_char.toUpper else new_char)
            
            case None =>
                plain_text+=char
            }
        }
        plain_text
    }

    def cipher(text:String,shift:Int,processs:(String,Int)=>String):String={
        processs(text,shift)
    }

    def main(args:Array[String]):Unit={
        val word=scala.io.StdIn.readLine()
        val shift=1
        val encrypted=cipher(word,shift,encryption)
        println(s"encrypted:$encrypted")
        val decrypted=cipher(encrypted,shift,decryption)
        println(s"decrypted:$decrypted")
    }
}