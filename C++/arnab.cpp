#include<iostream>
#include<string.h>
#include<ctype.h>
using namespace std;
class stri
{
    public:
  
      void concati(const char str[],char ctr[]){
        cout<<"The new string is:"<<strcat((const char[100])str,ctr)<<endl;
      }
      void comp(char mtr[],char ctr[]){
        
        if(strcmp(strlwr(mtr),strlwr(ctr))==0)
          cout<<"The strings are same"<<endl;
         else 
           cout<<"The strings are not same"<<endl; 

           cout<<strcmp(strlwr(mtr),strlwr(ctr));
      }
      void length(char *ptr){
        int c=0;
        for(int i=0; ;i++){
             c++;
             if((ptr[i])=='\0')
             break;
        }
        cout<<"The length is:"<<c-1<<endl;  
        }
    

    int main(int argc, char const *argv[])
    {
      /* code */
      return 0;
    }
    
// };
// int main(){
//     char str[100],ctr[100];
//     cout<<"Enter the first string:"<<endl;
//    gets(str);
//    cout<<"Enter the second string:"<<endl;
//    gets(ctr);
//    char *ptr=str;
//    stri aa;
//    aa.concati(str,ctr);
//    aa.comp(str,ctr);
//    //aa.length(ptr);
//    return 0;
// }