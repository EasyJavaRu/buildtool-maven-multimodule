package ru.easyjava.maven;

/**
 * Hello world!
 *
 */
public class Greeter
{
    public static void main(String[] args) {
        System.out.println(String.format("Hello, %s!", GreetingTarget.getTarget()));
    }
}
