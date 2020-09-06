package com.ydy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


/**
 * 演示HashSet是如何保证元素的唯一性的 * @author WangShuang *
 */
public class Demo {
    public static void main(String[] args) {
        Person p = new Person("张三", "男");
        Person p1 = new Person("张四", "男");
        Set<Person> hashSet = new HashSet<Person>();
        hashSet.add(p);
        hashSet.add(p1);
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }
}

class Person {
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + "]";
    }
}

