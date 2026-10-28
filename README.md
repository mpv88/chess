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
- Board is represented as 8x8 matrix.
- Pieces can be placed on specific coordinates.
- Each square is accessible through standard chess notation (like "A8" or "E4") as input and converting them into matrix indices.

### Phase 2: Pieces & Movement
- Abstract ‘Piece’ class with color and position.
- Specific piece subclasses (Pawn, Rook) implement custom movement rules.

## Tests
- Chess board must have 8 rows.
- Chess board must have 8 columns.
- The "A8" will correspond to the [0,0] indices of the matrix.