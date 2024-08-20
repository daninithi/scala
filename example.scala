object CaesarCipher {

  // Function to encrypt plaintext using Caesar cipher
  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Function to decrypt ciphertext using Caesar cipher
  def decrypt(ciphertext: String, shift: Int): String = {
    encrypt(ciphertext, -shift) // Decrypting is just the inverse of encryption
  }

  // Function that applies encryption or decryption based on the function passed
  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encrypted = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encrypted")

    val decrypted = cipher(encrypted, shift, decrypt)
    println(s"Decrypted: $decrypted")
  }
}
