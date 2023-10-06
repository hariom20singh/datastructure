#include <iostream>
#include <stack>
using namespace std;

class DecimalToBinaryConverter {
public:
    DecimalToBinaryConverter(int decimalNum) : decimalNum_(decimalNum) {}

    void convertToBinary() {
        int num = decimalNum_;

        while (num > 0) {
            int remainder = num % 2;
            binaryStack_.push(remainder);
            num /= 2;
        }
    }

    void displayBinary() {
        while (!binaryStack_.empty()) {
            cout << binaryStack_.top();
            binaryStack_.pop();
        }
        cout << endl;
    }

private:
    int decimalNum_;
    stack<int> binaryStack_;
};

int main() {
    int decimalNum;
    
    cout << "Enter a decimal number: ";
    cin >> decimalNum;

    DecimalToBinaryConverter converter(decimalNum);
    converter.convertToBinary();

    cout << "Binary representation: ";
    converter.displayBinary();

    return 0;
}
