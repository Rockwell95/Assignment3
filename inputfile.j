.class public inputfile.udl
.super java/lang/Object

.method public <init>()V
	aload_0
	invokenonvirtual java/lang/Object/<init>()V
	return
.end method
.method public static main([Ljava/lang/String;)V
	.limit stack 50
	.limit locals 10


	ldc 10
	istore 0

	ldc 20
	istore 1

	getstatic java/lang/System/out Ljava/io/PrintStream;

	 iload 0
	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;

	 iload 0
	ldc 1
	iadd

	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


	ldc 0
	istore 0



	iload 0
	istore 2
	 ldc 5
	istore 3

	loop_0:
	getstatic java/lang/System/out Ljava/io/PrintStream;

	 iload 1
	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;

	 iload 0
	ldc 100
	isub

	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc ""
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


	iload 0
	ldc 1
	iadd

	istore 0


	iinc 2 1
	iload 2
	iload 3
	if_icmplt loop_0


	return

.end method
