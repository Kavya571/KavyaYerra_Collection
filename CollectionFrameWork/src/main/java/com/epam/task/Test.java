package com.epam.task;

public class Test {

public static void main(String[] args) 
{
    CustomLists<String> list = new CustomLists<>();
    list.add("Red");
    list.add("Blue");
    list.add("Yellow");
    list.add(" Green");
    list.add("Orange");
    list.add("White");
    list.add("Black");
    list.add("Pink");
    System.out.println(list);
    list.remove(3);
    list.remove(6);
    System.out.println(list);
    System.out.println( list.get(0) );
    System.out.println( list.get(1) );
    System.out.println( list.get(3) );
    System.out.println( list.get(4) );

    System.out.println(list.size());
}
}
