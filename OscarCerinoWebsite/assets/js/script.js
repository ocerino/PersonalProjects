function fnCalculateAge(){
    // convert user input value into date object
    var birthDate = new Date("05/12/2000");
    
    // get difference from current date;
    var difference=Date.now() - birthDate.getTime(); 
         
    var  ageDate = new Date(difference); 
    var calculatedAge=   Math.abs(ageDate.getUTCFullYear() - 1970);
    document.getElementById("age").innerHTML = calculatedAge;
}

var navbar = document.getElementById("nav");
var links = navbar.getElementsByClassName("nav-link");
for (var i = 0; i < links.length; i++) {
  links[i].addEventListener("click", function() {
  var current = document.getElementsByClassName("active");
  current[0].className = current[0].className.replace(" active", "");
  this.className += " active";
  });
}

var sticky = navbar.offsetTop;
window.onscroll = function() {
if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky")
  } else {
    navbar.classList.remove("sticky");
  }
}

fnCalculateAge();

// emailE = 'gmail.com';
// emailE = ('codebyoc' + '@' + emailE);
// document.write('<a href="mailto:' + emailE + '" class="fa fa-envelope"></a>')
                          