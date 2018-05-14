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
