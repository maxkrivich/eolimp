#include <stdio.h>
#include <limits.h>

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    printf("%d\n", n & (INT_MAX << k));
    return 0;
}
