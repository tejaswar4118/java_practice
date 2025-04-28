 class Test_cric extends Cricket{
    private int num_innings;
    private int num_days;
    public Test_cric(){
        super();
        num_innings = 4;
        num_days = 5;
    }
    public Test_cric(int num_innings, int num_days) {
        super("white");
        this.num_innings = num_innings;
        this.num_days = num_days;
    }
    public void play() {
        System.out.println("play : test cricket");
    }



 }
