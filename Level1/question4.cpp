#include <iostream>
using namespace std;

int main() {
    double costPrice = 129;
    double sellingPrice = 191;

    double profit = sellingPrice - costPrice;
    double profitPercent = (profit / costPrice) * 100;

    cout << "Profit: " << profit << "\n"
         << "Profit Percentage: " << profitPercent << "%" << endl;

    return 0;
}
