package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String Ans = "";
        String stroka = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";

        List<String> Stroka_List = new ArrayList<>();

        String a[] = stroka.split("/");

        for (int i = 0; i < a.length; i++) {
            Stroka_List.add(a[i]);
        }

        ListIterator<String> it = Stroka_List.listIterator();

        while (it.hasNext()) {
            if (it.next().equals(".")) {
                it.remove();
            }
        }



        it = Stroka_List.listIterator();


        List<String> Promej_List = new ArrayList<>();


        while (it.hasNext()) {
            try {
                String q = it.next();

                if (q.equals("..")) {
                    Promej_List.remove(Promej_List.size() - 1);
                    it.remove();
                } else {
                    Promej_List.add(q);
                }

            } catch (IndexOutOfBoundsException e) {
                Ans += "../";
            }

        }

        String qwe = "";
        qwe += Ans;

        for (int i = 0; i < Promej_List.size(); i++) {
            qwe += Promej_List.get(i);
            qwe += "/";
        }

        String OTVET = qwe.substring(0,qwe.length()-1);

        System.out.println(OTVET);
    }
}
