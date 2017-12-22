# common
Utility programs for common use.

#Find and kill local host server
netstat -ano | find "8080"
taskkill /F /PID 1196

#Script to kill 8080 server
for /f "tokens=5" %a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %a

#set SSL cert check to false
git config --global http.sslVerify false
