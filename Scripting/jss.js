function main(){
// set up a new date object 
  var today = new Date();
  //extract the hour min and seconds and store them in a variable 
  var curr_hour = today.getHours();
  var curr_minute = today.getMinutes();
  var curr_second = today.getSeconds();
  var current_time = curr_hour + ":" +curr_minute + ":" +curr_second;
  console.log(current_time);
  document.getElementById("counter").innerHTML= current_time;
  document.getElementById("submit").addEventListener("click", startTime);
  
}
function startTime(){
	setInterval(main, 500);
}