function winst(k,x) ...
  x:=x/1000;
  // bereken de kosten
  if x<=6
    then kost:=round((-5/6*x^2+10*x+15)*100,2);
    else kost:=round((3/2*x^2-18*x+99)*100,2);
  endif
  // bereken de omzet
  omzet:=round(k*x,2);
  // bereken de winst
  return omzet-kost;
endfunction