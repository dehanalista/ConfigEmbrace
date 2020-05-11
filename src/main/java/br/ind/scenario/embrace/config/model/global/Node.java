package br.ind.scenario.embrace.config.model.global;

public class Node {

//    _nodeXml: IXMLNode;
    private String nome;
    private int id;
    private Node owner;
//    _tipoClasse: ETipoClasse;
    private String observacao;
    private boolean desligaGeral;
    private String tipoLinkStr;
    private String imagem;
    private int numeroMaximo;
    private boolean invisivel;
    private boolean watchDog;
    private Object parent;
    private boolean podeSerAtividade;
    private int indiceTreeView;

//    FOutputLinks: TLinkArray;



    /*
      TNode = class(TObject, INode, IPrototype)
      protected

        function GetPodeSerAtividade: Boolean; virtual;
        function GetImagem: string; virtual;
        function GetNomeTitulo: string; virtual; abstract;
        function GetNoHabilitado: Boolean; virtual;
        function GetSuportaGeracaoInterface: Boolean; virtual;

        constructor Create; overload; // Vai sair  (falta CmdBlock)
        constructor Create(AXml: IXMLNode); overload; // Vai sair(falta CmdBlock)
        constructor Create(ANome: string; ATipoClasse: ETipoClasse; AId: Integer); overload;
        constructor Create(AXml: IXMLNode; ATipoClasse: ETipoClasse); overload;

        procedure Clone(var AObjeto: TNode; AOwner: TNode);

        function GetNome: string; virtual;

        function GetNomeNode: string; virtual; abstract;

        function GetInvisivel: Boolean; virtual;

        function QueryInterface(const IID: TGUID; out Obj): HResult; stdcall;
        function _AddRef: Integer; stdcall;
        function _Release: Integer; stdcall;

        procedure SetInvisivel(const Value: Boolean); virtual;
        procedure SetImagem(const Value: string); virtual;
        procedure SetTipoLinkStr(const Value: string); virtual;
        procedure SetDesligaGeral(const Value: Boolean); virtual;
        procedure SetObservacao(const Value: String); virtual;
        procedure SetTipoClasse(const Value: ETipoClasse); virtual;
        procedure SetID(const Value: Integer); virtual;
        procedure SetOwner(const Value: TNode); virtual;
        procedure SetNome(const Value: string); virtual;
        procedure SetNumeroMaximo(const Value: Integer); virtual;
        procedure CarregarXML(const AXml: IXMLNode); virtual;

        function GetOwner: TNode; virtual;
        function GetID: Integer;

        function GetIndiceTreeView: Integer;
        procedure SetIndiceTreeView(const AIndice: Integer);

        function GetParentTreeView: TObject; virtual;
        procedure SetParentTreeView(const AParent: TObject);
        function GetTextoEstatico(const AVisualizarDescricao: Boolean): string; virtual;
      public


        destructor Destroy; override;
        function GetObjeto: TObject;

        procedure CriarConexoes(AProjeto: TProjeto); virtual;

        function ValidarNome(ANovoNome: string): string; virtual;
        function SalvarXML(AXml: IXMLNode): IXMLNode; virtual;
        function ValidaProjeto(AErros: TStringList; ANivelVerificacao: ETipoInconsistencia): Boolean; virtual;

        function ContemId(const AId: Integer): Boolean; virtual;
        function RecuperarId(const AId: Integer): TNode; virtual;
        function PodeSerApagado: Boolean; virtual;
        function PodeSerRenomeado: Boolean; virtual;
        function PodeSerUtilizadoEmMacro: Boolean; virtual;

        property Nome: string read GetNome write SetNome;
        property NomeTitulo: string read GetNomeTitulo;
        property Owner: TNode read GetOwner write SetOwner;
        property ID: Integer read GetID write SetID;
        property TipoClasse: ETipoClasse read _tipoClasse write SetTipoClasse;
        property Observacao: String read _obs write SetObservacao;
        property DesligaGeral: Boolean read _desligaGeral write SetDesligaGeral;
        property NomeNode: string read GetNomeNode;
        property TipoLinkStr: string read _tipoLinkStr write SetTipoLinkStr;
        property Imagem: string read GetImagem write SetImagem;
        property NumeroMaximo: Integer read _numeroMaximo write SetNumeroMaximo;
        property NodeXML: IXMLNode read _nodeXml;
        property Invisivel: Boolean read GetInvisivel write SetInvisivel;
        property WatchDog: Boolean read _watchDog write _watchDog;
        property IndiceTreeView: Integer read GetIndiceTreeView write SetIndiceTreeView;
        property ParentTreeView: TObject read GetParentTreeView write SetParentTreeView;
        property PodeSerAtividade: Boolean read GetPodeSerAtividade;
        property NoHabilitado: Boolean read GetNoHabilitado;
        property SuportaGeracao: Boolean read GetSuportaGeracaoInterface;
        property TextoEstatico[const AVisualizarDescricao: Boolean]: string read GetTextoEstatico;
      end;
     */


}
