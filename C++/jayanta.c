#include<stdio.h>
#include<conio.h>
#include<string.h>

void address();
void without();
void function();
void compare();
void length(); 
void lower();
void upper();
void vowels();
void reverse();
	   	    
int main()
  {   
     int ch;
     printf(" enter the number of your choice ");
     scanf("%d",&ch);
     switch(ch)
     {  case 1:
     	       address();
     	       break;
     	case 2: 
		       without();
			   break;
		case 3:	 
		       function();
			   break;
		case 4: 
		       compare();
		       break;
		case 5:
		       length();
			   break;
		case 6: 
		       lower();
		       break;
		case 7: 
		       upper();
			   break;
		case 8: 
		       vowels();
			   break;
		case 9:
		       reverse();
			   break;
		default :
		       printf(" wrong choice");	   
	
		 
     }
    return 0;
 }
    
    
    
    
    
    void address()
     {int i,n;
      char a[30];
      printf("ENTER ANY STRING: \n");
	  scanf("%s", &a);
	  n=strlen(a);
	  printf("\n THE ADDRESS LOCATION OF EACH ELEMENTS");
	  for(i=0;i<n;i++)
	   {printf("\n%d",a[i]);
			}	 
			     
	}
	
	
    void without()
	{  int a,b,i;
	   char s1[30];
	   char s2[30];
	   printf(" ENTER FIRST STRING: \n");
	   scanf("%s", &s1);
	   printf("  ENTER SECOND STRING: \n");
	   scanf("%s", &s2);
	   a=strlen(s1);
	   b=strlen(s2);
	   for(i=0;i<=b;i++)
	     {s1[a+i]=s2[i];
	         }
	    printf(" \n %s",s1);
		     
    }
    
    void function ()
      {int a,b,i;
	   char s1[30];
	   char s2[30];
	   printf(" ENTER FIRST STRING: \n");
	   scanf("%s", &s1);
	   printf("  ENTER SECOND STRING: \n");
	   scanf("%s", &s2);
	   strcat(s1,s2);
	   printf(" \n%s",s1);
	   
	  }
	  
	 
	void compare()
	 { int a,b,i;
	   char s1[30];
	   char s2[30];
	   printf(" ENTER FIRST STRING: \n");
	   scanf("%s", &s1);
	   printf("  ENTER SECOND STRING: \n");
	   scanf("%s", &s2);
       int value=strcmp(s1,s2);
       if(value==0)
          printf("\n same");
		else
		  printf(" \n not same ");
		    	   
	 }
	     
	void length()
	 {   char str [30];
	     char *ptr=str;
	     int c=0;
	     printf(" ENTER ANY STRING: \n");
	     scanf("%s", &str);
	     while(*ptr!='\0')
	     { c++;
	       ptr;
		 }
		 printf(" length of string = %d",c);
		 
		 }    
	 
	void lower()
	 { char s[30];
	   int i;
	   printf(" enter any string: \n");
	   scanf("%s", &s);
	   for(i=0;s[i]!='\0';i++)
	     { if(s[i]>='a'&& s[i]<='z')
	          {s[i]=s[i]-32;
			  }
			  }	
		printf("\n string in upper case =%s",s);
			   
	 }
  
    void upper()
     {  char s[30];
	   int i;
	   printf(" enter any string: \n");
	   scanf("%s", &s);
	   for(i=0;s[i]!='\0';i++)
	     { if(s[i]>='A'&& s[i]<='Z')
	          {s[i]=s[i]+32;
			  }
			  }	
		printf("\n string in lower case =%s",s);
	 }
	 
	void vowels()
	  {int c = 0, c1 = 0, i = 0;
	   char s[30];
	   printf(" ENTER THE STRING: \n");
	   scanf("%s", &s);
	   while(s[i]!='\0')
	     { if(s[c]=='a'||s[c]=='A'||s[c]=='e'||s[c]=='E'||s[c]=='i'||s[c]=='I'||s[c]=='o'||s[c]=='O'||s[c]=='u'||s[c]=='U')
	             {c1++;
	              c++;
				 }
		 }
		printf(" number of vowels = %d",c1);
		
		}
		
		  
		  
	void reverse()
	   {char s[30];
	    printf(" ENTER THE STRING: \n");
	    scanf("%s", &s);
	    strrev(s);
	    printf(" reverse = %s",s);
	    }