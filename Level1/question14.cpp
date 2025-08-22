#include <iostream>
using namespace std;
int main() {
    int numberOfStudents;
    cout << "Enter the number of students: ";
    cin >> numberOfStudents;
    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    cout << "The maximum number of handshakes among " << numberOfStudents 
         << " students is " << handshakes << endl;

    return 0;
}
