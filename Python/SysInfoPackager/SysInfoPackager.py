'''this pickles system data and sends it over tcp to a carbon/graphite server'''
import time  # system time
import psutil
# server name and ip request needs to be done for database organization
GLOBALDELAY = 10
while True:
    file = open("C:\Users\iD Student\Desktop\Ben K\Java\CpuUsageGUI\src\CpuUsage.txt", 'w+')
    file.write(str(psutil.cpu_percent()))
    file.close()
    time.sleep(GLOBALDELAY)