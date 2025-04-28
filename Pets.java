class Pets {
    private boolean isMammal;
    private boolean hasLegs;
    private boolean hasFeathers;

    public Pets() {
        isMammal = false;
        hasLegs = false;
        hasFeathers = false;
        System.out.println("Pets DC called");
    }
    public Pets (boolean isMammal, boolean hasLegs, boolean hasFeathers) {
        this.isMammal = isMammal;
        this.hasLegs = hasLegs;
        this.hasFeathers = hasFeathers;
        System.out.println("Pets PC called");
    }
    public void getPetDetails() {
        System.out.println("Pet isMammal :" + isMammal);
        System.out.println("Pet hasLegs :" + hasLegs);
        System.out.println("Pet hasFeathers :" + hasFeathers);
    }
}
