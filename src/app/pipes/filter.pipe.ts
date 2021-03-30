import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(value: any, sName: string): any {
    if (sName === "")
    {
      return value;
    }

    const booksArray : any[]=[];
    for ( let i = 0; i < value.length; i++)
    {
       let nBook:String = value[i].bookName;
       if (nBook.startsWith(sName))
      {
        booksArray.push(value[i]);
      }
    }
   
    return booksArray;
  }

}
