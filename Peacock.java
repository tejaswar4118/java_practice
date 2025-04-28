class Peacock extends Bird {
    private String name;
    private String color;
    private String country;

    public Peacock() {
        super();
        name = "Default Name";
        color = "Default Color";
        country = "Default Country";
        System.out.println("Peacock DC called");
    }
    public Peacock(String name, String color, String country) {
        super(false);
        this.name = name;
        this.color = color;
        this.country = country;
        System.out.println("Peacock PC called");
    }
    public void getPeacockDetails() {
        System.out.println("Peacock name :" + name);
        System.out.println("Peacock color :" + color);
        System.out.println("Peacock country :" + country);
    } 
}
