package com.company;

import java.util.ArrayList;

public class Composite extends Component {

    protected ArrayList<Component> chapters = new ArrayList();

    public Composite(String title) {
        super(title);
    }

    public void add(Component c) {
        chapters.add(c);
    }
    /*
    @Override
    public void print() {
        int num = 1;
        System.out.println(title);
        for (Component c : chapters) {
            System.out.print(num + ". " );
            c.print();
            num++;
        }
    }

     */

    @Override
    public void print() {
        int num = 1;
        System.out.println();
        System.out.println(title);
        System.out.println();
        for (Component ch : chapters) {
            if (ch instanceof Leaf) {
                System.out.print(num + ". ");
                ch.print();
                num++;
            }
            if (ch instanceof Composite) {
                String chapterNum = String.valueOf(num);
                ((Composite) ch).printComposite(chapterNum);
                num++;
            }
        }
    }

    public void printComposite(String chapterNum) {
        System.out.println(chapterNum + ". " + title);
        int num = 1;
        chapterNum = "\t" + chapterNum;
        for (Component ch : chapters) {
            if (ch instanceof Leaf) {
                System.out.print(chapterNum + ". " + num + ". ");
                ch.print();
                num++;
            }
            if (ch instanceof Composite) {
                ((Composite) ch).printComposite(chapterNum + ". " + num);
                num++;
            }


        }


    }

}
