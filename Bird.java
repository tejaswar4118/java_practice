class Bird extends Pets {
    private boolean canFly;
    public Bird() {
        super(); // this line calls default constructor of pets
        canFly = false;
        System.out.println("Bird DC called");
    }
    public Bird(boolean canFly) {
        super(false, true, true); //this line calls parameterized constructor of pets
        this.canFly = canFly;
        System.out.println("Bird PC called");
    }
    public void getBirdDetails() {
        System.out.println("Bird canFly :" + canFly);
    }
}
