ListNode cycleStart = null;
    public boolean isCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycleExists = false;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycleExists = true;
                break;
            }
        }
       if(isCycleExists){
         slow = head;
         isCycleExists = true;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next;
                if(slow == fast){
                     cycleStart = slow;
                    return isCycleExists;
                }
            }
       }
        return isCycleExists;
        
    }
    public int findLength(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        if(head.next != null && head.next.next != null){
            if(head.next.next.val == head.val){
                return head;
            }
        }
        return isCycle(head) ? cycleStart : null;
       
    }
