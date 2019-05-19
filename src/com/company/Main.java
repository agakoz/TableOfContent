package com.company;

/*
Książka składa się z rozdziałów. Książka ma swój tytuł. Każdy rozdział może być podzielony na podrozdziały.
Każdy podrozdział może być również dzielony na kolejne podrozdziały. Każdy rozdział/podrozdział ma swój tytuł.
Ostatecznie dochodzimy do rozdziałów/podrozdziałów zawierających w sobie tylko tekst składający się akapitów
(paragrafów). Proszę zidentyfikować prosty wzorzec projektowy pozwalający na opisanie powyższych zależności.
Nie musi on uwzględniać akapitów i ich zawartości. Przy użyciu tego wzorca proszę napisać program pozwalający na:
Założenie struktury hipotetycznego dokumentu, struktura może być zdefiniowana sztywno w programie (zapisana w
kodzie). Proszę programowo zbudować przykładową strukturę.
Wygenerowanie spisu treści, w którym rozdziały każdego z poziomów zostaną automatycznie ponumerowane, a ich
tytuły zostaną umieszczone w spisie z odpowiednim wcięciem. Przykład — numery i poziom wcięć dobierane
automatycznie, tytuły wg definicji zawartych w kodzie
 */
public class Main {

    public static void main(String[] args) {


        Composite book = new Composite(" Book Title");
        Composite ch1 = new Composite("Chapter One");
        Composite ch2 = new Composite("Chapter Two");
        Composite ch3 = new Composite("Chapter Three");
        Composite ch4 = new Composite("Chapter Four");

        book.add(ch1);
        book.add(ch2);
        book.add(ch3);
        book.add(ch4);

        ch1.add(new Leaf("header "));
        ch1.add(new Leaf("header "));

        ch2.add(new Leaf("header "));
        ch3.add(new Leaf("header "));
        ch3.add(new Leaf("header "));

        Composite subch31 = new Composite("Subchapter");
        subch31.add(new Leaf("header "));
        subch31.add(new Leaf("header "));

        ch3.add(subch31);
        ch3.add(new Leaf("header "));

        book.print();
    }
}
