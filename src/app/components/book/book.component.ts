import { RestService } from './../../services/rest.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  books : any;

  constructor(private restService : RestService) { }

  ngOnInit(): void {
    this.restService.getAllBooks().subscribe((data)=>this.books=data);
  }
}
