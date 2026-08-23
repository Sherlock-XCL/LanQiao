#include<bits/stdc++.h>
using namespace std;
int main() {
    int a;
    cin >> a;
    int ans = a;
    int k = a; // k表示瓶盖数
    int s = 0; // s表示瓶盖可以换的饮料数
    while (k >= 3) {
        s = k / 3;
        ans += s;
        k = k % 3 + s;
    }
    printf("%d\n", ans);
    return 0;
}