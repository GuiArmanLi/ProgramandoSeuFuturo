export default interface Funcionario {
    nome: string;
    funcional: number;
    cargo: string;

    constructor(){
        this.analistas.push(new Analista("Thompson", 121314, "Analista de infraestrutura", this.gestor.nome));
    }
}