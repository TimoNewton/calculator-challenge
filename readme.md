Calculator Challenge
====================

Background and detail
---------------------

Initially done with a simple, java 1.5 approach I quickly realised with some research that a) this is actually a very
common problem that is used in multiple examples for java, likely something I should have realised earlier.  In particular,
with the advent of java 1.8 and the ability to use Lambda's this became a much simpler problem by combining functional
interfaces with inheritance and lambda function.

The result is a calculator implementation that allows progressive operation, including the ability to reverse and replay
operations as you go along.  There are two implementations:  the simple calculator uses explicit methods associated with
each operator in an enumerator (both to apply the function and to revers it) while the lamba calculator uses lambda functions
to do the same thing.

Commands
--------

To run: ```./gradlew clean run```
to simply test: ```./gradlew clean test ```
