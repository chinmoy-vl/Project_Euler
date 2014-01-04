
function multiples(){
  var sum = 0;
  function iter(counter){
    if (counter <1000) {
      if(counter % 3 == 0 || counter % 5 == 0){
        sum += counter;
      }
      iter((counter+1))
    }else{
      console.log(sum);
    }
  }
  iter(0);
}
multiples();