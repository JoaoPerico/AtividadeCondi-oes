public class Atividade5 {
    public static void main(String[] args) {
Integer dias = 5;
String diaSemana;

//switch
        switch (dias) {
case 1:
        diaSemana = "Segunda-feira";
        break;
case 2:
        diaSemana ="Terça-feira";
        break;
case 3:
        diaSemana = "Quarta-feira";
        break;
case 4:
        diaSemana = "Quinta-feira";
        break;
case 5:
        diaSemana = "Sexta-feira";
        break;
case 6:
        diaSemana = "Sabado";
        break;
case 7:
        diaSemana = "Domingo";
        break;
        default:
            diaSemana = "Invalido";
}

System.out.println(diaSemana);

    }
}
