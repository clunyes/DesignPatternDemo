package javatest.lock;

public class volatiletxt {
    /**
     * 在并发编程中，我们通常会遇到以下三个问题：原子性问题，可见性问题，有序性问题。我们先看具体看一下这三个概念：
     *
     * 1. 可见性:可见性是指当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。
     * 2. 原子性:即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。
     * 3. 有序性:即程序执行的顺序按照代码的先后顺序执行。
     *
     * 简单总结下，volatile是一种轻量级的同步机制，它主要有两个特性：一是保证共享变量对所有线程的可见性；二是禁止指令重排序优化。
     *
     * 不要将volatile用在getAndOperate场合（这种场合不原子，需要再加锁），仅仅set或者get的场景是适合volatile的。
     */
}
