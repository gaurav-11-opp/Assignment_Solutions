#include <iostream>
using namespace std;

int main() {
    int totalPens = 14;
    int students = 3;

    int pensPerStudent = totalPens / students;  
    int remainingPens = totalPens % students;  

    cout << "The Pen Per Student is " << pensPerStudent
         << " and the remaining pen not distributed is " << remainingPens << endl;

    return 0;
}
