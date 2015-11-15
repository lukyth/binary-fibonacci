# Makefile for Writing Make Files Example

# *****************************************************
# Variables to control Makefile operation

Complile = javac
Run = java
Filename = cFibo
Output = output.txt

# ****************************************************
# Targets needed to bring the executable up to date

output.txt: cFibo.class
	$(Run) $(Filename) >> $(Output)
	cat $(Output)

# The main.o target can be written more simply

cFibo.class: cFibo.java
	javac cFibo.java
