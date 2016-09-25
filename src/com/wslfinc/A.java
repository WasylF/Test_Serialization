package com.wslfinc;

import java.io.Serializable;

/**
 *
 * @author Wsl_F
 */
public class A implements Serializable{
    public int a;
    public B b;
    public void print() {
        System.out.println("com.wslfinc.A.print()");
        System.out.println(a + "\n" + b.b);
    }
}
