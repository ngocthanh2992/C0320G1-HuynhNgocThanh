import { Component, OnInit } from '@angular/core';
import {DateUtilService} from "../date-util.service";

@Component({
  selector: 'app-date-util',
  templateUrl: './date-util.component.html',
  styleUrls: ['./date-util.component.css']
})
export class DateUtilComponent implements OnInit {
  output ="";

  constructor(private dateUtilService: DateUtilService) { }

  ngOnInit() {
  }

  onChange(value){
    this.output = this.dateUtilService.getDiffToNow(value);
  }
}
