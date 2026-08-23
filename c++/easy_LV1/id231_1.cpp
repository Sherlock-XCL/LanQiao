#include<bits/stdc++.h>
using namespace std;
int main() {
    int n, k;
    cin >> n >> k;
    queue<int> q;
    for (int i = 1; i <= n; i ++) {
        q.push(i);
    }

    while (q.size() > 1) {
        for (int i = 1; i < k; i ++) {
            int s = q.front();
            q.pop();
            q.push(s);
        }
        q.pop();
    }
    cout << q.front();
    return 0;
}