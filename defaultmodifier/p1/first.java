package p1;

class first {
    void _default_() {
        System.out.println("This is a Default access modifier");
    }

    public static void main(String[] args) {
        first B = new first();
        B._default_();
    }
}
