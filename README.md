# camel-encryption-test

This small project demonstrates de usage of Camel DataFormat to encrypt and decrypt messages using AES/CBC/PKCS5Padding cipher.
The encrypted messages include at the begining of the message the necessary block of data for the initialization Vector
Camel CryptoDataFormat hides the complexity to intiialize the vector but behind the scene this is passed as an AlgorithmParameterSpec when the Cipher is initialized (if working with JCE). 
Is importnat to mention that the same vector is required for both phases when encrypting and decrypting the message.

For more infor, have a look at: <br> 
http://camel.apache.org/crypto.html. \
http://en.wikipedia.org/wiki/Initialization_vector. \
http://www.herongyang.com/Cryptography/. 

