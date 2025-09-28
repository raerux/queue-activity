public class SistemaHospital {
    private Fila<String> exames;
    
    public SistemaHospital() {
        exames = new Fila<>();
    }
    
    public void registrarExame(String exame) {
        exames.enfileirar(exame);
        System.out.println("Exame registrado: " + exame);
    }
    
    public void imprimirProximoExame() {
        if (!exames.vazia()) {
            String exame = exames.desenfileirar();
            System.out.println("Imprimindo exame: " + exame);
        } else {
            System.out.println("Nenhum exame para imprimir");
        }
    }
    
    public void imprimirTodosExames() {
        System.out.println("Imprimindo todos os exames:");
        while (!exames.vazia()) {
            imprimirProximoExame();
        }
    }
    
    public static void main(String[] args) {
        SistemaHospital hospital = new SistemaHospital();
        
        hospital.registrarExame("Raio-X Paciente A - 09:00");
        hospital.registrarExame("Ultrassom Paciente B - 10:30");
        hospital.registrarExame("Tomografia Paciente C - 14:00");
        hospital.registrarExame("Ressonância Paciente D - 16:15");
        
        System.out.println("\nFim do dia - imprimindo exames:");
        hospital.imprimirTodosExames();
    }
}