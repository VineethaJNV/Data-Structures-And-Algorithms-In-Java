
def f(i,j,c):
    print(i,j)
    if i == m-1 and j == n-1:
        if mini > c:
            mini = c
        return
    if 0>i or i>m-1:return
    if 0>j or j>n-1:return
    if i+1<m:f(i+1,j,c+List[i+1][j])
    if i-1>=0:f(i-1,j,c+List[i-1][j])
    if j+1<m:f(i,j+1,c+List[i][j+1])
    if j-1>=0:f(i,j-1,c+List[i][j-1])
    
m,n = 5,5
mini = float('inf')
List = [[31, 100, 65, 12, 18 ],
                    [ 10, 13, 47, 157, 6 ],
                    [100, 113, 174, 11, 33 ],
                    [ 88, 124, 41, 20, 140 ],
                    [99, 32, 111, 41, 20 ]]
f(0,0,List[0][0])
print(mini)