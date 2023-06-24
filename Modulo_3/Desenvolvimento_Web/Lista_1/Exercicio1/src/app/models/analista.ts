import Funcionario  from "./funcionario";
import Gestor from "./gestor";

export default class Analista implements Funcionario{
    nome: string;
    funcional: number;
    cargo: string;
    nomeGestor: string;

    constructor(
                nome: string,
                funcional: number,
                cargo: string,
                nomeGestor: string)
{
    this.nome = nome;
    this.funcional = funcional;
    this.cargo = cargo;
    this.nomeGestor = nomeGestor;
}

public analista: Analista[] = new Array<Analista>();
public gestor: Gestor = new Gestor("Maria", 192076, "Gestora de TI", [])


}