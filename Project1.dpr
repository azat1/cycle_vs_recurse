program Project1;

{$APPTYPE CONSOLE}

uses
  SysUtils;

function fact_cycle(n:integer):real;
//var p:real;
begin
  Result:=1;
  while n>1 do
  begin
    Result:=Result*n;
    dec(n);
  end;

end;

function fact_for(n:integer):real;
var
  i: Integer;
begin
  Result:=1;
  for i := 2 to n do
    Result:=Result*i;
end;
function fact_rec(n:integer):real;
//var p:real;
begin
  if (n=1) then
    Result:=1 else
    Result:=n*fact_rec(n-1);
end;
var n,k,r:integer;
    timeStart,factorial_c,timeEnd:double;
begin
  try
    { TODO -oUser -cConsole Main : Insert code here }
    n:=20;
    timeStart:=Now();
    for k := 1 to 100000000 do
    begin
      factorial_c:=fact_cycle(n);
    end;
    timeEnd:=Now();
    Writeln('Cycle '+FloatToStr ((timeEnd-timeStart)*86400));

    timeStart:=Now();
    for k := 1 to 100000000 do
    begin
      factorial_c:=fact_for(n);
    end;
    timeEnd:=Now();
    Writeln('Cycle for '+FloatToStr ((timeEnd-timeStart)*86400));

    timeStart:=Now();
    for k := 1 to 100000000 do
    begin
      factorial_c:=fact_rec(n);
    end;
    timeEnd:=Now();
    Writeln('Recur '+FloatToStr ((timeEnd-timeStart)*86400));
    Readln;

  except
    on E:Exception do
      Writeln(E.Classname, ': ', E.Message);
  end;
end.
