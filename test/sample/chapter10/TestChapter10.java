package sample.chapter10;

import junit.framework.TestCase;
import org.junit.Test;
import org.reflections.Reflections;
import sample.chapter10.ex7.Interface;
import sample.chapter8.ForChapter10Ext;
import sample.chapter9.ForChapter10;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * Copyright (c) Anton on 18.09.2017.
 */
public class TestChapter10 extends TestCase {
    public void testEx1p290() {
        Outer outer = new Outer("sad");
        Outer.Inner inner = outer.returnInner();
        System.out.println(inner.toString());
    }

    public void testEx7p295() {
        new Ex7p295().innerMetodTwo();
    }

    public void testEx6p295() throws IllegalAccessException, InstantiationException {
        ForChapter10Ext forChapter10Ext = new ForChapter10Ext();
        Class <? extends ForChapter10> aClass = forChapter10Ext.returnInter().getClass();
        String canonicalName = aClass.getCanonicalName();
        AnnotatedType[] annotatedInterfaces = aClass.getAnnotatedInterfaces();
        AnnotatedType annotatedInterface = annotatedInterfaces[0];
        System.out.println(annotatedInterface.getType().getTypeName());
        System.out.println(canonicalName);

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            ForChapter10Ext forChapter10Ext1 = forChapter10Ext.getClass().newInstance();
        }

        Class <ForChapter10Ext> forChapter10ExtClass = ForChapter10Ext.class;
        ForChapter10Ext forChapter10Ext1 = forChapter10ExtClass.newInstance();
    }

    public Interface getInterface() {
        class InterfaceImpl implements Interface {

            @Override
            public void method() {
                System.out.println("Wonderfull!");
            }
        }

        return new InterfaceImpl();
    }

    public void testEx7p297() {
        getInterface().method();

        Reflections reflections = new Reflections("sample.chapter10");

        Set <Class <? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);

        for (Class <?> each : allClasses) {
            System.out.println(each.getCanonicalName());

        }


    }

    public Interface getInterfaceA() {

        Interface anInterface = new Interface() {
            @Override
            public void method() {
                System.out.println("Wond!");
            }
        };
        return anInterface;
    }


}

