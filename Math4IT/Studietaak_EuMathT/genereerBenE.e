function genereer() ...
  x:=intrandom(499)+1;
  y:=intrandom(499)+1;
  if x>y
    then return {y,x}
    else rerurn {x,y}
endfunction