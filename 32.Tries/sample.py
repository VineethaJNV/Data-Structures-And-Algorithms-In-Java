def f(i,j,c,visited):
    global mini
    if i == m-1 and j == n-1:
        if mini > c:
            mini = c
    if 0>i or i>m-1:return
    if 0>j or j>n-1:return
    if i+1<m and visited[i+1][j]!=1:
        visited[i+1][j]=1
        f(i+1,j,c+List[i+1][j], visited)
        visited[i+1][j]=0
    if i-1>=0 and visited[i-1][j]!=1:
        visited[i-1][j]=1
        f(i-1,j,c+List[i-1][j], visited)
        visited[i-1][j]=0
    if j+1<m and visited[i][j+1]!=1:
        visited[i][j+1]=1
        f(i,j+1,c+List[i][j+1], visited)
        visited[i][j+1]=0
    if j-1>=0 and visited[i][j-1]!=1:
        visited[i][j-1]=1
        f(i,j-1,c+List[i][j-1], visited)
        visited[i][j-1]=0
m,n = 5,5
mini = float('inf')
List = [[31, 100, 65, 12, 18 ],
        [ 10, 13, 47, 157, 6 ],
        [100, 113, 174, 11, 33 ],
        [ 88, 124, 41, 20, 140 ],
        [99, 32, 111, 41, 20 ]]
visit = [[0]*5 for i in range(5)]
visit[0][0] = 1
f(0,0,List[0][0],visit)
print(mini)