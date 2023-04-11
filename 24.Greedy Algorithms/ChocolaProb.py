input1 = [2,1]
input2 = [3]
l = len(input1)+1
l1 = len(input2)+1
v,h,c,i,j = 1,1,0,0,0
while i < l-1 and j < l1-1:
    if input1[i] >= input2[j]:
        c += v*input1[i]
        h += 1
        i+=1

    else:
        c += h*input2[j]
        v += 1
        j+=1
while i < l-1:
        c += v*input1[i]
        h += 1
        i+=1
while j <  l1-1:
       c += h*input2[j]
       v += 1
       j+=1   
print(c)