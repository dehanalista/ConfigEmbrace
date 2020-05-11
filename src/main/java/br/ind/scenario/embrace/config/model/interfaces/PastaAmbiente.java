package br.ind.scenario.embrace.config.model.interfaces;

public interface PastaAmbiente {

    String GetNome();
    void SetNome(String nome);

    String GetImagem();
    void SetImagem(String imagem);

    Integer GetID();

    void AdicionarItem(ItemPastaAmbiente item);
    void RemoverItem(ItemPastaAmbiente item);

    void NotificarItens();

//    IXMLNode SalvarXML(AXml: IXMLNode);
//    IItensContainer GetContainer();
//    String SetNotificacaoPastaAmbiente(ANotificacao: TNotificacaoPastaAmbiente);

}
