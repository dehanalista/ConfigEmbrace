package br.ind.scenario.embrace.config.model.global;

import br.ind.scenario.embrace.config.model.interfaces.ItemTreeView;
import br.ind.scenario.embrace.config.model.interfaces.PastaAmbiente;

import java.util.List;

public class Ambiente extends Node {

    private List<ItemTreeView> listaItensTreeView;
    private List<Ambiente> listaAmbientes;
    private List<PastaAmbiente> listaPastas;
    private List<ItensAmbiente> listaItensAmbiente;

    private Projeto projeto;
    private Ambiente ambiente;
    private Ambiente macroAtividades;
    private boolean _interface;
    private String imagemAmbiente;
    private boolean atividade;

    /*
    TAmbiente = class(TNode, INode, IItemTreeView, IItensContainer)
    private
        procedure CriarAmbiente(AInterface: Boolean); overload;
        procedure CriarAmbiente(AXml: IXMLNode; AAtualizacao: IAtualizacaoProgresso; AInterface: Boolean); overload;

        function GetAmbiente: TAmbiente;
        function GetProjeto: TProjeto;
        function GetItemTreeView(const AIndice: Integer): IItemTreeView;
        function GetMacroAtividades: IItensContainer;
        function GetInterfacePasta: Boolean;

        procedure InserirListaAmbiente(AAmbiente: TAmbiente);
        procedure InserirListaItensAmbiente(AItemAmbiente: TItensAmbiente);
        procedure RemoverAmbiente(AAmbiente: TAmbiente);
        procedure RemoverItensAmbiente(AItemAmbiente: TItensAmbiente);
        procedure RemoverPasta(const APasta: IPastaAmbiente);
        procedure AdicionarPasta(const APasta: IPastaAmbiente);
        procedure RenomearItem(const AItem: IItemTreeView);

        function GetAmbienteSalaAutomacao: TAmbiente;

    protected
        function GetNomeNode: string; override;

    public
        constructor Create(ANome: string; AId: Integer; AProjeto: TProjeto; AInterface: Boolean); overload;
        constructor Create(ANome: string; AId: Integer; AAmbiente: TAmbiente; AInterface: Boolean); overload;
        constructor Create(AXml: IXMLNode; AProjeto: TProjeto; AAtualizacao: IAtualizacaoProgresso; AInterface: Boolean); overload;
        constructor Create(AXml: IXMLNode; AAmbiente: TAmbiente; AAtualizacao: IAtualizacaoProgresso; AInterface: Boolean); overload;
        destructor Destroy; override;

        procedure AplicarAlteracoesDriverProjeto(ADriver: TReferenciaGuiaDriver);

        function RecuperarPrimeiroAmbiente(ALeft, ARigth: Integer): Integer;

        procedure ListaInterfaceEspecifica(AInterface: TGUID; ALista: TList<IInterface>);
        procedure ListarAmbientes(ALista: TList<TAmbiente>);
        procedure ListaItemEspecifico(AClasse: TClass; ALista: TList<TItensAmbiente>); overload;
        procedure ListaItemEspecifico(AClasse: string; ALista: TList<TItensAmbiente>); overload;
        procedure ListaContainers(const ALista: TList<IItensContainer>);
        procedure CriarConexoes(AProjeto: TProjeto); override;

        function ValidarNome(ANovoNome: string): string; override;
        function DefinirIPGerenciadorRedePorMAC(AMAC, AIP: TBytes): Boolean;

        function SalvarXML(AXml: IXMLNode; AAtualizaSalvar: IAtualizacaoProgresso = nil): string; overload;

        function RecuperarItemPorID(const AId: Integer): TNode;
        function GetItemAmbiente(const AId: Integer): TItensAmbiente; overload;
        function GetItemAmbiente(ANome: string; AClasse: TClass): TItensAmbiente; overload;
        function GetItemAmbienteByPos(AIndex: Integer): TNode;
        function ExisteDispositivoDriver(ADriver: TReferenciaGuiaDriver): Boolean;
        function ListaItensAmbienteCount: Integer;
        function ListaAmbienteCount: Integer;
        function GetAmbienteByPos(AIndex: Integer): TAmbiente;
        function ValidaProjeto(AErros: TStringList; ANivelVerificacao: ETipoInconsistencia): Boolean; override;
        function PossuiAV: Boolean;
        function PossuiSensorTemperatura: Boolean;
        function PossuiRoomControl: Boolean;
        function PossuirArcondicionado: Boolean;
        function PossuiSensorMovimento: Boolean;
        function PossuiMovimento: Boolean;
        function PossuiCargaIluminacao(AplicaAosFilhos: Boolean = False): Boolean;
        function PossuiCargaFitaLed(AplicaAosFilhos: Boolean = False): Boolean;
        function RecuperarPrimeiroSensorTemperatura: TNode;
        function PossibilitaInsercao(const AItem: IItemTreeView): Boolean;
        function RecuperarAmbientePorID(const AId: Integer): TAmbiente;
        function ContItensTreeView: Integer;
        function TotalItens: Integer;
        function CriarNovaPasta: IPastaAmbiente;
        function ListaAmbientes: TList<TAmbiente>;

        procedure AdicionarObjeto(const AObject: TObject);
        procedure AdicionarItem(const AItem: IItemTreeView; const AIndice: Integer = -1);
        procedure RemoverObjeto(const AObject: TObject);
        procedure RemoverItem(const AItem: IItemTreeView);

        property ItemTreeView[const AIndice: Integer]: IItemTreeView read GetItemTreeView;
        property Ambiente: TAmbiente read GetAmbiente;
        property Projeto: TProjeto read GetProjeto;
        property MacroAtividades: IItensContainer read GetMacroAtividades;
        property InterfacePasta: Boolean read GetInterfacePasta;
        property ImagemAmbiente: string read _imagemAmbiente write _imagemAmbiente;
        property Atividade: Boolean read _atividade write _atividade;
     */

}
