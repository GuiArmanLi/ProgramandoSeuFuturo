import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CosmeticoService {

  constructor(private http: HttpClient) { }

  public getCosmeticos(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/cosmeticos');
  }

}
