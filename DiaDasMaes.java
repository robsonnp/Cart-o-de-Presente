package aula3;

public class DiaDasMaes extends CartaoDePresente implements Papel{

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mensagem(){
        return "Mensagem do dia das mães";
    };

}
