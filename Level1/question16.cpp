#include <iostream>
using namespace std;

int main() {
    int numberOfStudents;
    cout << "Enter number of students: ";
    cin >> numberOfStudents;

    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

    cout << "The maximum number of possible handshakes is " << handshakes << endl;
    return 0;
}
