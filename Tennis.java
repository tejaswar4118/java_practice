 class Tennis extends Sports {
 private String court_type;
    
public Tennis(){
    super();
    court_type = "default_court";
}
public Tennis(String court_type){
    super(true, false, true);
    this.court_type = court_type;
}
public void play(){
    System.out.println("play : tennis");
}

 }
