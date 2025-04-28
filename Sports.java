class Sports {
    private boolean ball;
    private boolean team_work;
    private boolean indoor_sport;
    

    public Sports(){
        ball = false;
        team_work = false;
        indoor_sport = false;
        System.out.println("dc of sport");
    }
    public Sports(boolean ball, boolean team_work, boolean indoor_sport){
        this.ball = ball;
        this.team_work = team_work;
        this.indoor_sport = indoor_sport;
        
        System.out.println("pc of sport");
    }
    public void play(){
        System.out.println("play : sports");
    }

}
