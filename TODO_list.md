# TODO List

## Build Automation — Gradle

- [ ] Initialize the project with Gradle and the Java plugin
- [ ] Configure a modern, supported Java LTS version
- [ ] Add and commit the Gradle Wrapper for reproducible builds
- [ ] Organize production code in `src/main/java`
- [ ] Organize test code in `src/test/java`
- [ ] Configure `build`, `test`, and `run` Gradle tasks
- [ ] Keep the build script readable and documented

## Test-Driven Development — JUnit

- [ ] Add JUnit as the testing framework
- [ ] Configure Gradle to execute JUnit tests
- [ ] Write tests before implementing each chess rule
- [ ] Cover normal behavior and edge cases
- [ ] Test piece-specific movement rules
- [ ] Test captures, check, checkmate, and stalemate
- [ ] Test special moves: castling, en passant, and pawn promotion
- [ ] Keep tests small, focused, readable, and independent
- [ ] Use meaningful test names that describe the behavior being verified
- [ ] Ensure the full test suite passes before merging changes

## Continuous Integration — GitHub Actions

- [ ] Add a GitHub Actions workflow for Java with Gradle
- [ ] Run the workflow on every push and pull request
- [ ] Compile the project and execute all JUnit tests
- [ ] Make CI fail if compilation, tests, or static checks fail
- [ ] Cache Gradle dependencies to speed up workflow runs
- [ ] Review CI results before merging branches
