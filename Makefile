all:
	antlr4 -no-listener -no-visitor *.g4
	javac *.java

run:
	@java -cp C:\libs\antlr-4.5.2-complete.jar;. SimpleCompiler inputfile

clean:
	del *.java *.tokens *.class