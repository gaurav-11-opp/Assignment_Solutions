#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    cout << "Enter a, b and c (integers): ";
    cin >> a >> b >> c;
    int op1 = a + b * c;  
    int op2 = a * b + c;  
    int op3 = c + a / b;  
    int op4 = a % b + c; 
    cout << "The results of Int Operations are "
         << op1 << ", " << op2 << ", " << op3 << ", " << op4 << endl;

    return 0;
}
