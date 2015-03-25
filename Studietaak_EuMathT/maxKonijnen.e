function maxKonijnen(b,e) ...
  max:=e;
  for i=b to e step 1
    aantal:=i;
    repeat while aantal>1
      if mod(aantal,2)==0
        then aantal:=aantal/2;
      else aantal:=3*aantal+1;
        if aantal>max
          then max:=aantal;
        endif 
      endif
    end;
  end;
  return max
endfunction