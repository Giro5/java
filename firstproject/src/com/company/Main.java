package com.company;

// import library.classes.*;

public class Main {

    public static void main(String[] args) {
        // data type
        // primitive type
        // byte = -128 to 127
        // type short = -32768 to 32767
        // type int = -2 147 483 648 to 2 147 483 647; 32bit
        // type logn = -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807; 64bit
        // type float = 234.5f; 32bit
        // type double = 234.5d; 64bit
        // type char = 'D'; 68; \u0001
        // type boolean = true | false
        // type string = "some string"
        // referenced type
        // class SomeClass {}
        // SomeClass someinstance = new SomeClass()
        // NULL
        // generic - undefined <?>
        //
        // type reduction(cast)
        // byte -> short -> int
        // 1 -> 1 -> 1
        // int -> short -> byte
        // 1 -> 1 -> 1
        // 1000000 -> 16960 -> 64
        // int a = 1000000;
        // short b = (short) a;
        // byte c = (byte) b;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // create variables
        // 1. declair type - primitive, reference
        // 2. name_variable - a-z A-Z 0-9
        // 3. = - misappropriation
        // 4. if primitive then submit value
        // 5. ; - end of procedure
        // int u = 1;
        // int[] arr = new int[3];
        // int[][] mat = { { 1, 2 }, { 3, 4 } };

        // if (true && true || !false) {
        // }
        // else if (0 > 0 || 0 == 0 || 0 < 0 || 0 >= 0 || 0 <= 0 || 0 != 0) {
        // }
        // else{}

        // switch(a){
        // case 2:
        // break;
        // default:
        // break;
        // }
        //
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }
        //
        // while(condition){ code...}
        //
        // Создание классов, пакетов, файлов проекта
        // создания классов
        // 1. модификатор доступа
        // 2. ключевое слово class
        // 3. имя класса = имя переменной
        // 4. {} - область видимости класса, тело класса структура
        //
        // структура класса
        // свойства, конструктор, методы:публичные,приватные
        //
        // создание свойств: модификатор доступа, правило создание переменной, доп-но
        // static, final, abstract
        //
        // создание методов
        // модфикатор доступа
        // тип возращаемых данный, либо void
        // имя метода = имя переменной
        // () - область аргументов
        // {} - тело метода, область видимости метода
        //
        // создание конструктора
        // модификатор доступа и имя текущего класса
        // () - область аргументов
        // {} - тело конструктора
        //
        // создание объекта (экземпрял класса)
        // ссылочный тип
        // название нового объекта = имя переменной
        // = - пресвоение
        // new - ключевое слово поясняющее создается новый объект
        // название класса = ссылочному типу
        // () - конструктор
        // test - объект
        // NewClass test = new NewClass(6);
        // вызов свойств и методов
        // вызов происходит только из объектов
        // int y = test.getI(6);
        // System.out.println(y);

        // ConstructorClass cc = new ConstructorClass(3, "hi");
        // System.out.println(cc.CompleteStroke());

        // // overflow methods
        // OverflowMethod overflowmethod = new OverflowMethod();
        // System.out.println(overflowmethod.get(false, ""));

        // overflow constructor
        // OverflowMethod overflowmethod = new OverflowMethod(23);

        // наследование
        // ChildClass kid = new ChildClass();
        // NextChildClass grandkid = new NextChildClass();

        // объекты как типы данных (ссылочные типы)
        // OverflowMethod ov = new OverflowMethod();
        // int ot = ov.get(new Otype());
        // System.out.println(ot);
        // Otype otype = new Otype();
        // otype.i = 3;
        // ot = ov.get(otype);
        // System.out.println(ot);

        // example oop
        // TypeValue typeValue = new TypeValue(false, (byte) 5);
        // WorkClass wc = new WorkClass(typeValue);

        // обобщеные типы
        // TClass<String, String> tc = new TClass<>("hi", "hello");
        // TClass<Integer, Number> tc2 = new TClass<>(5, 6);
        // TClass<TypeValue, Object> tc3 = new TClass<>(new TypeValue(true, (byte) 5),
        // 7);
        // System.out.println(tc.getT());
        // System.out.println(tc2.getT());
        // System.out.println(tc3.getT().bo);
        // CLimit<TypeDefault> cl = new CLimit<>();
        // CLimit<TypeValue> cl2 = new CLimit<>();
    }
}

class CLimit<T extends TypeDefault> {

}

class TClass<T, TT> {
    private T t;
    private TT tt;

    TClass(T t, TT tt) {
        this.t = t;
        this.tt = tt;
    }

    public T getT() {
        return t;
    }

    public TT getTT() {
        return tt;
    }
}

class ConstructorClass {
    private int i;
    private String s;

    ConstructorClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public String CompleteStroke() {
        return s.repeat(i);
    }
}

class Otype {
    public int i = 1;
}

class OverflowMethod {

    // @Contract(pure = true)
    OverflowMethod() {

    }

    // @Contract(pure = true)
    OverflowMethod(int i) {

    }

    public int get(Otype otype) {
        return otype.i;
    }

    public int get() {
        return 1;
    }

    public int get(int i) {
        return 1 + i;
    }

    public int get(String str) {
        return str.length();
    }

    public String get(boolean b) {
        if (b)
            return "good answer";
        else
            return "bad answer";
    }

    public Object get(boolean b, String str) {
        if (b)
            return str + "overflow";
        else
            return null;
    }
}

class TypeDefault {
    public boolean bo;
    public char ch;
}

class TypeValue extends TypeDefault {
    public byte by;

    TypeValue(boolean bo, byte by) {
        this.bo = bo;
        this.by = by;
    }
}

class WorkClass {
    private boolean bo;
    private byte by;

    WorkClass(boolean bo, byte by) {
        this.by = by;
        this.bo = bo;
        System.out.println(write(bo));
    }

    WorkClass(TypeValue typeValue) {
        this.by = typeValue.by;
        this.bo = typeValue.bo;
        System.out.println(write(bo));
    }

    private String write(boolean bo) {
        if (bo)
            return "launch included service, with code " + by;
        else
            return "launch included service is canceled, with code " + by;
    }
}
