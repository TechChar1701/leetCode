package src.lc.LinkedList;

public class linkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }}

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        ListNode head =list1;
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);

int n =2;
        // Define list2: 1 -> 2 -> 3
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        isPalindrome(head);
      //  addTwoNumbers(list1, list2);
    //mergeTwoLists(list1,list2);
    //removeNthFromEnd(head,n);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode returnNode = new ListNode(Integer.MIN_VALUE);
       ListNode headNode = returnNode;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
       while (list1!=null && list2!=null){
           if(list1.val<list2.val){
               returnNode.next= list1;
               list1= list1.next;
           }
           else{
               returnNode.next= list2;
               list2= list2.next;
           }
           returnNode= returnNode.next;
           if(list1==null){
               returnNode.next= list2;
           }
           else{
               returnNode.next=list1;
           }
       }


       return headNode.next;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count =0;
        while (temp!=null){
            count+=1;
            temp= temp.next;
        }
        temp= dummy;
        int k = count-n;
        for (int i =0; i<k;i++){
        temp= temp.next;
        }
        temp.next= temp.next.next;
        return dummy.next;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode();
    ListNode curr= dummy;
    int carry =0;

    while (l1 != null || l2 != null || carry != 0){
        int sum= carry;
        if(l1 != null){
            sum+=l1.val;
            l1= l1.next;
        }
        if(l2 != null){
            sum+=l2.val;
            l2= l2.next;
        }
    carry= sum/10;
        sum %= 10;
        curr.next= new ListNode(sum);
        curr = curr.next;
        }
    return dummy.next;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode dummy = head;
        StringBuilder sb = new StringBuilder();
        boolean flag= false;
        while (dummy!= null){
            sb.append(dummy.val);
            dummy= dummy.next;
        }
        String original = sb.toString();
        String reverse = sb.reverse().toString();

return original.equals(reverse);
    }
    }
