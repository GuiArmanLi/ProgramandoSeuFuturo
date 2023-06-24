import Funcionario  from "./funcionario";

export default class Gestor implements Funcionario{
    nome: string;
    funcional: number;
    cargo: string;
    nomeGestor: string[];

    constructor(
                nome: string,
                funcional: number,
                cargo: string,
                nomeSubordinado: string[])
{
    this.nome = nome;
    this.funcional = funcional;
    this.cargo = cargo;
    this.nomeGestor = nomeSubordinado;
}
}