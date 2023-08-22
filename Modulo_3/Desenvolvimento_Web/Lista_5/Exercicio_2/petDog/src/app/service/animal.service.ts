import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  constructor(private http: HttpClient) {}
  
    public getAnimais(): Observable <any> {
      return this.http.get<any>("http://localhost:8050");
    }

    public getAniaml(): Observable <any> {
      return this.http.get<any>(``);
    }
  
    public postAnimais(animal: {}): Observable <any> {
      return this.http.post<any>("", animal);
    }
}
