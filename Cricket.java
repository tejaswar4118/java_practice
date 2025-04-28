 class Cricket extends Sports {
    private String jersey_color;

    public Cricket(){
        super();
        jersey_color = "DEFAULT_COLOR";
    }
    public Cricket(String jersey_color){
        super(true, true, false);
        this.jersey_color = jersey_color;
    }
    public void play(){
        System.out.println("play : cricket");
    }

}
