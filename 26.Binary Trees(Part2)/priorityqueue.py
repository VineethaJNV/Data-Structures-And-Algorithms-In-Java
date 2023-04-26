from queue import PriorityQueue
class Solution:
    def lastStoneWeight(self, stones) -> int:
        q = PriorityQueue(reversed)
        for i in range(len(stones)):
            q.put(stones[i])
        # q.
        a = q.get()
        b = q.get()
        c= q.get()
        print(a,b,c)
Solution().lastStoneWeight([2,7,4,1,8,1])