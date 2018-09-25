# common
Utility programs for common use.

#Find and kill local host server
netstat -ano | find "8080"
taskkill /F /PID 1196

#Script to kill 8080 server
for /f "tokens=5" %a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %a

#set SSL cert check to false
git config --global http.sslVerify false

#Create client from wsdl using java wsimport tool
java -classpath "C:\Program Files\Java\jdk1.8.0_92\lib\tools.jar" -Djavax.net.ssl.trustStore="C:\\Users\\rvarmaar\\Pictures\\client-truststore.jks" -Djavax.net.ssl.trustStorePassword=changeit com.sun.tools.internal.ws.WsImport -s C:\\Users\\rvarmaar\\Pictures 
url goes here


#Spring property to enable h2 console with queries
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:file:~/test
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

#Keystore add .cer to .jks
keytool -import -alias lenderservice -file PATH_TO_CER -keystore PATH_TO_TRUST_STORE
