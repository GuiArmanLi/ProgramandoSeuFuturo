export class Animal {
    _id: number;
    name: string;
    raca: string;
    peso: number;

    constructor(_id: number,
                name: string,
                raca: string,
                peso: number){
        this._id = _id;
        this.name = name;
        this.raca = raca;
        this.peso = peso;
    }
}