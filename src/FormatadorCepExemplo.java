public class FormatadorCepExemplo {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatCep("62800000");

        System.out.println(cepFormatado);

    } catch (CepInvalidoException e) {
        System.out.println("O cep não corresponde com as regras estabelecidas");
    } 
    }
    static String formatCep(String cep) throws CepInvalidoException{
        if (cep.length()!= 8) 
        throw new CepInvalidoException();

        return "62.800-000";
    }
}
