#include <iostream>
#include<math.h>
using namespace std;

class Node {
    private:
        int value;
        Node *nextNode = NULL;

    public:
        void setNext(Node *);                                // function to add a node at the end of linked list.
        friend ostream &operator<<(ostream &, const Node &); // overloading << for printing nodes
        ~Node();                                             // destructor, deletes all pointers in memory 

        void setNext(const Node* node) {
            nextNode = (node!=NULL)? new Node(*node):nullptr ;  // copy constructor
        }
        bool hasValue() const {return true;}                    // check if the current object is a valid
        static string getClassName(){return "Node";}            // returns class name as a string
        virtual string toString()=0;                             // pure virtual function to be implemented by derived classes
};

int main(int argc, char const *argv[])
{
    cout<<pow(1,2)
    return 0;
}