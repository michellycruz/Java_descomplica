class Main {
  public static void main(String[] args) {
    Cao pinsher = new Cao();
    pinsher.setIdade(4);

    if(pinsher.VerificarIdade()){
      System.out.println("Ele é um cachorrinho idoso");
    } else{
      System.out.println("Ainda está novinho");
    }
  }
}