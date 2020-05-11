package br.ind.scenario.embrace.config.model.global;

public class Link {

//    FTipoLink: ETipoLink;
    private int index;
    //-- FPar: Integer;
    private String funcaoPadrao;
//    arrayConn: TNodeArray;


    /*
      TLink = class(TNode)
        procedure SalvarAtributosXML(noLink: IXMLNode; AIndiceMultiplo: Integer); virtual;
        function GetNomeNode: string; override;
      public
        constructor Create(AOwner: TNode; ANome: string; AIndex: Integer; ATipoLink: ETipoLink; ATipoLinkStr: string = ''; AId: Integer = 0; ANumeroMaximo: Integer = -1); overload;
        constructor Create(AXml: IXMLNode; AOwner: TNode); overload;
        destructor Destroy; override;

        function ConnectNode(node: TNode): Smallint; virtual;
        procedure DisconnectNode(node: TNode; ARecursao: Boolean = True);
        procedure DesconectarTodos;
        function SalvarXML(AXml: IXMLNode): IXMLNode; overload; override;
        function SalvarXML(AXml: IXMLNode; AIndiceMultiplo: Integer): IXMLNode; overload;
        procedure CriarConexoes(AProjeto: TProjeto); override;
        function ValidaProjeto(ANivelVerificacao: ETipoInconsistencia): Boolean; overload;
        function AceitaConexao(AObjeto: TNode): Boolean;

        property TipoLink: ETipoLink read FTipoLink write FTipoLink;
        property Indice: Smallint read FIndex write FIndex;
        property ArrConn: TNodeArray read arrayConn write arrayConn;
        property FuncaoPadrao: string read _funcaoPadrao write _funcaoPadrao;
      end;
     */
}
