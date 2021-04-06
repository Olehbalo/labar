import re
from datetime import datetime

def unique_images():
    file = open(".\\access_log.txt", "r")
    text= file.read()
    
    full_result = {}
    search_pattern = r"\[.+(\d{2}):(\d{2}):(\d{2}).+\".+ (.+(jpeg|png|gif|jpg))"                
   
    found = re.findall(search_pattern, text)

    for result in found:
        if datetime.strptime("01:59:00", '%H:%M:%S') <= datetime.strptime(result[0] + ":" + result[1] + ":" + result[2], '%H:%M:%S') <= datetime.strptime("16:27:00", '%H:%M:%S'):
            if result[3] in full_result:
                full_result[result[3]] +=1
            else:
                full_result[result[3]] =1
         
    
    
    count = 0
    for found in full_result.items():
        if found[1] ==1:
            print(found)
            count += 1
    print(count)

if __name__ == '__main__':
    unique_images()