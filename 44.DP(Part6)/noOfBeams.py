bank = ["011001","000000","010100","001000"]
devices = []
for i in bank:
    device = 0
    for j in i:
        if(j == '1'):
            device+=1
    devices.append(device)
print(devices)
beams = 0
for i in range(len(devices)):
    if (devices[i] != 0):
        for j in range(i+1, len(devices)):
            if(devices[j] == 0):
                continue
            else:
                beams += devices[i] * devices[j]
                break
print(beams)