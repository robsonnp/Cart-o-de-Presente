package aula3;

public class Main {
    public static void main(String[] args) {
        DiaDasMaes diaDasMaes = new DiaDasMaes("filho", "mãe");
        DiaDosNamorados diaDosNamorados = new DiaDosNamorados("namorado","namorada");

        escreverCartao(diaDasMaes);
        escreverCartao(diaDosNamorados);
    }

    public static void escreverCartao(CartaoDePresente cartaoDePresente){
        System.out.println(cartaoDePresente.getNomeRemetente());
        System.out.println(cartaoDePresente.getNomeDestinatario());
        System.out.println(cartaoDePresente.mensagem());
    }

    public static void imprimirPapel(Papel papel) {
        System.out.println("Imprimindo o papel " + papel);
    }
}
