#include <iostream>
#include <cmath>
using namespace std;
int main() {
    double a, b, c;
    cout << "Enter a, b and c (double): ";
    cin >> a >> b >> c;
    double op1 = a + b * c;
    double op2 = a * b + c;
    double op3 = c + a / b;
    double op4 = fmod(a, b) + c;
    cout << "The results of Double Operations are "
         << op1 << ", " << op2 << ", " << op3 << ", " << op4 << endl;

    return 0;
}
