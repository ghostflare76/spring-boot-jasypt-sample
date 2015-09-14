## Requirement
- java 1.8 over

##Build locally with encrypt
- java -jar jasypt-1.9.2.jar  org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=world password=ncsoft  algorithm=PBEWITHSHA256AND128BITAES-CBC-BC

## Issue
If you encounter  issues message "java.security.NoSuchProviderException: no such provider: BC"
check below
- Check that the java home is set in the configuration

- Check which java environment is used for application

- Check that \jre\lib\security\java.security has bouncycastle provider entry. i.e. security.provider.9=org.bouncycastle.jce.provider.BouncyCastleProvider

- Also check that bouncy castle jar is added to \jre\lib\ext\ bcprov-jdk15on-147.jar (latest one to work for java 1.5 & 1.6


## Encryption Configuration
Jasypt uses an `StringEncryptor` to decrypt properties. For all 3 methods, if no custom `StringEncryptor` is found in the Spring Context, one is created automatically that can be configured through the following properties (System, properties file, command line arguments, environment variable, etc.):

<table border="1">
      <tr>
          <td>Key</td><td>Required</td><td>Default Value</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.password</td><td><b>True</b></td><td> - </td>
      </tr>
      <tr>
          <td>jasypt.encryptor.algorithm</td><td>False</td><td>PBEWithMD5AndDES</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.keyObtentionIterations</td><td>False</td><td>1000</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.poolSize</td><td>False</td><td>1</td>
      </tr><tr>
          <td>jasypt.encryptor.providerName</td><td>False</td><td>SunJCE</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.saltGeneratorClassname</td><td>False</td><td>org.jasypt.salt.RandomSaltGenerator</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.stringOutputType</td><td>False</td><td>base64</td>
      </tr>
      <tr>
          <td>jasypt.encryptor.proxyPropertySources</td><td>False</td><td>false</td>
      </tr>
  </table>



