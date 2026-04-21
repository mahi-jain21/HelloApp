#include <iostream>
using namespace std;

class TicTacToe
{
private:
    char board[3][3];

public:
    // Constructor
    TicTacToe1()
    {
        initializeBoard();
    }

    // Initialize board
    void initializeBoard()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }
    }

    // Display board
    void displayBoard()
    {
        cout << "\nTIC TAC TOE BOARD\n\n";

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                cout << board[i][j] << " ";
            }
            cout << endl;
        }
    }
};

int main()
{
    TicTacToe game;
    game.displayBoard();

    return 0;
}