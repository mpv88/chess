# Behaviors

- Parse the string representation of a chess move
  - Starting square
  - Destination square
  - Optional promotion piece
- Validate whether a Pawn Move is legal
  - One square forward
  - etc..

# Tests

- Parsing
  - "e2e4" -> Move with starting square e2
  - "e2e4" -> Move with destination square e4
  - "e2e4" -> Move with no promotion piece
  - "e2e9" -> Invalid move: rank 9 does not exist
  - "i2e4" -> Invalid move: file i does not exist
  - "e2" -> Invalid move: destination square is missing
  - etc..

- Pawn movement
  - White pawn on e2, empty e3 and e4 -> e2e3 is legal
  - White pawn on e4, empty e5 -> e4e5 is legal
  - White pawn on e4, empty e5 -> e4e6 is illegal
  - White pawn on e2, occupied e3 -> e2e3 is illegal
  - White pawn on e2, occupied e4 -> e2e4 is illegal
  - Black pawn on e7, empty e6 and e5 -> e7e6 is legal
  - Black pawn on e7, empty e6 and e5 -> e7e5 is legal
  - etc..
