import { Component, OnInit } from '@angular/core';
import { AnimalService } from 'src/app/service/animal.service';

@Component({
  selector: 'app-adicionar-animal',
  templateUrl: './adicionar-animal.component.html',
  styleUrls: ['./adicionar-animal.component.css']
})
export class AdicionarAnimalComponent implements OnInit{
  public animais:any[] = [];

  constructor(private service: AnimalService){}

  ngOnInit(): void {
    this.service.getAnimais().subscribe((response:any) => {
      console.log(response);
    })
    for(let animal of response.animais){
      this.service.getInfoPokemon(pokemon.name).subscribe((res: any) => {
        this.pokemons.push(res)
      })
    }

  }
}
