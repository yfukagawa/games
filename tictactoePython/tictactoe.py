# board data 
slots = ['1','2','3','4','5','6','7','8','9']
loopIndex = 0
gameIndex = 0

# board visual
print('-','-','-','-','-','-','-',)
print('|',slots[0], '|',slots[1],'|', slots[2],'|')
print('-','-','-','-','-','-','-',)
print('|',slots[3], '|',slots[4],  '|', slots[5],'|')
print('-','-','-','-','-','-','-',)
print('|',slots[6],  '|',  slots[7], '|', slots[8],'|')
print('-','-','-','-','-','-','-',)


# player 1 functions
while loopIndex < 1:
    player1 = input("Select the slot by entering a number 1 - 9: ")
    print("Player 1 selected: " + player1)
    if slots[player1 -1] == 1 or slots[player1 -1] == 2 or slots[player1 -1] == 3 or slots[player1 -1] == 4 or slots[player1 -1] == 5 or slots[player1 -1] == 6 or slots[player1 -1] == 7 or slots[player1 -1] == 8 or slots[player1 -1] == 9:
        slots[player1 -1] = 'P1'
        loopIndex = 1
    elif slots[player1 -1] == 'P1' or slots[player1 -1] == 'P2':
        print("Invalid. That slot is already chosen. Please select a different slot.")
        loopIndex = 0
    else:
        print("Invalid choice.")
        loopIndex = 0


# player 2 functions


# slot data update functions