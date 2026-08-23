#include<bits/stdc++.h>
using namespace std;
const int N = 1e3 + 5;
char a[N];
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    if (s1.size() != s2.size()) {
        cout << "NO" << "\n";
        return 0;
    }
    int flag = 1;
    for (char a1 : s1) {
        a[a1] ++;
    }

    for (char a2 : s2) {
        if (a[a2] == 0) {
            flag = 0;
            break;
        }
        a[a2] --;
    }

    if (flag == 1) {
        cout << "YES" << "\n";
    } else {
        cout << "NO" << "\n";
    }

    return 0;
}