package com.talios;

import com.github.sviperll.adt4j.GeneratePredicate;
import com.github.sviperll.adt4j.GenerateValueClassForVisitor;
import com.github.sviperll.adt4j.Getter;
import com.github.sviperll.adt4j.Visitor;

import java.time.LocalDate;

@GenerateValueClassForVisitor(isPublic = true)
@Visitor(resultVariableName = "R")
public interface DataTypeVisitor<R> {

  R one(@Getter final LocalDate date, @Getter final Integer id, SomeData someData);

  @GeneratePredicate(name = "isFinal")
  R two(@Getter final LocalDate date, @Getter final Integer id);

}
