 //initialize slider
 var slideIndex = 1;
 showSlides(slideIndex);

 //increase slide index by n
 function plusSlides(n) {
   showSlides(slideIndex += n);
 }

 //change current slide to n
 function currentSlide(n) {
   showSlides(slideIndex = n);
 }
 
 //show the slider
 function showSlides(n) {
   var i;
   var slides = document.getElementsByClassName("mySlides");
   var dots = document.getElementsByClassName("dot");
   if (n > slides.length) {slideIndex = 1}    
   if (n < 1) {slideIndex = slides.length}
   for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
   }
   for (i = 0; i < dots.length; i++) {
       dots[i].className = dots[i].className.replace(" active", "");
   }
   slides[slideIndex-1].style.display = "block";  
   dots[slideIndex-1].className += " active";
 }
 

 //hide nav bar when scrolling down and show when scrolling up
 var prevScrollpos = window.pageYOffset;
 window.onscroll = function() {
 var currentScrollPos = window.pageYOffset;
     if (prevScrollpos > currentScrollPos) {
         document.getElementById("navbar").style.top = "0";
     } else {
         document.getElementById("navbar").style.top = "-500px";
     }
     prevScrollpos = currentScrollPos;
 }


 //show pop up banner after 2 seconds
 function showPopUpBanner() {
     $('.popUpBannerBox').fadeIn("2000");
 }
 setTimeout(showPopUpBanner, 3000);

 //close pop up box
 $('.popUpBannerBox').click(function(e) {
     if ( !$(e.target).is('.popUpBannerContent, .popUpBannerContent *' ) ) {
         $('.popUpBannerBox').fadeOut("2000");
         return false;
     }
 });
 
 
 $('.closeButton').click(function() {
     $('.popUpBannerBox').fadeOut("2000");
     return false;
 });

 // Set the date we're counting down to
 var countDownDate = new Date("Feb 6, 2023 22:26:26").getTime();

 // Update the countdown every 1 second
 var x = setInterval(function() {

 // Get today's date and time
 var now = new Date().getTime();
     
 // Find the distance between now and the countdown date
 var distance = countDownDate - now;
     
 // Time calculations for days, hours, minutes and seconds
 var days = Math.floor(distance / (1000 * 60 * 60 * 24));
 var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
 var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
 var seconds = Math.floor((distance % (1000 * 60)) / 1000);
     
 // Output the result in an element with id="timer"
 document.getElementById("timer").innerHTML = days + "d " + hours + "h "
 + minutes + "m " + seconds + "s ";
     
 // If the countdown is over, replace with some text 
 if (distance < 0) {
     clearInterval(x);
 document.getElementById("timer").innerHTML = "Our New Collection is Here!";
 }
 }, 1000);
 