#include <bits/stdc++.h>
using namespace std;
const int K = 1e3 + 5;
int a[K];
int main() {
    string str;
    cin >> str;
    int flag = 1;
    for (char s : str) {
        if (a[s - 0] != 0) {
            flag = 0;
            break;
        }
        a[s - 0] ++;
    }
    if (flag == 1) {
        cout << "YES" << "\n";
    } else {
        cout << "NO" << "\n";
    }
    return 0;
}