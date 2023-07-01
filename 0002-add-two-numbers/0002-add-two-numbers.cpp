/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* l3=new ListNode(0);
        ListNode* head=l3;
        int temp=0;
        while(l1 && l2){
            int val=l1->val+l2->val+temp;
            temp=val/10;
            l3->next=new ListNode(val%10);
            l3=l3->next;
            l1=l1->next;
            l2=l2->next;
        }

        while(l1){
            int val=l1->val+temp;
            temp=val/10;
            l3->next=new ListNode(val%10);
            l3=l3->next;
            l1=l1->next;
        }
        while(l2){
            int val=l2->val+temp;
            temp=val/10;
            l3->next=new ListNode(val%10);
            l3=l3->next;
            l2=l2->next;
        }
        if(temp!=0){
            l3->next=new ListNode(temp);
        }
           
           return head->next;
    }
};