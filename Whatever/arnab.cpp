#include<iostream>
using namespace std;
class ap
{
        public:
         void display(){
            cout<<"i am a boy"<<endl;
         }
};
class sp:public ap{
    public:
       void display(){
        cout<<"i am a student"<<endl;
        ap::display();
       }
};
int main(){
    ap *aptr;
    sp ob;
    aptr=&ob;
    aptr->display();
    return 0;
}