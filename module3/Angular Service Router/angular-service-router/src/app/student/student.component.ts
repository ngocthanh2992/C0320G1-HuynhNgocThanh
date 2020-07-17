import { Component, OnInit } from '@angular/core';
import { STUDENTS } from '../StudentDao';
import {IStudent} from "../IStudent";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  students = STUDENTS;
  studentDetail: IStudent;

  constructor() { }

  ngOnInit() {
  }

  changeStudent(student: IStudent) {
  this.studentDetail = student;
  }

  getMark(value: any) {
  this.studentDetail.mark = value
  }
}
