# Chess in Java

A provisional Java implementation of the classic two-player chess game.

The project aims to implement the standard rules of chess, including piece movement, captures, check, checkmate, castling, en passant, and pawn promotion. For a general reference to the rules, see [Chess — Wikipedia](https://en.wikipedia.org/wiki/Chess).

## Status

Work in progress for a university final project.

## Requirements

- Java
- IntelliJ IDEA (recommended)

## Running

Instructions will be added once the project structure is finalized.

## Objectives

### Phase 1: Board & Setup
- [DONE] Board is represented as 8x8 matrix.
- [DONE] Each square is accessible through standard chess notation (like "A8" or "E4") as input and converting them into matrix indices:
  - [DONE] Files: Vertical columns on the board, labeled from a to h.
  - [DONE] Ranks: Horizontal rows on the board, labeled from 1 to 8
- Pieces can be placed on specific coordinates, has their representations (names).

### Phase 2: Pieces & Movement
- Abstract ‘Piece’ class with color and position.
- Specific piece subclasses (Pawn, Rook) implement custom movement rules.

## Tests
- ~~Chess board must have 8 rows.~~
- ~~Chess board must have 8 columns.~~
- ~~The "A7" will correspond to the [1,0] indices of the matrix.~~
- ~~The "B8" will correspond to the [0,1] indices of the matrix.~~
- ~~The "D3" will correspond to the [5,3] indices of the matrix.~~
- ~~The "E6" will correspond to the [2,4] indices of the matrix.~~
- ~~The "C1" will correspond to the [7,2] indices of the matrix.~~
- ~~The "G7" will correspond to the [1,6] indices of the matrix.~~
- ~~The "I8" will fail, return an error.~~
- ~~The "A9" will fail, return an error.~~
- If you are working on some Phase, please add the tests here.