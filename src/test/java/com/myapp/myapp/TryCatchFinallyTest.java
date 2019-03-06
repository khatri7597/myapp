package com.myapp.myapp;
public class TryCatchFinallyTest implements Runnable {
 
    private void testMethod() throws InterruptedException
    {
        try
        {
            System.out.println("In try block");
            throw new NullPointerException();
        }
        catch(NullPointerException npe)
        {
            System.out.println("In catch block");
        }
        finally
        {
            System.out.println("In finally block");
        }
    }
 
    @Override
    protected void finalize() throws Throwable {
        System.out.println("In finalize block");
        super.finalize();
    }
 
    @Override
    public void run() {
        try {
            testMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}