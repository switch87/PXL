function zetOm(bedrag) ...
  if mod(bedrag,1)>=0.75
    then bedrag:=ceil(bedrag);
    else if mod(bedrag,1)>=0.25
           then bedrag:=floor(bedrag)+0.5;
           else bedrag:=floor(bedrag);
         endif;
  endif;
  Out:=[bedrag];
  Rest:=bedrag;
  Geld:=[0,500,200,100,50,20,10,5,2,1,0.5];
  for i=2 to 9 step 1
    Out:=Out|floor(Rest/Geld[i]);
    Rest:=mod(Rest,Geld[i]);
  end;
  Out:=Out|Rest;
  return Geld'|Out';
endfunction