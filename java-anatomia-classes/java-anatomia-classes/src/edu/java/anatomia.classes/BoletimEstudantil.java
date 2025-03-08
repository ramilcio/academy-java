public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 4;
        
        if (mediaFinal < 6) 
            System.out.println("REPROVADO"); // Alterado para println para manter consistência
        else if (mediaFinal == 6) 
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO");
    }
}

