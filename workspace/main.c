#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int *packet;
    int rcv, ack, code[9], gen[4], n, i;

    printf("\nenter the number of packets to be transmitted: ");
    scanf("%d", &n);

    packet = (int*) malloc (n * sizeof(int));
    printf("\nenter %d numbers: \n", n);
    
    for (i = 0; i < n; i++)
        scanf("%d", &packet[i]);

    srand(time(NULL));
    for (i = 0; i < n; i++)
    {
        printf("\nsent packet %d: %d", i + 1, packet[i]);
        rcv = rand() % 2;

        while (rcv != 1) {
            printf("\n\npacket lost.. resend packet %d: %d", i+1, packet[i]);
            rcv = rand() % 2;
        }

        printf("\treceived packet %d: %d", i+1, packet[i]);
        ack = rand() % 2;

        while(ack != 1) {
            printf("\tacknowledgement lost.. resend packet %d: %d", i+1, packet[i]);
            ack = rand() % 2;
            rcv = rand() % 2;
            while(rcv != 1) {
                printf("\n\tpacket lost.. resend packet %d: %d", i=1, packet[i]);
                rcv = rand() % 2;
            }
            printf("\treceived packet %d: %d", i+1, packet[i]);
        }
    }
    return 0;
}