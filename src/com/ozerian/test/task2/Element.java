package com.ozerian.test.task2;

/**
 * Class for representation of collection element.
 * This class has appropriate fields (num, name, age).
 * HashCode is generated with including only num int field.
 */
public class Element {

    private int num;

    private String name;

    private int age;

    public Element(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;

        Element element = (Element) o;

        return num == element.num;

    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public String toString() {
        return "Element{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
