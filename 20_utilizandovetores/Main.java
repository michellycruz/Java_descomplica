class Main {
  public static void main(String[] args) {
    int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1,4,5,6,2,8,6,3};

    int totalPassaros = 0;
    int primeiraSemana = 0;
    int segundaSemana = 0;
    int terceiraSemana = 0;

    for(int i = 0; i < 21 ; i++){
      totalPassaros = totalPassaros + passarosPorDia[i];
    }
    
    System.out.println(totalPassaros);

    for(int i = 0; i < 7; i++){
      primeiraSemana = primeiraSemana + passarosPorDia[i];
    }
    System.out.println(primeiraSemana);

    for(int i = 7; i < 14; i++){
      segundaSemana = segundaSemana + passarosPorDia[i];
    }
    System.out.println(segundaSemana);

    for(int i = 14; i < 21 ; i++){
      terceiraSemana = terceiraSemana + passarosPorDia[i];
    }
    System.out.println(terceiraSemana);
  }
}