export class Animal {
    id: number;
    name: string;
    raca: string;
    peso: number;

    constructor(id: number,
                name: string,
                raca: string,
                peso: number){
        this.id = id;
        this.name = name;
        this.peso = peso;
        this.raca = raca;
    }
}

Animal[] = new List<Animal>;

