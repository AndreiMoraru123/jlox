## Lox (programming language implementation)

This is the three-walk interpreter Java implementation from the book.

Each branch (other than `master`) represents an addition to the language, encompassing all the challenges (well, at least those that involve Java code) proposed by the author throughout each chapter.

The branches are not updated in line with the `master` branch. For example:
- The `ternary-operator` branch was created before the `Interpreter` class existed. As a result, it implements the ternary operator only in the `Parser`, so merging this branch would enable the language to parse ternary operators, but not execute them, which would be kind of useless.
- The `lambdas` branch, the anonymous functions implementation, was created prior to the `Resolver`. As such, these lambdas lack runtime resolution checks and will fail due to unresolved passes, though technically functional otherwise (haha, functional, did you get it?)
- etc.

Branches like `extension-methods`, addressing challenges later in the book dealing with classes and objects, could technically be merged into the main language, but I chose to let the `master` branch have the pristine implementation from the book for later reference.
