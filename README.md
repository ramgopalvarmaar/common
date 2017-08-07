# common
Utility programs for common use.

#Find and kill local host server
netstat -ano | find "8080"
taskkill /F /PID 1196
