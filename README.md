# camel-encryption-test

This small project demonstrates the usage of Camel DataFormat to encrypt and decrypt messages using AES/CBC/PKCS5Padding cipher. <br>
The encrypted messages include at the begining a block of data for the initialization Vector
<br><br>
Camel CryptoDataFormat hides the complexity to initialize the vector but behind the scene this is passed as an AlgorithmParameterSpec when the Cipher is initialized (if working with JCE). 
<br><br>
Is important to mention that the same vector is required for both phases for encryption and decryption.

For more infor, have a look at: <br> 
http://camel.apache.org/crypto.html. \
http://en.wikipedia.org/wiki/Initialization_vector. \
http://www.herongyang.com/Cryptography/. 

