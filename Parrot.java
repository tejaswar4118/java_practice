class Parrot extends Bird{
    private String name;
    private String color;
    public Parrot() {
        super(); //this line calls default constructor of bird
        name = "Default Name";
        color = "Default Color";
        System.out.println("Parrot DC called");
    }
    public Parrot(String name, String color) {
        super(true); //this line calls parameterized constructor of bird
        this.name = name;
        this.color = color;
        System.out.println("Parrot PC called");
    }
    public void getParrotDetails() {
        System.out.println("Parrot name :" + name);
        System.out.println("Parrot color :" + color);
    } 
}
