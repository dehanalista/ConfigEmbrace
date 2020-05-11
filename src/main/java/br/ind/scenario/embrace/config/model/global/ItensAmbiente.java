package br.ind.scenario.embrace.config.model.global;

public class ItensAmbiente extends Node {

    private Ambiente ambiente;
    private int pasta;


    /*
    TItensAmbiente = class(TNode, INode, IItemTreeView, IPrototypeItensAmbiente, IItemPastaAmbiente)
    strict private
        procedure Notificar(const ANotificacao: TNotificacaoPastaAmbiente);
    protected

        constructor Create; overload;
        constructor Create(AAmbiente: TAmbiente; ANome: string; AId: Integer; ATipoClasse: ETipoClasse); overload;
        constructor Create(AXml: IXMLNode; AAmbiente: TAmbiente; ATipoClasse: ETipoClasse); overload;

        procedure SetAmbiente(AAmbiente: TAmbiente);
        procedure CarregarXML(const AXml: IXMLNode; const AAmbiente: TAmbiente); overload; virtual;

        function Clone(var AItemAmbiente: TItensAmbiente; AAmbiente: TAmbiente): TItensAmbiente; overload; virtual;
    public
        destructor Destroy; override;

        function Clone(AAmbiente: TAmbiente; AId: Integer): TItensAmbiente; overload; virtual; abstract;
        function SalvarXML(AXml: IXMLNode): IXMLNode; override;
        function GetProjeto: TProjeto;

        property Ambiente: TAmbiente read _ambiente write SetAmbiente;
        property Pasta: Integer read _pasta;
    */
}
