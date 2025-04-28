class Wimbledon extends Tennis{
    private String location;

    public Wimbledon(){
        super();
        location = "Default location";
    }
    public Wimbledon(String location){
        super("grass");
        this.location = location;
    }
    public void play(){
        System.out.println("play:wimbledon");
    }

    
}
