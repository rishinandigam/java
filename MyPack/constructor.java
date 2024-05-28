public class constructor {
    public int id;

    constructor() {
        id = 2005;
    }

    constructor(int n) {
        id = n;

    }

    public static void main(String[] args) {
        constructor c1 = new constructor();
        constructor c2 = new constructor(2002);
        System.out.println("constructor with out arguments " + c1.id);
        System.out.println("constructor with arguments: " + c2.id);
    }

}
