package com.coy.introduction.systematic.thinking.lifeCycle;

/**
 * c语言程序生命周期
 * @author coy
 * @since 2021/4/23
 **/
public interface CcProgramLifecycle extends ProgramLifecycle {
    
    /**
     * 读取系统头文件并进行插入
     * step1、预处理 .c-->.i
     * 源程序（文本）->修改了的源程序（文本）
     *
     */
    default void preProcess(){
    
    }
    /**
     * step2、编译 .i->.s
     * 编译器 (eel) 将文本文件 hello.i 翻译成文本文件 hello.s, 它包含一
     * 个汇编语言程序
     * 修改了的源程序（文本）->汇编程序（二进制）
     */
    default void compile(){
    
    }
    /**
     * step3、汇编 .s -> .o
     * 汇编程序翻译成机器语言指令，二进制
     */
    default void assemble(){
    
    }
    /**
     * step4、链接 .o
     * 请 意， hello 程序调用了 printf 函数，它是每个编译器都提供的
     * 标准 库中的一个 printf 存在于一个名为 printf.o 独的预编译
     * 好了的目标文件中，而这个文件必须以某种方式合并到我们的 he 程序中
     * 接器 (Id) 就负责处理这种合并 结果就得到 hello 文件，它是 个可执行目标文件
     * （或者简称为可执行文件），可以被加载到内存中，由系统执行
     */
    default void link(){
    
    }
    
}
