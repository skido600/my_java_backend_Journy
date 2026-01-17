Lifecycle of a Program
In Java, the program lifecycle consists of several distinct phases that work together to execute code. The process begins with developers writing Java source code in .java files using an IDE or text editor. This code is then compiled by the Java compiler (javac) into bytecode stored in .class files, with syntax and type checking performed during compilation. When the program runs, the Java Virtual Machine (JVM) loads these compiled class files into memory through a process involving loading of binary data, linking for verification and preparation, and initialization of class elements. The JVM then verifies the bytecode's security compliance, performs Just-In-Time (JIT) compilation to translate bytecode into native machine code for better performance, and executes the program instructions while managing system resources. Throughout execution, the JVM handles garbage collection by reclaiming memory from unused objects, and finally releases all resources upon program termination. This architecture enables Java's "write once, run anywhere" capability since the bytecode can execute on any device with a compatible JVM.

more explain here https://www.cesarsotovalero.net/blog/how-the-jvm-executes-java-code.html

Execution Lifecycle
The execution lifecycle of a Java application can be broadly divided into three phases:

Compilation: The source code of the application is converted into bytecode1 using the “javac” compiler.
Class Loading: The bytecode is loaded into memory and the necessary class files are prepared for execution.
Bytecode Execution: The JVM executes the bytecode and the program runs.
The JVM is responsible for managing the last phase. This includes loading the bytecode, allocating memory, and converting the bytecode into native machine code. In other words, the JVM handles the task of translating the bytecode into machine code that is specific to the target platform and executing it. This is a complex process because each microprocessor architecture “understands” a different set of instructions (e.g., x86, ARM, MIPS, PowerPC, etc.). The JVM also provides runtime services such as memory management, thread synchronization, and exception handling.

This post is focused on the bytecode execution phase.

The following activity diagram illustrates what happens during this phase:
