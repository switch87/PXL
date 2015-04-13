function codeerSub(tekst, sleutel) ...
  len:=strlen(tekst);
  code:="";
  for i=1 to len step 1;
    kar:=substring(tekst,i,i);
    numkar:=ascii(kar);
    numcod:=numkar+sleutel;
    num:=mod(numcod,256);
    codkar:=char(num);
    code=code|codkar;
    end;
  return code
endfunction
