#include <stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  int i,result=1;
  if(n<0)
  {
    printf("Error");
  }
  else
  {
    for(i=1;i<=n;i++)
    {
      result=result*i;
    }
    printf("%d",result);
  }
}
  