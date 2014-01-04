function fibs_4million(){
  var fibs = function(i,j){
    if (i < 1) {
      return 0;
    }else{var temp = i;
      i= j;
      j += temp;}
      return j;
    }
    return fibs;
}