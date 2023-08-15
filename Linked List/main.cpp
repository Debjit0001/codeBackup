#include<iostream>
using namespace std;

// creating a separate Node class for the linkedList
class Node {
    public:
        int value;
        Node* next;

        Node() {}

        Node(int value) {
            this -> value = value;
            this -> next = NULL;
        }

        Node(int value, Node* next) {
            this -> value = value;
            this -> next = next;
        }
};

class LinkedList : private Node{
    private:
        int length;
        Node *head, *tail;

    public:

        LinkedList() {
            this -> head = nullptr;
            this -> tail = nullptr;
            this -> length = 0;
        }

        void insertAtHead(int value) {
            Node* newNode = new Node(value);
            if(head == nullptr) {
                head = newNode;
                tail = head;
            } else {
                newNode -> next = head;
                head = newNode;
            }
            ++length;
        }

        int deleteAtHead() {
            Node* tempNode = head;
            int value = tempNode -> value;
            delete tempNode;

            head = head -> next;
            if(head == nullptr)
                tail = head;
            --length;

            return value;
        }

        void insertAtTail(int value) {
            if(tail == nullptr) {
                insertAtHead(value);
                return;
            }

            Node* newNode = new Node(value);
            tail -> next = newNode;
            tail = newNode;
            
            ++length;
        }

        int deleteAtTail() {
            --length;

            if(head == tail) {
                int val = head -> value;
                delete head;
                head = nullptr;
                tail = head;
                return val;
            }

            Node* currNode = head;
            while(currNode -> next != tail) 
                currNode = currNode->next;
            
            // Now the currNode points to the second-last node
            int val = tail -> value;
            delete tail;

            tail = currNode;
            return val;
        }

        void insertAtIndex(int value, int idx) {
            if(idx == 0) {
                insertAtHead(value);
                return;
            }

            if(idx == length) {
                insertAtTail(value);
                return;
            }

            Node* currNode = this -> head;
            for(int i = 1; i < idx; i++)
                currNode = currNode -> next;
            Node* newNode = new Node(value, currNode -> next);
            currNode -> next = newNode;
            ++length;
        }

        Node* get(int index) {
            Node* currNode = this -> head;
            for (int i = 0; i < index; i++)
                currNode = currNode -> next;

            return currNode;
            
        }

        void printList() {
            if(length == 0) {
                cout << "[ ]" << endl;
                return;
            }
            Node* temp = this -> head;
            cout << "[ " ;
            while(temp -> next != nullptr) {
                cout << temp -> value << " -> " ;
                temp = temp -> next;
            }
            cout << temp -> value << " ]" << endl;
        }

        Node* getHead() { return this -> head; }
        Node* getTail() { return this -> tail; }
        int size() { return this -> length; }

        ~LinkedList() {
            while(this -> head != NULL) {
                Node* tempNode = head;
                head = head -> next;
                delete tempNode;
            }
        }
};

int main()
{
    LinkedList list;
    list.insertAtTail(10);
    list.insertAtTail(20);
    list.insertAtTail(30);
    list.insertAtTail(40);
    list.insertAtTail(50);

    list.insertAtIndex(25, 2);
    list.printList();

    cout << list.getTail()->value << endl;

    cout << list.get(2)->value << endl;
    // list.deleteAtTail();
    // list.printList();
    
    return 0;
}
