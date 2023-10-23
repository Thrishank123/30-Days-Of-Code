#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d",&t);
    getchar();
    char *ptr=(char*)malloc(10000*(sizeof(char)));
    if(ptr ==NULL)
    return 1;
    for(int i=0;i<t;i++)
    {
        int j=0;
        char c;
        while (1) {
            c = getchar();
            if (c == '\n' || c == EOF) {
                break;
            }
            ptr[j] = c;
            j++;
        }
        for (int z = 0; z < j; z++) {
            if(z%2 == 0)
            printf("%c", ptr[z]);
        }
         printf(" ");
        for (int z = 0; z < j; z++) {
            if(z%2 != 0)
            printf("%c", ptr[z]);
        }
        printf("\n");
    }
    free(ptr);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
